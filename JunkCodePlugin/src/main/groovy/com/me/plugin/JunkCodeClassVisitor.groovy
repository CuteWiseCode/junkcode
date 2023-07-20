package com.me.plugin


import com.me.plugin.templates.add.Template1
import com.me.plugin.templates.add.Template10
import com.me.plugin.templates.add.Template11
import com.me.plugin.templates.add.Template12
import com.me.plugin.templates.add.Template13
import com.me.plugin.templates.add.Template14
import com.me.plugin.templates.add.Template15
import com.me.plugin.templates.add.Template16
import com.me.plugin.templates.add.Template17
import com.me.plugin.templates.add.Template18
import com.me.plugin.templates.add.Template19
import com.me.plugin.templates.add.Template2
import com.me.plugin.templates.add.Template20
import com.me.plugin.templates.add.Template3
import com.me.plugin.templates.add.Template4
import com.me.plugin.templates.add.Template5
import com.me.plugin.templates.add.Template6
import com.me.plugin.templates.add.Template7
import com.me.plugin.templates.add.Template8
import com.me.plugin.templates.add.Template9
import com.me.plugin.utils.RandomUtil
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.FieldVisitor
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes
import org.objectweb.asm.tree.MethodNode

/**
 * @Desc:
 */
class JunkCodeClassVisitor extends ClassVisitor {

    def mFilename
    def mAccess
    def mClassName
    boolean isInterface = false
    boolean isAbstractClazz = false

    List<MethodNode> methodNodeList


    JunkCodeClassVisitor(ClassVisitor classVisitor, String filename, List<MethodNode> classNode) {
        super(Opcodes.ASM5, classVisitor)
        mFilename = filename
        methodNodeList = classNode

    }

    @Override
    void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        super.visit(version, access, name, signature, superName, interfaces)
        mAccess = access
        mClassName = name
        this.isInterface = (access & Opcodes.ACC_INTERFACE) != 0
        this.isAbstractClazz = (access & Opcodes.ACC_ABSTRACT) != 0
        JunkCodeTransform.log("isInterface: " + isInterface)
        JunkCodeTransform.log("isAbstractClazz: " + isAbstractClazz)
    }

    @Override
    MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
        MethodVisitor mv = super.visitMethod(access, name, descriptor, signature, exceptions)
        JunkCodeTransform.log("visitMethod: $name")
        if (!isInterface && !isAbstractClazz && !name.contains("init>") && name != "onCreate") {

            int index = 1
//            MethodNode methodNode = methodNodeList.find { (it.name = name) && (it.desc = descriptor) }
            MethodNode methodNode
            methodNodeList.forEach({
                if (it.name == name && it.desc == descriptor) {
                    if (it.localVariables != null)
                        index = it.localVariables.size()
                }
            })

//            if (methodNode != null)
//            {
//                index = methodNode.localVariables.size()
//                JunkCodeTransform.log("methodNodeList.find: ${ index}")
//            }


            mv = new JunkCodeMethodAdapterVisitor(mv, access, name, descriptor, mClassName, Random.newInstance().nextInt(2), index)
        }
        return mv
    }

    @Override
    FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
        FieldVisitor fv = super.visitField(access, name, descriptor, signature, value)
        return fv
    }


    @Override
    void visitEnd() {
        JunkCodeTransform.log("class visitEnd************************")
        RandomUtil.getInstance().getRandomInteger(0, false)
        if (!isInterface) {
            for (i in 0..<Random.newInstance().nextInt(6)) {
                def str = RandomUtil.genRandomStr()
                def fv = cv.visitField(RandomUtil.getOpcode(), str, RandomUtil.getDescriptor(), null, null)
//              def av = fv.visitAnnotation("Landroidx/annotation/Keep;", true)
                if (fv != null) {
                    JunkCodeTransform.log("add field ${str} by random************************")
                    fv.visitEnd()
//                  av.visitEnd()
                } else {
                    super.visitEnd()
                }
            }

            //如果不是接口，同时不是抽象类则不进行插桩
            if (!isInterface && !isAbstractClazz) {

                for (i in 0..<RandomUtil.getRandomNumber(5)) {
                    def methodName = RandomUtil.genRandomStr()
                    MethodVisitor mv = cv.visitMethod(RandomUtil.opcode, methodName, "()V", null, null)
                    if (mv != null) {

                        int ran = Random.newInstance().nextInt(4)
                        switch (ran) {
                            case 0:

                                generateMethod(mv, i + 1, methodName)
                                break
                            case 1:
                                generateMethod(mv, i + 6, methodName)
                                break
                            case 2:
                                generateMethod(mv, i + 11, methodName)
                                break
                            case 3:
                                generateMethod(mv, i + 16, methodName)
                                break

                        }


                    }
                }
            }
        }
        super.visitEnd()
    }

    private static void generateMethod(MethodVisitor mv, int num, def methodName) {
        JunkCodeTransform.log("generateMethod ${methodName}")
        switch (num) {
            case 1:
                JunkCodeTransform.log("generateMethod  Template1")
                Template1.fillfromCode(mv)
                break
            case 2:
                JunkCodeTransform.log("generateMethod  Template2")
                Template2.fillfromCode(mv)
                break
            case 3:
                JunkCodeTransform.log("generateMethod  Template3")
                Template3.fillfromCode(mv)
                break
            case 4:
                JunkCodeTransform.log("generateMethod  Template4")
                Template4.fillfromCode(mv)
                break
            case 5:
                JunkCodeTransform.log("generateMethod  Template5")
                Template5.fillfromCode(mv)
                break
            case 6:
                JunkCodeTransform.log("generateMethod  Template6")
                Template6.fillfromCode(mv)
                break
            case 7:
                JunkCodeTransform.log("generateMethod  Template7")
                Template7.fillfromCode(mv)
                break
            case 8:
                JunkCodeTransform.log("generateMethod  Template8")
                Template8.fillfromCode(mv)
                break
            case 9:
                JunkCodeTransform.log("generateMethod  Template9")
                Template9.fillfromCode(mv)
                break
            case 10:
                JunkCodeTransform.log("generateMethod  Template10")
                Template10.fillfromCode(mv)
                break
            case 11:
                JunkCodeTransform.log("generateMethod  Template11")
                Template11.fillfromCode(mv)
                break
            case 12:
                JunkCodeTransform.log("generateMethod  Template12")
                Template12.fillfromCode(mv)
                break
            case 13:
                JunkCodeTransform.log("generateMethod  Template13")
                Template13.fillfromCode(mv)
                break
            case 14:
                JunkCodeTransform.log("generateMethod  Template14")
                Template14.fillfromCode(mv)
                break
            case 15:
                JunkCodeTransform.log("generateMethod  Template15")
                Template15.fillfromCode(mv)
                break
            case 16:
                JunkCodeTransform.log("generateMethod  Template16")
                Template16.fillfromCode(mv)
                break

            case 17:
                JunkCodeTransform.log("generateMethod  Template17")
                Template17.fillfromCode(mv)
                break
            case 18:
                JunkCodeTransform.log("generateMethod  Template18")
                Template18.fillfromCode(mv)
                break
            case 19:
                JunkCodeTransform.log("generateMethod  Template19")
                Template19.fillfromCode(mv)
                break
            case 20:
                JunkCodeTransform.log("generateMethod  Template20")
                Template20.fillfromCode(mv)
                break

            default:

                break
        }

    }


    int getLocalVarIndex(String name, String desc) {
        List<MethodNode> methodNodeList = mClassNode.methods

        MethodNode methodNode = methodNodeList.find { (it.name = name) && (it.desc = desc) }
        JunkCodeTransform.log("------methodNode: $methodNode.name")
        if (methodNode.parameters != null)
            JunkCodeTransform.log("------parameters: ${methodNode.parameters.size()}")
        if (methodNode.localVariables != null)
            JunkCodeTransform.log("------localVariables: ${methodNode.localVariables.size()}")
        if (methodNode.attrs != null)
            JunkCodeTransform.log("------attrs: ${methodNode.attrs.size()}")
        JunkCodeTransform.log("------maxLocals: $methodNode.maxLocals")
        if (methodNode != null && methodNode.parameters != null) {

            methodNode.parameters.forEach({ JunkCodeTransform.log("------local variable: $it.name") })
            return methodNode.parameters.size()
        } else {
            return 0
        }
    }


}
