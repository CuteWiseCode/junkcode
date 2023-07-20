package com.me.plugin.templates.modity;

import static org.objectweb.asm.Opcodes.*;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class Template9 {

    public static void  modifyFromCode(MethodVisitor methodVisitor,int index){

        Label label0 = new Label();
        Label label1 = new Label();
        Label label2 = new Label();
        methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/security/NoSuchAlgorithmException");
        methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/security/NoSuchProviderException");
        Label label3 = new Label();
        methodVisitor.visitLabel(label3);
        methodVisitor.visitLineNumber(66, label3);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/charset/Charset", "defaultCharset", "()Ljava/nio/charset/Charset;", false);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "identityHashCode", "(Ljava/lang/Object;)I", false);
        methodVisitor.visitInsn(I2L);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "nanoTime", "()J", false);
        methodVisitor.visitInsn(LAND);
        methodVisitor.visitInsn(LCONST_0);
        methodVisitor.visitInsn(LCMP);
        Label label4 = new Label();
        methodVisitor.visitJumpInsn(IFNE, label4);
        Label label5 = new Label();
        methodVisitor.visitLabel(label5);
        methodVisitor.visitLineNumber(67, label5);
        methodVisitor.visitLdcInsn("\\s*([\\S&&[^:,]]*)(\\:([\\S&&[^,]]*))?\\s*(\\,(.*))?");
        Label label6 = new Label();
        methodVisitor.visitLabel(label6);
        methodVisitor.visitLineNumber(68, label6);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "compile", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", false);

        int v0 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v0);
        Label label7 = new Label();
        methodVisitor.visitLabel(label7);
        methodVisitor.visitLineNumber(71, label7);
        methodVisitor.visitLdcInsn("sinecures.strongAlgorithms");
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/Security", "getProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);

        int v1 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v1);
        Label label8 = new Label();
        methodVisitor.visitLabel(label8);
        methodVisitor.visitLineNumber(72, label8);
        methodVisitor.visitFrame(Opcodes.F_NEW, 2, new Object[]{"java/util/regex/Pattern", "java/lang/String"}, 0, new Object[]{});
        methodVisitor.visitVarInsn(ALOAD, v1);
        methodVisitor.visitJumpInsn(IFNULL, label4);
        Label label9 = new Label();
        methodVisitor.visitLabel(label9);
        methodVisitor.visitLineNumber(74, label9);
        methodVisitor.visitVarInsn(ALOAD, v0);
        methodVisitor.visitVarInsn(ALOAD, v1);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Pattern", "matcher", "(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;", false);
        methodVisitor.visitInsn(DUP);

        int v2 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v2);
        Label label10 = new Label();
        methodVisitor.visitLabel(label10);
        methodVisitor.visitLineNumber(75, label10);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Matcher", "matches", "()Z", false);
        Label label11 = new Label();
        methodVisitor.visitJumpInsn(IFEQ, label11);
        Label label12 = new Label();
        methodVisitor.visitLabel(label12);
        methodVisitor.visitLineNumber(77, label12);
        methodVisitor.visitVarInsn(ALOAD, v2);
        methodVisitor.visitInsn(ICONST_1);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Matcher", "group", "(I)Ljava/lang/String;", false);

        int v3 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v3);
        Label label13 = new Label();
        methodVisitor.visitLabel(label13);
        methodVisitor.visitLineNumber(78, label13);
        methodVisitor.visitVarInsn(ALOAD, v2);
        methodVisitor.visitInsn(ICONST_3);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Matcher", "group", "(I)Ljava/lang/String;", false);

        int v4 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v4);
        methodVisitor.visitLabel(label0);
        methodVisitor.visitLineNumber(81, label0);
        methodVisitor.visitVarInsn(ALOAD, v4);
        Label label14 = new Label();
        methodVisitor.visitJumpInsn(IFNONNULL, label14);
        Label label15 = new Label();
        methodVisitor.visitLabel(label15);
        methodVisitor.visitLineNumber(82, label15);
        methodVisitor.visitVarInsn(ALOAD, v3);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/SecureRandom", "getInstance", "(Ljava/lang/String;)Ljava/security/SecureRandom;", false);
        methodVisitor.visitInsn(POP);
        methodVisitor.visitJumpInsn(GOTO, label1);
        methodVisitor.visitLabel(label14);
        methodVisitor.visitLineNumber(84, label14);
        methodVisitor.visitFrame(Opcodes.F_NEW, 5, new Object[]{"java/util/regex/Pattern", "java/lang/String", "java/util/regex/Matcher", "java/lang/String", "java/lang/String"}, 0, new Object[]{});
        methodVisitor.visitVarInsn(ALOAD, v3);
        methodVisitor.visitVarInsn(ALOAD, v4);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/SecureRandom", "getInstance", "(Ljava/lang/String;Ljava/lang/String;)Ljava/security/SecureRandom;", false);
        methodVisitor.visitInsn(POP);
        methodVisitor.visitLabel(label1);
        methodVisitor.visitLineNumber(88, label1);
        methodVisitor.visitFrame(Opcodes.F_NEW, 5, new Object[]{"java/util/regex/Pattern", "java/lang/String", "java/util/regex/Matcher", "java/lang/String", "java/lang/String"}, 0, new Object[]{});
        Label label16 = new Label();
        methodVisitor.visitJumpInsn(GOTO, label16);
        methodVisitor.visitLabel(label2);
        methodVisitor.visitLineNumber(86, label2);
        methodVisitor.visitFrame(Opcodes.F_NEW, 5, new Object[]{"java/util/regex/Pattern", "java/lang/String", "java/util/regex/Matcher", "java/lang/String", "java/lang/String"}, 1, new Object[]{"java/security/GeneralSecurityException"});
        methodVisitor.visitVarInsn(ASTORE, 5);
        methodVisitor.visitLabel(label16);
        methodVisitor.visitLineNumber(89, label16);
        methodVisitor.visitFrame(Opcodes.F_NEW, 5, new Object[]{"java/util/regex/Pattern", "java/lang/String", "java/util/regex/Matcher", "java/lang/String", "java/lang/String"}, 0, new Object[]{});
        methodVisitor.visitVarInsn(ALOAD, v2);
        methodVisitor.visitInsn(ICONST_5);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Matcher", "group", "(I)Ljava/lang/String;", false);
        methodVisitor.visitVarInsn(ASTORE, v1);
        Label label17 = new Label();
        methodVisitor.visitLabel(label17);
        methodVisitor.visitLineNumber(90, label17);
        Label label18 = new Label();
        methodVisitor.visitJumpInsn(GOTO, label18);
        methodVisitor.visitLabel(label11);
        methodVisitor.visitLineNumber(91, label11);
        methodVisitor.visitFrame(Opcodes.F_NEW, 3, new Object[]{"java/util/regex/Pattern", "java/lang/String", "java/util/regex/Matcher"}, 0, new Object[]{});
        methodVisitor.visitInsn(ACONST_NULL);
        methodVisitor.visitVarInsn(ASTORE, v1);
        methodVisitor.visitLabel(label18);
        methodVisitor.visitLineNumber(93, label18);
        methodVisitor.visitFrame(Opcodes.F_NEW, 2, new Object[]{"java/util/regex/Pattern", "java/lang/String"}, 0, new Object[]{});
        methodVisitor.visitJumpInsn(GOTO, label8);
        methodVisitor.visitLabel(label4);
        methodVisitor.visitLineNumber(96, label4);
        methodVisitor.visitFrame(Opcodes.F_NEW, 0, new Object[]{}, 0, new Object[]{});



    }
}
