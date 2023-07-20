package com.me.plugin


import com.me.plugin.templates.modity.Template1
import com.me.plugin.templates.modity.Template10
import com.me.plugin.templates.modity.Template11
import com.me.plugin.templates.modity.Template12
import com.me.plugin.templates.modity.Template13
import com.me.plugin.templates.modity.Template14
import com.me.plugin.templates.modity.Template15
import com.me.plugin.templates.modity.Template16
import com.me.plugin.templates.modity.Template17
import com.me.plugin.templates.modity.Template18
import com.me.plugin.templates.modity.Template19
import com.me.plugin.templates.modity.Template2
import com.me.plugin.templates.modity.Template20
import com.me.plugin.templates.modity.Template3
import com.me.plugin.templates.modity.Template4
import com.me.plugin.templates.modity.Template5
import com.me.plugin.templates.modity.Template6
import com.me.plugin.templates.modity.Template7
import com.me.plugin.templates.modity.Template8
import com.me.plugin.templates.modity.Template9
import org.objectweb.asm.Label
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes
import org.objectweb.asm.commons.AdviceAdapter;

/**
 * @Desc: 在现有方法中插入字节码
 */
class JunkCodeMethodAdapterVisitor extends AdviceAdapter {


    def mClassName
    def mRan
    public int mIndex1

    JunkCodeMethodAdapterVisitor(MethodVisitor mv, int access, String name, String desc, String className, int ran,int index) {
        super(Opcodes.ASM7, mv, access, name, desc)
        mClassName = className
        mRan = ran
        mIndex1 = index
        JunkCodeTransform.log("modifying $mClassName's method -> $name ")

    }



    @Override
    void visitLocalVariable(String name, String descriptor, String signature, Label start, Label end, int index) {
        JunkCodeTransform.log("======= visitLocalVariable  $name")

        super.visitLocalVariable(name, descriptor, signature, start, end, index)
    }

    @Override
    void visitParameter(String name, int access) {
        JunkCodeTransform.log("======= visitParameter  $name")
        super.visitParameter(name, access)
    }

    @Override
    protected void onMethodEnter() {
        JunkCodeTransform.log("======= onMethodEnter")
//        if (mRan == 0 ) {
            modifyMethod(mv,mIndex1)
//
//        }
//        Template2.modifyFromCode(mv)
    }

    @Override
    protected void onMethodExit(int opcode) {
//        if (mRan == 1 ) {
//            modifyMethod(mv)
//        }

    }


    private static void modifyMethod(MethodVisitor mv,int index) {
        //20 种随机方法模板
        int num = 1
//        int ran = RandomUtil.getInstance().getRandomInteger(num,true)
        int ran =19
        switch (ran) {
            case 0:
                JunkCodeTransform.log("modify method with Template1 index-> $index")
                Template1.modifyFromCode(mv,index)
                break
            case 1:
                JunkCodeTransform.log("modify method with Template2 index-> $index")
                Template2.modifyFromCode(mv,index)
                break
            case 2:
                JunkCodeTransform.log("modify method with Template3  index-> $index")
                Template3.modifyFromCode(mv,index)
                break
            case 3:
                JunkCodeTransform.log("modify method with Template4")
                Template4.modifyFromCode(mv,index)
                break
            case 4:
                JunkCodeTransform.log("modify method with Template5")
                Template5.modifyFromCode(mv,index)
                break
            case 5:
                JunkCodeTransform.log("modify method with Template6")
                Template6.modifyFromCode(mv,index)
                break
            case 6:
                JunkCodeTransform.log("modify method with Template7")
                Template7.modifyFromCode(mv,index)
                break
            case 7:
                JunkCodeTransform.log("modify method with Template8")
                Template8.modifyFromCode(mv,index)
                break
            case 8:
                JunkCodeTransform.log("modify method with Template9")
                Template9.modifyFromCode(mv,index)
                break
            case 9:
                JunkCodeTransform.log("modify method with Template10")
                Template10.modifyFromCode(mv,index)
                break
            case 10:
                JunkCodeTransform.log("modify method with Template11")
                Template11.modifyFromCode(mv,index)
                break
            case 11:
                JunkCodeTransform.log("modify method with Template12")
                Template12.modifyFromCode(mv,index)
                break
            case 12:
                JunkCodeTransform.log("modify method with Template13")
                Template13.modifyFromCode(mv,index)
                break
            case 13:
                JunkCodeTransform.log("modify method with Template14")
                Template14.modifyFromCode(mv,index)
                break
            case 14:
                JunkCodeTransform.log("modify method with Template15")
                Template15.modifyFromCode(mv,index)
                break
            case 15:
                JunkCodeTransform.log("modify method with Template16")
                Template16.modifyFromCode(mv,index)
                break
            case 16:
                JunkCodeTransform.log("modify method with Template17")
                Template17.modifyFromCode(mv,index)
                break
            case 17:
                JunkCodeTransform.log("modify method with Template18")
                Template18.modifyFromCode(mv,index)
                break
            case 18:
                JunkCodeTransform.log("modify method with Template19")
                Template19.modifyFromCode(mv,index)
                break
            case 19:
                JunkCodeTransform.log("modify method with Template20")
                Template20.modifyFromCode(mv,index)
                break
        }
    }


}
