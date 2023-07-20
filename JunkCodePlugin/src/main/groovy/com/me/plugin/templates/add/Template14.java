package com.me.plugin.templates.add;

import static org.objectweb.asm.Opcodes.*;
import  org.objectweb.asm.Opcodes;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

public class Template14 {

    public static void  fillfromCode(MethodVisitor methodVisitor){
        methodVisitor.visitCode();
        Label label0 = new Label();
        methodVisitor.visitLabel(label0);
        methodVisitor.visitLineNumber(820, label0);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/KeyStore", "getDefaultType", "()Ljava/lang/String;", false);
        methodVisitor.visitVarInsn(ASTORE, 2);
        Label label1 = new Label();
        methodVisitor.visitLabel(label1);
        methodVisitor.visitLineNumber(822, label1);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/KeyStore", "getDefaultType", "()Ljava/lang/String;", false);
        methodVisitor.visitVarInsn(ASTORE, 3);
        Label label2 = new Label();
        methodVisitor.visitLabel(label2);
        methodVisitor.visitLineNumber(823, label2);
        methodVisitor.visitVarInsn(ALOAD, 3);
        Label label3 = new Label();
        methodVisitor.visitJumpInsn(IFNULL, label3);
        Label label4 = new Label();
        methodVisitor.visitLabel(label4);
        methodVisitor.visitLineNumber(824, label4);
        methodVisitor.visitVarInsn(ALOAD, 2);
        methodVisitor.visitVarInsn(ALOAD, 3);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/KeyStore", "getInstance", "(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyStore;", false);
        methodVisitor.visitVarInsn(ASTORE, 1);
        Label label5 = new Label();
        methodVisitor.visitLabel(label5);
        Label label6 = new Label();
        methodVisitor.visitJumpInsn(GOTO, label6);
        methodVisitor.visitLabel(label3);
        methodVisitor.visitLineNumber(827, label3);
        methodVisitor.visitVarInsn(ALOAD, 2);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/KeyStore", "getInstance", "(Ljava/lang/String;)Ljava/security/KeyStore;", false);
        methodVisitor.visitVarInsn(ASTORE, 1);
        methodVisitor.visitLabel(label6);
        methodVisitor.visitLineNumber(829, label6);
        methodVisitor.visitLdcInsn("stdin");
        methodVisitor.visitVarInsn(ASTORE, 4);
        Label label7 = new Label();
        methodVisitor.visitLabel(label7);
        methodVisitor.visitLineNumber(831, label7);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/charset/Charset", "defaultCharset", "()Ljava/nio/charset/Charset;", false);
        methodVisitor.visitVarInsn(ASTORE, 5);
        Label label8 = new Label();
        methodVisitor.visitLabel(label8);
        methodVisitor.visitLineNumber(832, label8);
        methodVisitor.visitVarInsn(ALOAD, 5);
        Label label9 = new Label();
        methodVisitor.visitJumpInsn(IFNULL, label9);
        methodVisitor.visitInsn(ICONST_1);
        methodVisitor.visitTypeInsn(ANEWARRAY, "java/nio/charset/Charset");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitInsn(ICONST_0);
        methodVisitor.visitVarInsn(ALOAD, 5);
        methodVisitor.visitInsn(AASTORE);
        Label label10 = new Label();
        methodVisitor.visitJumpInsn(GOTO, label10);
        methodVisitor.visitLabel(label9);
        methodVisitor.visitInsn(ICONST_0);
        methodVisitor.visitTypeInsn(ANEWARRAY, "java/nio/charset/Charset");
        methodVisitor.visitLabel(label10);
        methodVisitor.visitVarInsn(ASTORE, 6);
        Label label11 = new Label();
        methodVisitor.visitLabel(label11);
        methodVisitor.visitLineNumber(833, label11);
        methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
        methodVisitor.visitVarInsn(ASTORE, 7);
        Label label12 = new Label();
        methodVisitor.visitLabel(label12);
        methodVisitor.visitLineNumber(834, label12);
        methodVisitor.visitVarInsn(ALOAD, 7);
        methodVisitor.visitLdcInsn("  for ");
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
        methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
        methodVisitor.visitInsn(POP);
        Label label13 = new Label();
        methodVisitor.visitLabel(label13);
        methodVisitor.visitLineNumber(835, label13);
        methodVisitor.visitInsn(ACONST_NULL);
        methodVisitor.visitVarInsn(ASTORE, 8);
        Label label14 = new Label();
        methodVisitor.visitLabel(label14);
        methodVisitor.visitLineNumber(837, label14);
        methodVisitor.visitVarInsn(ALOAD, 1);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/KeyStore", "aliases", "()Ljava/util/Enumeration;", false);
        methodVisitor.visitVarInsn(ASTORE, 9);
        Label label15 = new Label();
        methodVisitor.visitLabel(label15);
        methodVisitor.visitLineNumber(838, label15);
        methodVisitor.visitVarInsn(ALOAD, 9);
        Label label16 = new Label();
        methodVisitor.visitJumpInsn(IFNULL, label16);
        Label label17 = new Label();
        methodVisitor.visitLabel(label17);
        methodVisitor.visitLineNumber(839, label17);
        methodVisitor.visitVarInsn(ALOAD, 9);
        methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Enumeration", "hasMoreElements", "()Z", true);
        methodVisitor.visitJumpInsn(IFEQ, label16);
        Label label18 = new Label();
        methodVisitor.visitLabel(label18);
        methodVisitor.visitLineNumber(840, label18);
        methodVisitor.visitVarInsn(ALOAD, 9);
        methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Enumeration", "nextElement", "()Ljava/lang/Object;", true);
        methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
        methodVisitor.visitVarInsn(ASTORE, 10);
        Label label19 = new Label();
        methodVisitor.visitLabel(label19);
        methodVisitor.visitLineNumber(841, label19);
        methodVisitor.visitVarInsn(ALOAD, 1);
        methodVisitor.visitVarInsn(ALOAD, 10);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/KeyStore", "isKeyEntry", "(Ljava/lang/String;)Z", false);
        Label label20 = new Label();
        methodVisitor.visitJumpInsn(IFEQ, label20);
        Label label21 = new Label();
        methodVisitor.visitLabel(label21);
        methodVisitor.visitLineNumber(843, label21);
        methodVisitor.visitVarInsn(ALOAD, 10);
        methodVisitor.visitVarInsn(ASTORE, 4);
        Label label22 = new Label();
        methodVisitor.visitLabel(label22);
        methodVisitor.visitLineNumber(844, label22);
        methodVisitor.visitVarInsn(ALOAD, 1);
        methodVisitor.visitVarInsn(ALOAD, 8);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/KeyStore", "isKeyEntry", "(Ljava/lang/String;)Z", false);
        Label label23 = new Label();
        methodVisitor.visitJumpInsn(IFNE, label23);
        Label label24 = new Label();
        methodVisitor.visitLabel(label24);
        methodVisitor.visitLineNumber(845, label24);
        methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
        methodVisitor.visitLdcInsn(" entry \"");
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
        methodVisitor.visitVarInsn(ALOAD, 8);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
        methodVisitor.visitLdcInsn("\" does not contain a ");
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
        methodVisitor.visitVarInsn(ALOAD, 4);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
        methodVisitor.visitVarInsn(ALOAD, 6);
        methodVisitor.visitInsn(ARRAYLENGTH);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
        methodVisitor.visitLabel(label23);
        methodVisitor.visitLineNumber(847, label23);
        methodVisitor.visitVarInsn(ALOAD, 1);
        methodVisitor.visitVarInsn(ALOAD, 8);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/KeyStore", "getCertificateChain", "(Ljava/lang/String;)[Ljava/security/cert/Certificate;", false);
        methodVisitor.visitVarInsn(ASTORE, 11);
        Label label25 = new Label();
        methodVisitor.visitLabel(label25);
        methodVisitor.visitLineNumber(848, label25);
        methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
        methodVisitor.visitLdcInsn(" entry \"");
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
        methodVisitor.visitVarInsn(ALOAD, 8);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
        methodVisitor.visitLdcInsn("\" does not contain a ");
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
        methodVisitor.visitVarInsn(ALOAD, 11);
        methodVisitor.visitInsn(ARRAYLENGTH);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
        methodVisitor.visitLabel(label20);
        methodVisitor.visitLineNumber(850, label20);
        methodVisitor.visitJumpInsn(GOTO, label17);
        methodVisitor.visitLabel(label16);
        methodVisitor.visitLineNumber(852, label16);
        methodVisitor.visitInsn(RETURN);
        Label label26 = new Label();
        methodVisitor.visitLabel(label26);
        methodVisitor.visitLocalVariable("keyStore", "Ljava/security/KeyStore;", null, label5, label3, 1);
        methodVisitor.visitLocalVariable("certificateChain", "[Ljava/security/cert/Certificate;", null, label25, label20, 11);
        methodVisitor.visitLocalVariable("nextElement", "Ljava/lang/String;", null, label19, label20, 10);
        methodVisitor.visitLocalVariable("keyStore", "Ljava/security/KeyStore;", null, label6, label26, 1);
        methodVisitor.visitLocalVariable("str", "Ljava/lang/String;", null, label1, label26, 2);
        methodVisitor.visitLocalVariable("str2", "Ljava/lang/String;", null, label2, label26, 3);
        methodVisitor.visitLocalVariable("str4", "Ljava/lang/String;", null, label7, label26, 4);
        methodVisitor.visitLocalVariable("charset", "Ljava/nio/charset/Charset;", null, label8, label26, 5);
        methodVisitor.visitLocalVariable("charsetArr", "[Ljava/nio/charset/Charset;", null, label11, label26, 6);
        methodVisitor.visitLocalVariable("m11145", "Ljava/util/List;", "Ljava/util/List<[C>;", label12, label26, 7);
        methodVisitor.visitLocalVariable("str5", "Ljava/lang/String;", null, label14, label26, 8);
        methodVisitor.visitLocalVariable("aliases", "Ljava/util/Enumeration;", "Ljava/util/Enumeration<Ljava/lang/String;>;", label15, label26, 9);
        methodVisitor.visitMaxs(4, 12);
        methodVisitor.visitEnd();
    }
}