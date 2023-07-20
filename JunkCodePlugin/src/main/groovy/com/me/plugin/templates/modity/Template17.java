package com.me.plugin.templates.modity;

import static org.objectweb.asm.Opcodes.*;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

public class Template17 {

    public static void  modifyFromCode(MethodVisitor methodVisitor,int index){

        Label label0 = new Label();
        Label label1 = new Label();
        Label label2 = new Label();
        methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
        Label label3 = new Label();
        methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
        Label label4 = new Label();
        methodVisitor.visitLabel(label4);
        methodVisitor.visitLineNumber(87, label4);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Calendar", "getInstance", "()Ljava/util/Calendar;", false);

        int v1 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v1);
        Label label5 = new Label();
        methodVisitor.visitLabel(label5);
        methodVisitor.visitLineNumber(88, label5);
        methodVisitor.visitVarInsn(ALOAD, v1);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "identityHashCode", "(Ljava/lang/Object;)I", false);
        methodVisitor.visitInsn(I2L);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "nanoTime", "()J", false);
        methodVisitor.visitInsn(LAND);
        methodVisitor.visitInsn(LCONST_0);
        methodVisitor.visitInsn(LCMP);
        Label label6 = new Label();
        methodVisitor.visitJumpInsn(IFNE, label6);
        Label label7 = new Label();
        methodVisitor.visitLabel(label7);
        methodVisitor.visitLineNumber(89, label7);
        methodVisitor.visitTypeInsn(NEW, "java/util/Random");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Random", "<init>", "()V", false);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Random", "nextInt", "()I", false);

        int v2 = ++index;
        methodVisitor.visitVarInsn(ISTORE, v2);
        Label label8 = new Label();
        methodVisitor.visitLabel(label8);
        methodVisitor.visitLineNumber(90, label8);
        methodVisitor.visitVarInsn(ILOAD, v2);
        methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");

        int v3 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v3);
        Label label9 = new Label();
        methodVisitor.visitLabel(label9);
        methodVisitor.visitLineNumber(91, label9);
        methodVisitor.visitTypeInsn(NEW, "java/util/Random");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Random", "<init>", "()V", false);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Random", "nextInt", "()I", false);

        int v4 = ++index;
        methodVisitor.visitVarInsn(ISTORE, v4);
        Label label10 = new Label();
        methodVisitor.visitLabel(label10);
        methodVisitor.visitLineNumber(92, label10);
        methodVisitor.visitTypeInsn(NEW, "java/lang/Object");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);

        int v5 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v5);
        Label label11 = new Label();
        methodVisitor.visitLabel(label11);
        methodVisitor.visitLineNumber(93, label11);
        methodVisitor.visitVarInsn(ALOAD, v5);
        methodVisitor.visitInsn(DUP);

        int v6 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v6);
        methodVisitor.visitInsn(MONITORENTER);
        methodVisitor.visitLabel(label0);
        methodVisitor.visitLineNumber(94, label0);
        methodVisitor.visitVarInsn(ILOAD, v2);
        methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");

        int v7 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v7);
        Label label12 = new Label();
        methodVisitor.visitLabel(label12);
        methodVisitor.visitLineNumber(95, label12);
        methodVisitor.visitVarInsn(ALOAD, v7);
        methodVisitor.visitInsn(ARRAYLENGTH);

        int v8 = ++index;
        methodVisitor.visitVarInsn(ISTORE, v8);
        Label label13 = new Label();
        methodVisitor.visitLabel(label13);
        methodVisitor.visitLineNumber(96, label13);
        methodVisitor.visitVarInsn(ALOAD, v3);
        methodVisitor.visitVarInsn(ALOAD, v7);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "equals", "([Ljava/lang/Object;[Ljava/lang/Object;)Z", false);
        Label label14 = new Label();
        methodVisitor.visitJumpInsn(IFNE, label14);
        Label label15 = new Label();
        methodVisitor.visitLabel(label15);
        methodVisitor.visitLineNumber(97, label15);
        methodVisitor.visitVarInsn(ILOAD, v4);
        methodVisitor.visitVarInsn(ILOAD, v8);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "max", "(II)I", false);

        int v9 = ++index;
        methodVisitor.visitVarInsn(ISTORE, v9);
        Label label16 = new Label();
        methodVisitor.visitLabel(label16);
        methodVisitor.visitLineNumber(98, label16);
        methodVisitor.visitInsn(ICONST_0);

        int v10 = ++index;
        methodVisitor.visitVarInsn(ISTORE, v10);
        Label label17 = new Label();
        methodVisitor.visitLabel(label17);
        methodVisitor.visitVarInsn(ILOAD, v10);
        methodVisitor.visitVarInsn(ILOAD, v9);
        Label label18 = new Label();
        methodVisitor.visitJumpInsn(IF_ICMPGE, label18);
        Label label19 = new Label();
        methodVisitor.visitLabel(label19);
        methodVisitor.visitLineNumber(99, label19);
        methodVisitor.visitVarInsn(ALOAD, v7);
        methodVisitor.visitVarInsn(ILOAD, v10);
        methodVisitor.visitInsn(AALOAD);
        methodVisitor.visitVarInsn(ALOAD, v3);
        methodVisitor.visitVarInsn(ILOAD, v10);
        methodVisitor.visitInsn(AALOAD);
        Label label20 = new Label();
        methodVisitor.visitJumpInsn(IF_ACMPEQ, label20);
        methodVisitor.visitVarInsn(ALOAD, v1);
        methodVisitor.visitVarInsn(ALOAD, v7);
        methodVisitor.visitVarInsn(ILOAD, v10);
        methodVisitor.visitInsn(AALOAD);
        Label label21 = new Label();
        methodVisitor.visitLabel(label21);
        methodVisitor.visitLineNumber(100, label21);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Objects", "equals", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
        methodVisitor.visitJumpInsn(IFEQ, label20);
        Label label22 = new Label();
        methodVisitor.visitLabel(label22);
        methodVisitor.visitLineNumber(101, label22);
        methodVisitor.visitVarInsn(ILOAD, v10);
        methodVisitor.visitVarInsn(ISTORE, v4);
        Label label23 = new Label();
        methodVisitor.visitLabel(label23);
        methodVisitor.visitLineNumber(102, label23);
        methodVisitor.visitJumpInsn(GOTO, label14);
        methodVisitor.visitLabel(label20);
        methodVisitor.visitLineNumber(98, label20);
        methodVisitor.visitIincInsn(v10, v1);
        methodVisitor.visitJumpInsn(GOTO, label17);
        methodVisitor.visitLabel(label18);
        methodVisitor.visitLineNumber(106, label18);
        methodVisitor.visitVarInsn(ALOAD, v7);
        methodVisitor.visitVarInsn(ILOAD, v4);
        methodVisitor.visitInsn(AALOAD);
        methodVisitor.visitVarInsn(ALOAD, v1);
        Label label24 = new Label();
        methodVisitor.visitJumpInsn(IF_ACMPNE, label24);
        Label label25 = new Label();
        methodVisitor.visitLabel(label25);
        methodVisitor.visitLineNumber(107, label25);
        methodVisitor.visitJumpInsn(GOTO, label14);
        methodVisitor.visitLabel(label24);
        methodVisitor.visitLineNumber(108, label24);
        methodVisitor.visitTypeInsn(NEW, "java/util/Random");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Random", "<init>", "()V", false);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Random", "nextInt", "()I", false);
        methodVisitor.visitVarInsn(ISTORE, v4);
        methodVisitor.visitLabel(label14);
        methodVisitor.visitLineNumber(110, label14);
        methodVisitor.visitVarInsn(ILOAD, v8);
        methodVisitor.visitInsn(ICONST_1);
        methodVisitor.visitInsn(ISUB);
        methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
        methodVisitor.visitVarInsn(ASTORE, v9);
        Label label26 = new Label();
        methodVisitor.visitLabel(label26);
        methodVisitor.visitLineNumber(111, label26);
        methodVisitor.visitVarInsn(ALOAD, v7);
        methodVisitor.visitInsn(ICONST_0);
        methodVisitor.visitVarInsn(ALOAD, v9);
        methodVisitor.visitInsn(ICONST_0);
        methodVisitor.visitVarInsn(ILOAD, v4);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
        Label label27 = new Label();
        methodVisitor.visitLabel(label27);
        methodVisitor.visitLineNumber(112, label27);
        methodVisitor.visitVarInsn(ALOAD, v7);
        methodVisitor.visitVarInsn(ILOAD, v4);
        methodVisitor.visitInsn(ICONST_1);
        methodVisitor.visitInsn(IADD);
        methodVisitor.visitVarInsn(ALOAD, v9);
        methodVisitor.visitVarInsn(ILOAD, v4);
        methodVisitor.visitVarInsn(ILOAD, v8);
        methodVisitor.visitVarInsn(ILOAD, v4);
        methodVisitor.visitInsn(ISUB);
        methodVisitor.visitInsn(ICONST_1);
        methodVisitor.visitInsn(ISUB);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
        Label label28 = new Label();
        methodVisitor.visitLabel(label28);
        methodVisitor.visitLineNumber(116, label28);
        methodVisitor.visitVarInsn(ALOAD, v6);
        methodVisitor.visitInsn(MONITOREXIT);
        methodVisitor.visitLabel(label1);
        methodVisitor.visitJumpInsn(GOTO, label6);
        methodVisitor.visitLabel(label2);

        int v11 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v11);
        methodVisitor.visitVarInsn(ALOAD, v6);
        methodVisitor.visitInsn(MONITOREXIT);
        methodVisitor.visitLabel(label3);
        methodVisitor.visitVarInsn(ALOAD, v11);
        methodVisitor.visitInsn(ATHROW);
        methodVisitor.visitLabel(label6);
        methodVisitor.visitLineNumber(118, label6);

    }
}