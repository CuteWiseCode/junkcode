package com.me.plugin

import com.android.build.api.transform.*
import com.android.build.gradle.internal.pipeline.TransformManager
import com.android.utils.FileUtils
import com.google.gson.Gson
import com.me.plugin.ext.JunkCodeConfig
import com.me.plugin.ext.JunkCodeExtension
import org.apache.commons.codec.digest.DigestUtils
import org.apache.commons.io.IOUtils
import org.gradle.api.Project
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.tree.ClassNode

import java.util.jar.JarEntry
import java.util.jar.JarFile
import java.util.jar.JarOutputStream
import java.util.zip.ZipEntry

/**
 * @Desc: JunkCodeTransform
 */
class JunkCodeTransform extends Transform {


    def mProject
    def static mContent
    static JunkCodeExtension junkCodeExtension
    static JunkCodeConfig junkCodeConfig
    def final DEFAULT_CONFIG_FILE_NAME = "junkcode_config.json"
    def final EXT_NAME = "junkcode"

    void setProject(mProject) {
        this.mProject = mProject
        mProject.extensions.create(EXT_NAME, JunkCodeExtension.class)
        mProject.afterEvaluate({
            junkCodeExtension = mProject.extensions.getByName(EXT_NAME)
            if (junkCodeExtension == null || !junkCodeExtension.enable)
                return
            try {
                loadFileConfig(mProject)
            } catch (Throwable e) {
                log("loadFileHexConfig error" + e.toString())
            }
        })


    }

    @Override
    String getName() {
        return "JunkCodeTransform"
    }

    @Override
    Set<QualifiedContent.ContentType> getInputTypes() {
        return TransformManager.CONTENT_CLASS
    }

    @Override
    Set<? super QualifiedContent.Scope> getScopes() {
        return TransformManager.SCOPE_FULL_PROJECT
    }

    @Override
    boolean isIncremental() {
        return false
    }

    @Override
    void transform(TransformInvocation transformInvocation) throws TransformException, InterruptedException, IOException {
        super.transform(transformInvocation)
        handleTransform(transformInvocation)
    }


    /**
     * to handle transform
     * @param inputParam
     * @param transformInvocation
     */
    void handleTransform(TransformInvocation transformInvocation) {
        TransformOutputProvider outputProvider = transformInvocation.getOutputProvider()
        if (!isIncremental())
            outputProvider.deleteAll()

        //得到所有的输入
        Collection<TransformInput> inputs = transformInvocation.getInputs()

        inputs.each { it ->

            println "directory inputs ------->"
            it.directoryInputs.each {
                handleDirectoryInput(it, outputProvider)
            }

            println " jar inputs ------->"
            it.jarInputs.each { jarInput ->
                handleJarInput(jarInput, outputProvider)
            }

        }
    }

    /**
     * 处理Jar中的class文件
     * @param src
     * @param dest
     */
    static void handleJarInput(JarInput jarInput, TransformOutputProvider outputProvider) {

        println "jarInput.file.name  ------->:  ${jarInput.file.name}"
        if (jarInput.file.getAbsolutePath().endsWith(".jar")) {
            //重名名输出文件,因为可能同名,会覆盖
            def jarName = jarInput.name
            def md5Name = DigestUtils.md5Hex(jarInput.file.absolutePath)
            if (jarName.endsWith(".jar")) {
                jarName = jarName.substring(0, jarName.length() - 4)
            }
            JarFile jarFile = new JarFile(jarInput.file)
            Enumeration enumeration = jarFile.entries()
            File tempFile = new File(jarInput.file.parent + File.separator + "temp.jar")
            //避免上次的缓存被重复插入
            if (tempFile.exists()) {
                tempFile.delete()
            }
            JarOutputStream jarOutputStream = new JarOutputStream(new FileOutputStream(tempFile))
            //保存
            while (enumeration.hasMoreElements()) {
                JarEntry jarEntry = enumeration.nextElement()
                String entryName = jarEntry.name
                ZipEntry zipEntry = new ZipEntry(entryName)
                InputStream inputStream = jarFile.getInputStream(zipEntry)
                jarOutputStream.putNextEntry(zipEntry)
                if (isClassFile(entryName) && isClassNeededAddJunkCode(entryName, "/")) {
                    println("-------------- handle jar file:<$entryName> --------------------")
                    byte[] bytes = addJunkCode(entryName, IOUtils.toByteArray(inputStream))
                    jarOutputStream.write(bytes)
                } else {
                    jarOutputStream.write(IOUtils.toByteArray(inputStream))
                }
                jarOutputStream.closeEntry()
            }
            jarOutputStream.close()
            jarFile.close()
            def dest = outputProvider.getContentLocation(jarName + "_" + md5Name, jarInput.contentTypes, jarInput.scopes, Format.JAR)
            FileUtils.copyFile(tempFile, dest)
            tempFile.delete()
        }
    }

    /**
     * 处理目录下的class文件
     * @param directoryInput
     * @param outputProvider
     */
//    static void handleDirectoryInput(DirectoryInput directoryInput, TransformOutputProvider outputProvider) {
////        println("-------------------- handle class file:<$directoryInput.name> --------------------")
//        def dest = outputProvider.getContentLocation(directoryInput.name, directoryInput.contentTypes, directoryInput.scopes, Format.DIRECTORY)
//        FileUtils.copyDirectory(directoryInput.file, dest)
//    }

    /**
     * 处理目录下的class文件
     * @param directoryInput
     * @param outputProvider
     */
    static void handleDirectoryInput(DirectoryInput directoryInput, TransformOutputProvider outputProvider) {
        //是否为目录
        if (directoryInput.file.isDirectory()) {
            //列出目录所有文件（包含子文件夹，子文件夹内文件）
            directoryInput.file.eachFileRecurse {
                file ->
                    def name = file.name
                    addJunkCodeIfNeeded(name, file)
            }
        }
        def dest = outputProvider.getContentLocation(directoryInput.name, directoryInput.contentTypes, directoryInput.scopes, Format.DIRECTORY)
        FileUtils.copyDirectory(directoryInput.file, dest)
    }

    private static void addJunkCodeIfNeeded(String name, File file) {
        if (isClassFile(name) && isClassNeededAddJunkCode(file.absolutePath, File.separator)) {
            println("-------------------- handle class file:<$name> --------------------")
            byte[] bytes = addJunkCode(name, file.bytes)
            FileOutputStream fileOutputStream = new FileOutputStream(file.parentFile.absolutePath + File.separator + name)
            fileOutputStream.write(bytes)
            fileOutputStream.close()
        }
    }


    /**
     * 添加垃圾代码
     * @return
     */
    private static byte[] addJunkCode(String name, byte[] bytes) {
        log("addJunkCode , clazz = ${name}")
        ClassReader classReader = new ClassReader(bytes)


        log("addJunkCode , access = ${classReader.access}")
        ClassWriter classWriter = new ClassWriter(classReader, ClassWriter.COMPUTE_MAXS)

        //转换成classnode
        ClassNode classNode = new ClassNode()
        classReader.accept(classNode, ClassReader.EXPAND_FRAMES)


        classNode.methods.forEach({

            if(it.localVariables!= null)
            log("  ********** classNode.methods= ${it.localVariables.size()}")
        })




        ClassVisitor classVisitor = new JunkCodeClassVisitor(classWriter, name,classNode.methods)
        classReader.accept(classVisitor, ClassReader.EXPAND_FRAMES)


        // 获取原有方法并打乱顺序
//        ClassReader ranCR = new ClassReader(  classWriter.toByteArray())
//        ClassNode classNode = new ClassNode()
//        ranCR.accept(classNode, 0)
//
//        classNode.methods.forEach({
//
//        log("打乱前：-》 ${it.name}")
//        })
//        Collections.shuffle(classNode.methods)
//
//
//        log("addJunkCode , messy methods order ,size = ${classNode.methods.size()}")
//        ClassWriter ranCW  = new ClassWriter( ClassWriter.COMPUTE_MAXS)
//        classNode.accept(ranCW)
//
//        classNode.methods.forEach({
//
//            log("打乱后：-》 ${it.name}")
//        })

        return classWriter.toByteArray()
    }

    /**
     * 判断是否为需要处理class文件
     * @param name
     * @return
     */
    static boolean isClassFile(String name) {
        return (name.endsWith(".class") && !name.contains("R\$")
                && !name.contains("R.class") && "BuildConfig.class" != name)
    }

    static boolean isClassNeededAddJunkCode(String name, String seperator) {
        if (junkCodeConfig?.junkPackages)
            for (filename in junkCodeConfig?.junkPackages) {

                filename = filename.replace(".", seperator)
                log("isClassNeededAddJunkCode path ${name} item ${filename}")

                if (name.contains(filename)) {
                    log("isClassNeededAddJunkCode true ")
                    return true
                }
            }
        return false
    }

    void loadFileConfig(Project project) {
        try {
            def configFile = findConfigFile(project)
            if (configFile == null)
                throw new FileNotFoundException("junkcode config file not found,please place a file named 'junkcode_config.json' to rootProject's rootdir or your custom dir")

            def content = configFile.getText()

            junkCodeConfig = new Gson().fromJson(content, JunkCodeConfig.class)
        } catch (Throwable e) {
            throw new RuntimeException("read junkcode config file error", e)
        }
    }

    private File findConfigFile(Project project) {

        File file = null
        if (!junkCodeExtension.configFile.isEmpty()) {
            file = new File(junkCodeExtension.configFile)
            if (file.exists()) {
                log("junkcode config file found,path=${file.path}")
                return file
            }
        }
        file = new File(project.rootProject.projectDir, DEFAULT_CONFIG_FILE_NAME)
        if (file.exists()) {
            log("junkcode config file found in root dir,path=${file.path}")
            return file
        }
        return null
    }

    static void log(String name) {
        println("junkcode >>>: " + name)
    }
}
