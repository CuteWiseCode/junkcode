package com.me.plugin.templates.modity;

import static org.objectweb.asm.Opcodes.*;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class Template15 {

    public static void  modifyFromCode(MethodVisitor methodVisitor,int index){

        Label label0 = new Label();
        Label label1 = new Label();
        Label label2 = new Label();
        methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
        Label label3 = new Label();
        methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
        Label label4 = new Label();
        methodVisitor.visitLabel(label4);
        methodVisitor.visitLineNumber(86, label4);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/charset/Charset", "defaultCharset", "()Ljava/nio/charset/Charset;", false);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "identityHashCode", "(Ljava/lang/Object;)I", false);
        methodVisitor.visitInsn(I2L);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "nanoTime", "()J", false);
        methodVisitor.visitInsn(LAND);
        methodVisitor.visitInsn(LCONST_0);
        methodVisitor.visitInsn(LCMP);
        Label label5 = new Label();
        methodVisitor.visitJumpInsn(IFNE, label5);
        Label label6 = new Label();
        methodVisitor.visitLabel(label6);
        methodVisitor.visitLineNumber(87, label6);
        methodVisitor.visitTypeInsn(NEW, "java/util/Random");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Random", "<init>", "()V", false);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Random", "nextInt", "()I", false);

        int v1 = ++index;
        methodVisitor.visitVarInsn(ISTORE, v1);
        Label label7 = new Label();
        methodVisitor.visitLabel(label7);
        methodVisitor.visitLineNumber(89, label7);
        methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/locks/ReentrantLock");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitInsn(ICONST_1);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/locks/ReentrantLock", "<init>", "(Z)V", false);

        int v3 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v3);
        Label label8 = new Label();
        methodVisitor.visitLabel(label8);
        methodVisitor.visitLineNumber(90, label8);
        methodVisitor.visitVarInsn(ALOAD, v3);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantLock", "newCondition", "()Ljava/util/concurrent/locks/Condition;", false);

        int v4 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v4);
        Label label9 = new Label();
        methodVisitor.visitLabel(label9);
        methodVisitor.visitLineNumber(91, label9);
        methodVisitor.visitVarInsn(ALOAD, v3);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantLock", "lock", "()V", false);
        methodVisitor.visitLabel(label0);
        methodVisitor.visitLineNumber(93, label0);
        methodVisitor.visitVarInsn(ILOAD, v1);

        int v5 = ++index;
        methodVisitor.visitVarInsn(ISTORE, v5);
        Label label10 = new Label();
        methodVisitor.visitLabel(label10);
        methodVisitor.visitLineNumber(94, label10);
        methodVisitor.visitVarInsn(ILOAD, v5);
        methodVisitor.visitJumpInsn(IFLE, label1);
        Label label11 = new Label();
        methodVisitor.visitLabel(label11);
        methodVisitor.visitLineNumber(95, label11);
        methodVisitor.visitVarInsn(ILOAD, v1);
        methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");

        int v6 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v6);
        Label label12 = new Label();
        methodVisitor.visitLabel(label12);
        methodVisitor.visitLineNumber(97, label12);
        methodVisitor.visitVarInsn(ILOAD, v1);
        methodVisitor.visitInsn(ICONST_2);
        methodVisitor.visitInsn(ISUB);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "abs", "(I)I", false);

        int v7 = ++index;
        methodVisitor.visitVarInsn(ISTORE, v7);
        Label label13 = new Label();
        methodVisitor.visitLabel(label13);
        methodVisitor.visitLineNumber(98, label13);
        methodVisitor.visitVarInsn(ILOAD, v1);
        methodVisitor.visitInsn(ICONST_5);
        methodVisitor.visitInsn(ISUB);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "abs", "(I)I", false);

        int v8 = ++index;
        methodVisitor.visitVarInsn(ISTORE, v8);
        Label label14 = new Label();
        methodVisitor.visitLabel(label14);
        methodVisitor.visitLineNumber(100, label14);
        methodVisitor.visitVarInsn(ALOAD, v6);
        methodVisitor.visitVarInsn(ILOAD, v8);
        methodVisitor.visitInsn(ACONST_NULL);
        methodVisitor.visitInsn(AASTORE);
        Label label15 = new Label();
        methodVisitor.visitLabel(label15);
        methodVisitor.visitLineNumber(101, label15);
        methodVisitor.visitIincInsn(v8, 1);
        methodVisitor.visitVarInsn(ILOAD, v8);
        methodVisitor.visitVarInsn(ALOAD, v6);
        methodVisitor.visitInsn(ARRAYLENGTH);
        Label label16 = new Label();
        methodVisitor.visitJumpInsn(IF_ICMPNE, label16);
        methodVisitor.visitInsn(ICONST_0);
        methodVisitor.visitVarInsn(ISTORE, v8);
        methodVisitor.visitLabel(label16);
        methodVisitor.visitLineNumber(102, label16);
        methodVisitor.visitVarInsn(ILOAD, v8);
        methodVisitor.visitVarInsn(ILOAD, v7);
        methodVisitor.visitJumpInsn(IF_ICMPNE, label14);
        Label label17 = new Label();
        methodVisitor.visitLabel(label17);
        methodVisitor.visitLineNumber(103, label17);
        methodVisitor.visitVarInsn(ILOAD, v7);

        int v2 = ++index;
        methodVisitor.visitVarInsn(ISTORE, v2);
        Label label18 = new Label();
        methodVisitor.visitLabel(label18);
        methodVisitor.visitLineNumber(104, label18);
        methodVisitor.visitInsn(ICONST_0);
        methodVisitor.visitVarInsn(ISTORE, v1);
        Label label19 = new Label();
        methodVisitor.visitLabel(label19);
        methodVisitor.visitLineNumber(106, label19);
        methodVisitor.visitVarInsn(ILOAD, v5);
        Label label20 = new Label();
        methodVisitor.visitJumpInsn(IFLE, label20);
        methodVisitor.visitVarInsn(ALOAD, v3);
        methodVisitor.visitVarInsn(ALOAD, v4);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantLock", "hasWaiters", "(Ljava/util/concurrent/locks/Condition;)Z", false);
        methodVisitor.visitJumpInsn(IFEQ, label20);
        Label label21 = new Label();
        methodVisitor.visitLabel(label21);
        methodVisitor.visitLineNumber(107, label21);
        methodVisitor.visitVarInsn(ALOAD, v4);
        methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/locks/Condition", "signal", "()V", true);
        Label label22 = new Label();
        methodVisitor.visitLabel(label22);
        methodVisitor.visitLineNumber(106, label22);
        methodVisitor.visitIincInsn(v5, -1);
        methodVisitor.visitJumpInsn(GOTO, label19);
        methodVisitor.visitLabel(label20);
        methodVisitor.visitLineNumber(109, label20);
        methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
        methodVisitor.visitLdcInsn("takeIndex");
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
        methodVisitor.visitVarInsn(ILOAD, v2);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
        methodVisitor.visitVarInsn(ILOAD, v1);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
        methodVisitor.visitLabel(label1);
        methodVisitor.visitLineNumber(112, label1);
        methodVisitor.visitVarInsn(ALOAD, v3);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantLock", "unlock", "()V", false);
        Label label23 = new Label();
        methodVisitor.visitLabel(label23);
        methodVisitor.visitLineNumber(113, label23);
        methodVisitor.visitJumpInsn(GOTO, label5);
        methodVisitor.visitLabel(label2);
        methodVisitor.visitLineNumber(112, label2);

        int v9 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v9);
        methodVisitor.visitLabel(label3);
        methodVisitor.visitVarInsn(ALOAD, v3);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantLock", "unlock", "()V", false);
        Label label24 = new Label();
        methodVisitor.visitLabel(label24);
        methodVisitor.visitLineNumber(113, label24);
        methodVisitor.visitVarInsn(ALOAD, v9);
        methodVisitor.visitInsn(ATHROW);
        methodVisitor.visitLabel(label5);
        methodVisitor.visitLineNumber(115, label5);

    }
}
