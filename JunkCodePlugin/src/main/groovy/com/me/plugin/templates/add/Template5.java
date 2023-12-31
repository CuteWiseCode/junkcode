package com.me.plugin.templates.add;

import static org.objectweb.asm.Opcodes.*;


import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class Template5 {

    public static void  fillfromCode(MethodVisitor methodVisitor){
        methodVisitor.visitCode();
        Label label0 = new Label();
        methodVisitor.visitLabel(label0);
        methodVisitor.visitLineNumber(447, label0);
        methodVisitor.visitInsn(ICONST_0);
        methodVisitor.visitVarInsn(ISTORE, 1);
        Label label1 = new Label();
        methodVisitor.visitLabel(label1);
        methodVisitor.visitLineNumber(448, label1);
        methodVisitor.visitIntInsn(BIPUSH, 10);
        methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
        methodVisitor.visitVarInsn(ASTORE, 2);
        Label label2 = new Label();
        methodVisitor.visitLabel(label2);
        methodVisitor.visitLineNumber(449, label2);
        methodVisitor.visitInsn(ICONST_0);
        methodVisitor.visitVarInsn(ISTORE, 3);
        Label label3 = new Label();
        methodVisitor.visitLabel(label3);
        methodVisitor.visitLineNumber(450, label3);
        methodVisitor.visitIntInsn(BIPUSH, 10);
        methodVisitor.visitVarInsn(ISTORE, 4);
        Label label4 = new Label();
        methodVisitor.visitLabel(label4);
        methodVisitor.visitLineNumber(451, label4);
        methodVisitor.visitInsn(ACONST_NULL);
        methodVisitor.visitVarInsn(ASTORE, 5);
        Label label5 = new Label();
        methodVisitor.visitLabel(label5);
        methodVisitor.visitLineNumber(453, label5);
        methodVisitor.visitVarInsn(ALOAD, 2);
        methodVisitor.visitVarInsn(ILOAD, 3);
        methodVisitor.visitInsn(BALOAD);
        methodVisitor.visitIntInsn(SIPUSH, 255);
        methodVisitor.visitInsn(IAND);
        methodVisitor.visitVarInsn(ISTORE, 6);
        Label label6 = new Label();
        methodVisitor.visitLabel(label6);
        methodVisitor.visitLineNumber(454, label6);
        methodVisitor.visitVarInsn(ALOAD, 2);
        methodVisitor.visitVarInsn(ILOAD, 3);
        methodVisitor.visitInsn(ICONST_1);
        methodVisitor.visitInsn(IADD);
        methodVisitor.visitInsn(BALOAD);
        methodVisitor.visitIntInsn(SIPUSH, 255);
        methodVisitor.visitInsn(IAND);
        methodVisitor.visitVarInsn(ISTORE, 7);
        Label label7 = new Label();
        methodVisitor.visitLabel(label7);
        methodVisitor.visitLineNumber(455, label7);
        methodVisitor.visitVarInsn(ALOAD, 2);
        methodVisitor.visitVarInsn(ILOAD, 3);
        methodVisitor.visitInsn(ICONST_2);
        methodVisitor.visitInsn(IADD);
        methodVisitor.visitInsn(BALOAD);
        methodVisitor.visitIntInsn(SIPUSH, 255);
        methodVisitor.visitInsn(IAND);
        methodVisitor.visitVarInsn(ISTORE, 8);
        Label label8 = new Label();
        methodVisitor.visitLabel(label8);
        methodVisitor.visitLineNumber(456, label8);
        methodVisitor.visitVarInsn(ALOAD, 2);
        methodVisitor.visitVarInsn(ILOAD, 3);
        methodVisitor.visitInsn(ICONST_3);
        methodVisitor.visitInsn(IADD);
        methodVisitor.visitInsn(BALOAD);
        methodVisitor.visitIntInsn(SIPUSH, 255);
        methodVisitor.visitInsn(IAND);
        methodVisitor.visitVarInsn(ISTORE, 9);
        Label label9 = new Label();
        methodVisitor.visitLabel(label9);
        methodVisitor.visitLineNumber(458, label9);
        methodVisitor.visitVarInsn(ILOAD, 6);
        Label label10 = new Label();
        Label label11 = new Label();
        Label label12 = new Label();
        Label label13 = new Label();
        Label label14 = new Label();
        methodVisitor.visitLookupSwitchInsn(label14, new int[] { 0, 239, 254, 255 }, new Label[] { label10, label11, label12, label13 });
        methodVisitor.visitLabel(label11);
        methodVisitor.visitLineNumber(460, label11);
        methodVisitor.visitVarInsn(ILOAD, 7);
        methodVisitor.visitIntInsn(SIPUSH, 187);
        methodVisitor.visitJumpInsn(IF_ICMPNE, label14);
        methodVisitor.visitVarInsn(ILOAD, 8);
        methodVisitor.visitIntInsn(SIPUSH, 191);
        methodVisitor.visitJumpInsn(IF_ICMPNE, label14);
        Label label15 = new Label();
        methodVisitor.visitLabel(label15);
        methodVisitor.visitLineNumber(461, label15);
        methodVisitor.visitLdcInsn("UTF_8");
        methodVisitor.visitVarInsn(ASTORE, 5);
        methodVisitor.visitJumpInsn(GOTO, label14);
        methodVisitor.visitLabel(label12);
        methodVisitor.visitLineNumber(465, label12);
        methodVisitor.visitVarInsn(ILOAD, 7);
        methodVisitor.visitIntInsn(SIPUSH, 255);
        Label label16 = new Label();
        methodVisitor.visitJumpInsn(IF_ICMPNE, label16);
        methodVisitor.visitVarInsn(ILOAD, 8);
        methodVisitor.visitJumpInsn(IFNE, label16);
        methodVisitor.visitVarInsn(ILOAD, 9);
        methodVisitor.visitJumpInsn(IFNE, label16);
        Label label17 = new Label();
        methodVisitor.visitLabel(label17);
        methodVisitor.visitLineNumber(466, label17);
        methodVisitor.visitLdcInsn("ISO_10646_UCS_4_3412");
        methodVisitor.visitVarInsn(ASTORE, 5);
        methodVisitor.visitJumpInsn(GOTO, label14);
        methodVisitor.visitLabel(label16);
        methodVisitor.visitLineNumber(467, label16);
        methodVisitor.visitVarInsn(ILOAD, 7);
        methodVisitor.visitIntInsn(SIPUSH, 255);
        methodVisitor.visitJumpInsn(IF_ICMPNE, label14);
        Label label18 = new Label();
        methodVisitor.visitLabel(label18);
        methodVisitor.visitLineNumber(468, label18);
        methodVisitor.visitLdcInsn("UTF_16BE");
        methodVisitor.visitVarInsn(ASTORE, 5);
        methodVisitor.visitJumpInsn(GOTO, label14);
        methodVisitor.visitLabel(label10);
        methodVisitor.visitLineNumber(472, label10);
        methodVisitor.visitVarInsn(ILOAD, 7);
        Label label19 = new Label();
        methodVisitor.visitJumpInsn(IFNE, label19);
        methodVisitor.visitVarInsn(ILOAD, 8);
        methodVisitor.visitIntInsn(SIPUSH, 254);
        methodVisitor.visitJumpInsn(IF_ICMPNE, label19);
        methodVisitor.visitVarInsn(ILOAD, 9);
        methodVisitor.visitIntInsn(SIPUSH, 255);
        methodVisitor.visitJumpInsn(IF_ICMPNE, label19);
        Label label20 = new Label();
        methodVisitor.visitLabel(label20);
        methodVisitor.visitLineNumber(473, label20);
        methodVisitor.visitLdcInsn("UTF_32BE");
        methodVisitor.visitVarInsn(ASTORE, 5);
        methodVisitor.visitJumpInsn(GOTO, label14);
        methodVisitor.visitLabel(label19);
        methodVisitor.visitLineNumber(474, label19);
        methodVisitor.visitVarInsn(ILOAD, 7);
        methodVisitor.visitJumpInsn(IFNE, label14);
        methodVisitor.visitVarInsn(ILOAD, 8);
        methodVisitor.visitIntInsn(SIPUSH, 255);
        methodVisitor.visitJumpInsn(IF_ICMPNE, label14);
        methodVisitor.visitVarInsn(ILOAD, 9);
        methodVisitor.visitIntInsn(SIPUSH, 254);
        methodVisitor.visitJumpInsn(IF_ICMPNE, label14);
        Label label21 = new Label();
        methodVisitor.visitLabel(label21);
        methodVisitor.visitLineNumber(475, label21);
        methodVisitor.visitLdcInsn("ISO_10646_UCS_4_2143");
        methodVisitor.visitVarInsn(ASTORE, 5);
        methodVisitor.visitJumpInsn(GOTO, label14);
        methodVisitor.visitLabel(label13);
        methodVisitor.visitLineNumber(479, label13);
        methodVisitor.visitVarInsn(ILOAD, 7);
        methodVisitor.visitIntInsn(SIPUSH, 254);
        Label label22 = new Label();
        methodVisitor.visitJumpInsn(IF_ICMPNE, label22);
        methodVisitor.visitVarInsn(ILOAD, 8);
        methodVisitor.visitJumpInsn(IFNE, label22);
        methodVisitor.visitVarInsn(ILOAD, 9);
        methodVisitor.visitJumpInsn(IFNE, label22);
        Label label23 = new Label();
        methodVisitor.visitLabel(label23);
        methodVisitor.visitLineNumber(480, label23);
        methodVisitor.visitLdcInsn("UTF_32LE");
        methodVisitor.visitVarInsn(ASTORE, 5);
        methodVisitor.visitJumpInsn(GOTO, label14);
        methodVisitor.visitLabel(label22);
        methodVisitor.visitLineNumber(481, label22);
        methodVisitor.visitVarInsn(ILOAD, 7);
        methodVisitor.visitIntInsn(SIPUSH, 254);
        methodVisitor.visitJumpInsn(IF_ICMPNE, label14);
        Label label24 = new Label();
        methodVisitor.visitLabel(label24);
        methodVisitor.visitLineNumber(482, label24);
        methodVisitor.visitLdcInsn("UTF_16LE");
        methodVisitor.visitVarInsn(ASTORE, 5);
        methodVisitor.visitLabel(label14);
        methodVisitor.visitLineNumber(487, label14);
        methodVisitor.visitVarInsn(ALOAD, 5);
        Label label25 = new Label();
        methodVisitor.visitJumpInsn(IFNULL, label25);
        Label label26 = new Label();
        methodVisitor.visitLabel(label26);
        methodVisitor.visitLineNumber(488, label26);
        methodVisitor.visitInsn(RETURN);
        methodVisitor.visitLabel(label25);
        methodVisitor.visitLineNumber(490, label25);
        methodVisitor.visitVarInsn(ILOAD, 3);
        methodVisitor.visitVarInsn(ILOAD, 4);
        methodVisitor.visitInsn(IADD);
        methodVisitor.visitVarInsn(ISTORE, 10);
        Label label27 = new Label();
        methodVisitor.visitLabel(label27);
        methodVisitor.visitLineNumber(491, label27);
        methodVisitor.visitVarInsn(ILOAD, 3);
        methodVisitor.visitVarInsn(ISTORE, 11);
        Label label28 = new Label();
        methodVisitor.visitLabel(label28);
        methodVisitor.visitVarInsn(ILOAD, 11);
        methodVisitor.visitVarInsn(ILOAD, 10);
        Label label29 = new Label();
        methodVisitor.visitJumpInsn(IF_ICMPGE, label29);
        Label label30 = new Label();
        methodVisitor.visitLabel(label30);
        methodVisitor.visitLineNumber(492, label30);
        methodVisitor.visitVarInsn(ALOAD, 2);
        methodVisitor.visitVarInsn(ILOAD, 11);
        methodVisitor.visitInsn(BALOAD);
        methodVisitor.visitIntInsn(SIPUSH, 255);
        methodVisitor.visitInsn(IAND);
        methodVisitor.visitVarInsn(ISTORE, 12);
        Label label31 = new Label();
        methodVisitor.visitLabel(label31);
        methodVisitor.visitLineNumber(493, label31);
        methodVisitor.visitVarInsn(ILOAD, 12);
        methodVisitor.visitIntInsn(SIPUSH, 128);
        methodVisitor.visitInsn(IAND);
        Label label32 = new Label();
        methodVisitor.visitJumpInsn(IFEQ, label32);
        methodVisitor.visitVarInsn(ILOAD, 12);
        methodVisitor.visitIntInsn(SIPUSH, 160);
        methodVisitor.visitJumpInsn(IF_ICMPEQ, label32);
        Label label33 = new Label();
        methodVisitor.visitLabel(label33);
        methodVisitor.visitLineNumber(494, label33);
        methodVisitor.visitVarInsn(ILOAD, 1);
        methodVisitor.visitInsn(ICONST_2);
        Label label34 = new Label();
        methodVisitor.visitJumpInsn(IF_ICMPEQ, label34);
        Label label35 = new Label();
        methodVisitor.visitLabel(label35);
        methodVisitor.visitLineNumber(495, label35);
        methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "()V", false);
        methodVisitor.visitJumpInsn(GOTO, label34);
        methodVisitor.visitLabel(label32);
        methodVisitor.visitLineNumber(498, label32);
        methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "()V", false);
        methodVisitor.visitLabel(label34);
        methodVisitor.visitLineNumber(491, label34);
        methodVisitor.visitIincInsn(11, 1);
        methodVisitor.visitJumpInsn(GOTO, label28);
        methodVisitor.visitLabel(label29);
        methodVisitor.visitLineNumber(502, label29);
        methodVisitor.visitInsn(RETURN);
        Label label36 = new Label();
        methodVisitor.visitLabel(label36);
        methodVisitor.visitLocalVariable("c", "I", null, label31, label34, 12);
        methodVisitor.visitLocalVariable("i", "I", null, label28, label29, 11);
        methodVisitor.visitLocalVariable("inputState", "I", null, label1, label36, 1);
        methodVisitor.visitLocalVariable("buf", "[B", null, label2, label36, 2);
        methodVisitor.visitLocalVariable("offset", "I", null, label3, label36, 3);
        methodVisitor.visitLocalVariable("length", "I", null, label4, label36, 4);
        methodVisitor.visitLocalVariable("detectedCharset", "Ljava/lang/String;", null, label5, label36, 5);
        methodVisitor.visitLocalVariable("b1", "I", null, label6, label36, 6);
        methodVisitor.visitLocalVariable("b2", "I", null, label7, label36, 7);
        methodVisitor.visitLocalVariable("b3", "I", null, label8, label36, 8);
        methodVisitor.visitLocalVariable("b4", "I", null, label9, label36, 9);
        methodVisitor.visitLocalVariable("maxPos", "I", null, label27, label36, 10);
        methodVisitor.visitMaxs(3, 13);
        methodVisitor.visitEnd();
    }
}
