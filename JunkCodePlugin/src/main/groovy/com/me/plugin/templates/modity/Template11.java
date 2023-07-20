package com.me.plugin.templates.modity;

import static org.objectweb.asm.Opcodes.*;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

public class Template11 {

    public static void  modifyFromCode(MethodVisitor methodVisitor,int index){

        Label label0 = new Label();
        methodVisitor.visitLabel(label0);
        methodVisitor.visitLineNumber(64, label0);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/charset/Charset", "defaultCharset", "()Ljava/nio/charset/Charset;", false);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "identityHashCode", "(Ljava/lang/Object;)I", false);
        methodVisitor.visitInsn(I2L);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "nanoTime", "()J", false);
        methodVisitor.visitInsn(LAND);
        methodVisitor.visitInsn(LCONST_0);
        methodVisitor.visitInsn(LCMP);
        Label label1 = new Label();
        methodVisitor.visitJumpInsn(IFNE, label1);
        Label label2 = new Label();
        methodVisitor.visitLabel(label2);
        methodVisitor.visitLineNumber(65, label2);
        methodVisitor.visitLdcInsn("baidu.com");

        int v0 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v0);
        Label label3 = new Label();
        methodVisitor.visitLabel(label3);
        methodVisitor.visitLineNumber(66, label3);
        methodVisitor.visitLdcInsn(".");

        int v1 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v1);
        Label label4 = new Label();
        methodVisitor.visitLabel(label4);
        methodVisitor.visitLineNumber(67, label4);
        methodVisitor.visitLdcInsn("@");

        int v2 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v2);
        Label label5 = new Label();
        methodVisitor.visitLabel(label5);
        methodVisitor.visitLineNumber(69, label5);
        methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);

        int v3 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v3);
        Label label6 = new Label();
        methodVisitor.visitLabel(label6);
        methodVisitor.visitLineNumber(70, label6);
        methodVisitor.visitInsn(ICONST_0);

        int v4 = ++index;
        methodVisitor.visitVarInsn(ISTORE, v4);
        Label label7 = new Label();
        methodVisitor.visitLabel(label7);
        methodVisitor.visitLineNumber(71, label7);
        methodVisitor.visitInsn(ICONST_0);

        int v5 = ++index;
        methodVisitor.visitVarInsn(ISTORE, v5);
        Label label8 = new Label();
        methodVisitor.visitLabel(label8);
        methodVisitor.visitLineNumber(72, label8);
        methodVisitor.visitFrame(Opcodes.F_NEW, 6, new Object[]{"java/lang/String", "java/lang/String", "java/lang/String", "java/lang/StringBuilder", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[]{});
        methodVisitor.visitVarInsn(ALOAD, v0);
        methodVisitor.visitVarInsn(ALOAD, v1);
        methodVisitor.visitVarInsn(ILOAD, v5);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "indexOf", "(Ljava/lang/String;I)I", false);
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitVarInsn(ISTORE, v5);
        Label label9 = new Label();
        methodVisitor.visitJumpInsn(IFLT, label9);
        Label label10 = new Label();
        methodVisitor.visitLabel(label10);
        methodVisitor.visitLineNumber(73, label10);
        methodVisitor.visitVarInsn(ILOAD, v5);
        methodVisitor.visitVarInsn(ILOAD, v4);
        Label label11 = new Label();
        methodVisitor.visitJumpInsn(IF_ICMPLE, label11);
        Label label12 = new Label();
        methodVisitor.visitLabel(label12);
        methodVisitor.visitLineNumber(74, label12);
        methodVisitor.visitVarInsn(ALOAD, v3);
        methodVisitor.visitVarInsn(ALOAD, v0);
        methodVisitor.visitVarInsn(ILOAD, v4);
        methodVisitor.visitVarInsn(ILOAD, v5);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;", false);
        methodVisitor.visitInsn(POP);
        methodVisitor.visitLabel(label11);
        methodVisitor.visitLineNumber(76, label11);
        methodVisitor.visitFrame(Opcodes.F_NEW, 6, new Object[]{"java/lang/String", "java/lang/String", "java/lang/String", "java/lang/StringBuilder", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[]{});
        methodVisitor.visitVarInsn(ALOAD, v3);
        methodVisitor.visitVarInsn(ALOAD, v2);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
        methodVisitor.visitInsn(POP);
        Label label13 = new Label();
        methodVisitor.visitLabel(label13);
        methodVisitor.visitLineNumber(77, label13);
        methodVisitor.visitVarInsn(ILOAD, v5);
        methodVisitor.visitVarInsn(ALOAD, v1);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
        methodVisitor.visitInsn(IADD);
        methodVisitor.visitVarInsn(ISTORE, v4);
        Label label14 = new Label();
        methodVisitor.visitLabel(label14);
        methodVisitor.visitLineNumber(78, label14);
        methodVisitor.visitIincInsn(v5, v1);
        methodVisitor.visitJumpInsn(GOTO, label8);
        methodVisitor.visitLabel(label9);
        methodVisitor.visitLineNumber(80, label9);
        methodVisitor.visitFrame(Opcodes.F_NEW, 6, new Object[]{"java/lang/String", "java/lang/String", "java/lang/String", "java/lang/StringBuilder", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[]{});
        methodVisitor.visitVarInsn(ILOAD, v4);
        methodVisitor.visitVarInsn(ALOAD, v0);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
        Label label15 = new Label();
        methodVisitor.visitJumpInsn(IF_ICMPGE, label15);
        Label label16 = new Label();
        methodVisitor.visitLabel(label16);
        methodVisitor.visitLineNumber(81, label16);
        methodVisitor.visitVarInsn(ALOAD, v3);
        methodVisitor.visitVarInsn(ALOAD, v0);
        methodVisitor.visitVarInsn(ILOAD, v4);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(I)Ljava/lang/String;", false);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
        methodVisitor.visitInsn(POP);
        methodVisitor.visitLabel(label15);
        methodVisitor.visitLineNumber(83, label15);
        methodVisitor.visitFrame(Opcodes.F_NEW, 6, new Object[]{"java/lang/String", "java/lang/String", "java/lang/String", "java/lang/StringBuilder", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[]{});
        methodVisitor.visitVarInsn(ALOAD, v3);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
        methodVisitor.visitInsn(POP);
        methodVisitor.visitLabel(label1);
        methodVisitor.visitLineNumber(85, label1);
        methodVisitor.visitFrame(Opcodes.F_NEW, 0, new Object[]{}, 0, new Object[]{});

    }
}
