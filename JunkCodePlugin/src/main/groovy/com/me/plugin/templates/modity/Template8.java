package com.me.plugin.templates.modity;

import static org.objectweb.asm.Opcodes.*;


import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class Template8 {

    public static void  modifyFromCode(MethodVisitor methodVisitor,int index){

        Label label0 = new Label();
        Label label1 = new Label();
        Label label2 = new Label();
        methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
        Label label3 = new Label();
        methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
        Label label4 = new Label();
        methodVisitor.visitLabel(label4);
        methodVisitor.visitLineNumber(44, label4);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/ClassLoader", "getSystemClassLoader", "()Ljava/lang/ClassLoader;", false);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "identityHashCode", "(Ljava/lang/Object;)I", false);
        methodVisitor.visitInsn(I2L);
        methodVisitor.visitLdcInsn(31449600000L);
        methodVisitor.visitInsn(LAND);
        methodVisitor.visitInsn(LCONST_0);
        methodVisitor.visitInsn(LCMP);
        Label label5 = new Label();
        methodVisitor.visitJumpInsn(IFNE, label5);
        Label label6 = new Label();
        methodVisitor.visitLabel(label6);
        methodVisitor.visitLineNumber(45, label6);
        methodVisitor.visitLdcInsn("abc");
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "()[B", false);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/ByteBuffer", "wrap", "([B)Ljava/nio/ByteBuffer;", false);

        int v1 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v1);
        Label label7 = new Label();
        methodVisitor.visitLabel(label7);
        methodVisitor.visitLineNumber(46, label7);
        methodVisitor.visitInsn(ICONST_0);
        methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);

        int v2 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v2);
        Label label8 = new Label();
        methodVisitor.visitLabel(label8);
        methodVisitor.visitLineNumber(47, label8);
        methodVisitor.visitTypeInsn(NEW, "java/lang/Object");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);

        int v3 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v3);
        Label label9 = new Label();
        methodVisitor.visitLabel(label9);
        methodVisitor.visitLineNumber(48, label9);
        methodVisitor.visitVarInsn(ALOAD, v1);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "remaining", "()I", false);

        int v4 = ++index;
        methodVisitor.visitVarInsn(ISTORE, v4);
        Label label10 = new Label();
        methodVisitor.visitLabel(label10);
        methodVisitor.visitLineNumber(49, label10);
        methodVisitor.visitVarInsn(ALOAD, v3);
        methodVisitor.visitInsn(DUP);

        int v5 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v5);
        methodVisitor.visitInsn(MONITORENTER);
        methodVisitor.visitLabel(label0);
        methodVisitor.visitLineNumber(50, label0);
        methodVisitor.visitVarInsn(ILOAD, v4);
        Label label11 = new Label();
        methodVisitor.visitJumpInsn(IFLE, label11);
        Label label12 = new Label();
        methodVisitor.visitLabel(label12);
        methodVisitor.visitLineNumber(51, label12);
        methodVisitor.visitVarInsn(ILOAD, v4);
        methodVisitor.visitInsn(ICONST_0);
        methodVisitor.visitInsn(IADD);
        methodVisitor.visitIntInsn(SIPUSH, 8192);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "min", "(II)I", false);

        int v6 = ++index;
        methodVisitor.visitVarInsn(ISTORE, v6);
        Label label13 = new Label();
        methodVisitor.visitLabel(label13);
        methodVisitor.visitLineNumber(52, label13);
        methodVisitor.visitVarInsn(ALOAD, v2);
        methodVisitor.visitInsn(ARRAYLENGTH);
        methodVisitor.visitVarInsn(ILOAD, v6);
        Label label14 = new Label();
        methodVisitor.visitJumpInsn(IF_ICMPGE, label14);
        Label label15 = new Label();
        methodVisitor.visitLabel(label15);
        methodVisitor.visitLineNumber(53, label15);
        methodVisitor.visitVarInsn(ILOAD, v6);
        methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
        methodVisitor.visitVarInsn(ASTORE, v2);
        methodVisitor.visitLabel(label14);
        methodVisitor.visitLineNumber(55, label14);
        methodVisitor.visitVarInsn(ALOAD, v1);
        methodVisitor.visitVarInsn(ALOAD, v2);
        methodVisitor.visitInsn(ICONST_0);
        methodVisitor.visitInsn(ICONST_0);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "put", "([BII)Ljava/nio/ByteBuffer;", false);
        methodVisitor.visitInsn(POP);
        Label label16 = new Label();
        methodVisitor.visitLabel(label16);
        methodVisitor.visitLineNumber(56, label16);
        methodVisitor.visitJumpInsn(GOTO, label0);
        methodVisitor.visitLabel(label11);
        methodVisitor.visitLineNumber(57, label11);
        methodVisitor.visitVarInsn(ALOAD, v5);
        methodVisitor.visitInsn(MONITOREXIT);
        methodVisitor.visitLabel(label1);
        methodVisitor.visitJumpInsn(GOTO, label5);
        methodVisitor.visitLabel(label2);

        int v7 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v7);
        methodVisitor.visitVarInsn(ALOAD, v5);
        methodVisitor.visitInsn(MONITOREXIT);
        methodVisitor.visitLabel(label3);
        methodVisitor.visitVarInsn(ALOAD, v7);
        methodVisitor.visitInsn(ATHROW);
        methodVisitor.visitLabel(label5);
        methodVisitor.visitLineNumber(60, label5);



    }
}
