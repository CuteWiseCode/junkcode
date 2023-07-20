package com.me.plugin.templates.modity;

import static org.objectweb.asm.Opcodes.*;


import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

public class Template5 {

    public static void  modifyFromCode(MethodVisitor methodVisitor,int index){
        Label label0 = new Label();
        methodVisitor.visitLabel(label0);
        methodVisitor.visitLineNumber(194, label0);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Calendar", "getInstance", "()Ljava/util/Calendar;", false);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "identityHashCode", "(Ljava/lang/Object;)I", false);
        methodVisitor.visitLdcInsn(2147483647);
        methodVisitor.visitInsn(IAND);
        Label label1 = new Label();
        methodVisitor.visitJumpInsn(IFNE, label1);
        Label label2 = new Label();
        methodVisitor.visitLabel(label2);
        methodVisitor.visitLineNumber(195, label2);
        methodVisitor.visitFieldInsn(GETSTATIC, "java/net/Proxy", "NO_PROXY", "Ljava/net/Proxy;");
        int v1 = ++index;
       methodVisitor.visitVarInsn(ASTORE, v1);
        Label label3 = new Label();
        methodVisitor.visitLabel(label3);
        methodVisitor.visitLineNumber(196, label3);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getSecurityManager", "()Ljava/lang/SecurityManager;", false);

        int v2 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v2);
        Label label4 = new Label();
        methodVisitor.visitLabel(label4);
        methodVisitor.visitLineNumber(197, label4);
        methodVisitor.visitVarInsn(ALOAD, v1);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/Proxy", "address", "()Ljava/net/SocketAddress;", false);
        methodVisitor.visitTypeInsn(CHECKCAST, "java/net/InetSocketAddress");

        int v3 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v3);
        Label label5 = new Label();
        methodVisitor.visitLabel(label5);
        methodVisitor.visitLineNumber(198, label5);
        methodVisitor.visitVarInsn(ALOAD, v3);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/InetSocketAddress", "getAddress", "()Ljava/net/InetAddress;", false);
        Label label6 = new Label();
        methodVisitor.visitJumpInsn(IFNULL, label6);
        Label label7 = new Label();
        methodVisitor.visitLabel(label7);
        methodVisitor.visitLineNumber(199, label7);
        methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        methodVisitor.visitVarInsn(ALOAD, v3);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/InetSocketAddress", "getAddress", "()Ljava/net/InetAddress;", false);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/Object;)V", false);
        methodVisitor.visitLabel(label6);
        methodVisitor.visitLineNumber(201, label6);
        methodVisitor.visitVarInsn(ALOAD, v2);
        methodVisitor.visitJumpInsn(IFNULL, label1);
        Label label8 = new Label();
        methodVisitor.visitLabel(label8);
        methodVisitor.visitLineNumber(202, label8);
        methodVisitor.visitVarInsn(ALOAD, v3);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/InetSocketAddress", "isUnresolved", "()Z", false);
        Label label9 = new Label();
        methodVisitor.visitJumpInsn(IFEQ, label9);
        Label label10 = new Label();
        methodVisitor.visitLabel(label10);
        methodVisitor.visitLineNumber(203, label10);
        methodVisitor.visitTypeInsn(NEW, "java/net/InetSocketAddress");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitVarInsn(ALOAD, v3);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/InetSocketAddress", "getHostName", "()Ljava/lang/String;", false);
        methodVisitor.visitVarInsn(ALOAD, v3);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/InetSocketAddress", "getPort", "()I", false);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/net/InetSocketAddress", "<init>", "(Ljava/lang/String;I)V", false);
        methodVisitor.visitVarInsn(ASTORE, v3);
        methodVisitor.visitLabel(label9);
        methodVisitor.visitLineNumber(204, label9);
        methodVisitor.visitVarInsn(ALOAD, v3);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/InetSocketAddress", "isUnresolved", "()Z", false);
        Label label11 = new Label();
        methodVisitor.visitJumpInsn(IFEQ, label11);
        Label label12 = new Label();
        methodVisitor.visitLabel(label12);
        methodVisitor.visitLineNumber(205, label12);
        methodVisitor.visitVarInsn(ALOAD, v2);
        methodVisitor.visitVarInsn(ALOAD, v3);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/InetSocketAddress", "getHostName", "()Ljava/lang/String;", false);
        methodVisitor.visitVarInsn(ALOAD, v3);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/InetSocketAddress", "getPort", "()I", false);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/SecurityManager", "checkConnect", "(Ljava/lang/String;I)V", false);
        methodVisitor.visitJumpInsn(GOTO, label1);
        methodVisitor.visitLabel(label11);
        methodVisitor.visitLineNumber(207, label11);
        methodVisitor.visitVarInsn(ALOAD, v2);
        methodVisitor.visitVarInsn(ALOAD, v3);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/InetSocketAddress", "getAddress", "()Ljava/net/InetAddress;", false);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/InetAddress", "getHostAddress", "()Ljava/lang/String;", false);
        methodVisitor.visitVarInsn(ALOAD, v3);
        Label label13 = new Label();
        methodVisitor.visitLabel(label13);
        methodVisitor.visitLineNumber(208, label13);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/InetSocketAddress", "getPort", "()I", false);
        Label label14 = new Label();
        methodVisitor.visitLabel(label14);
        methodVisitor.visitLineNumber(207, label14);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/SecurityManager", "checkConnect", "(Ljava/lang/String;I)V", false);
        methodVisitor.visitLabel(label1);
        methodVisitor.visitLineNumber(212, label1);


    }
}
