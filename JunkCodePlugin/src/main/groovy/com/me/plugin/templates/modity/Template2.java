package com.me.plugin.templates.modity;

import static org.objectweb.asm.Opcodes.*;


import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

public class Template2 {

    public static void  modifyFromCode(MethodVisitor methodVisitor,int index){
        Label label0 = new Label();
        Label label1 = new Label();
        Label label2 = new Label();
        methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/ClassNotFoundException");
        methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
        Label label3 = new Label();
        Label label4 = new Label();
        Label label5 = new Label();
        methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/ClassNotFoundException");
        methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/io/IOException");
        Label label6 = new Label();
        methodVisitor.visitLabel(label6);
        methodVisitor.visitLineNumber(117, label6);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "nanoTime", "()J", false);
        methodVisitor.visitLdcInsn(87490272L);
        methodVisitor.visitInsn(LAND);
        methodVisitor.visitInsn(LCONST_0);
        methodVisitor.visitInsn(LCMP);
        Label label7 = new Label();
        methodVisitor.visitJumpInsn(IFNE, label7);
        methodVisitor.visitLabel(label3);
        methodVisitor.visitLineNumber(120, label3);
        methodVisitor.visitInsn(ACONST_NULL);

        int v1 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v1);
        Label label8 = new Label();
        methodVisitor.visitLabel(label8);
        methodVisitor.visitLineNumber(121, label8);
        methodVisitor.visitTypeInsn(NEW, "java/io/ObjectInputStream");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitTypeInsn(NEW, "java/io/FileInputStream");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitLdcInsn("temp/temp/fc.db");
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/FileInputStream", "<init>", "(Ljava/lang/String;)V", false);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/ObjectInputStream", "<init>", "(Ljava/io/InputStream;)V", false);
        methodVisitor.visitVarInsn(ASTORE, v1);
        Label label9 = new Label();
        methodVisitor.visitLabel(label9);
        methodVisitor.visitLineNumber(124, label9);
        methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
        int v3 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v3);
        Label label10 = new Label();
        methodVisitor.visitLabel(label10);
        methodVisitor.visitLineNumber(125, label10);
        methodVisitor.visitInsn(ACONST_NULL);

        int v4 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v4);
        Label label11 = new Label();
        methodVisitor.visitLabel(label11);
        methodVisitor.visitLineNumber(127, label11);
        methodVisitor.visitVarInsn(ALOAD, v1);
        Label label12 = new Label();
        methodVisitor.visitJumpInsn(IFNULL, label12);
        Label label13 = new Label();
        methodVisitor.visitLabel(label13);
        methodVisitor.visitLineNumber(128, label13);
        methodVisitor.visitVarInsn(ALOAD, v1);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ObjectInputStream", "readFields", "()Ljava/io/ObjectInputStream$GetField;", false);
        methodVisitor.visitVarInsn(ASTORE, v4);
        methodVisitor.visitLabel(label12);
        methodVisitor.visitLineNumber(131, label12);
        methodVisitor.visitInsn(ACONST_NULL);

        int v5 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v5);
        Label label14 = new Label();
        methodVisitor.visitLabel(label14);
        methodVisitor.visitLineNumber(133, label14);
        methodVisitor.visitVarInsn(ALOAD, v4);
        methodVisitor.visitLdcInsn("children");
        methodVisitor.visitInsn(ACONST_NULL);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ObjectInputStream$GetField", "get", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", false);
        methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Hashtable");
        methodVisitor.visitVarInsn(ASTORE, v5);
        Label label15 = new Label();
        methodVisitor.visitLabel(label15);
        methodVisitor.visitLineNumber(136, label15);
        methodVisitor.visitVarInsn(ALOAD, v4);
        methodVisitor.visitLdcInsn("source");
        methodVisitor.visitInsn(ACONST_NULL);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ObjectInputStream$GetField", "get", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", false);

        int v2 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v2);
        Label label16 = new Label();
        methodVisitor.visitLabel(label16);
        methodVisitor.visitLineNumber(138, label16);
        methodVisitor.visitVarInsn(ALOAD, v4);
        methodVisitor.visitLdcInsn("propertyChangeSupportSerializedDataVersion");
        methodVisitor.visitInsn(ICONST_2);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ObjectInputStream$GetField", "get", "(Ljava/lang/String;I)I", false);
        methodVisitor.visitInsn(POP);
        Label label17 = new Label();
        methodVisitor.visitLabel(label17);
        methodVisitor.visitLineNumber(140, label17);
        methodVisitor.visitInsn(ACONST_NULL);

        int v6 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v6);
        methodVisitor.visitLabel(label0);
        methodVisitor.visitLineNumber(143, label0);
        methodVisitor.visitVarInsn(ALOAD, v1);
        Label label18 = new Label();
        methodVisitor.visitJumpInsn(IFNULL, label18);
        methodVisitor.visitInsn(ACONST_NULL);
        methodVisitor.visitVarInsn(ALOAD, v1);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ObjectInputStream", "readObject", "()Ljava/lang/Object;", false);
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitVarInsn(ASTORE, v6);
        methodVisitor.visitJumpInsn(IF_ACMPNE, label18);
        methodVisitor.visitLabel(label1);
        Label label19 = new Label();
        methodVisitor.visitJumpInsn(GOTO, label19);
        methodVisitor.visitLabel(label18);
        methodVisitor.visitLineNumber(146, label18);
        Label label20 = new Label();
        methodVisitor.visitJumpInsn(GOTO, label20);
        methodVisitor.visitLabel(label2);
        methodVisitor.visitLineNumber(144, label2);

        int v7 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v7);
        Label label21 = new Label();
        methodVisitor.visitLabel(label21);
        methodVisitor.visitLineNumber(145, label21);
        methodVisitor.visitVarInsn(ALOAD, v7);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Exception", "printStackTrace", "()V", false);
        methodVisitor.visitLabel(label20);
        methodVisitor.visitLineNumber(147, label20);
        methodVisitor.visitVarInsn(ALOAD, v3);
        methodVisitor.visitInsn(ACONST_NULL);
        methodVisitor.visitVarInsn(ALOAD, v6);
        methodVisitor.visitTypeInsn(CHECKCAST, "java/beans/PropertyChangeListener");
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
        methodVisitor.visitInsn(POP);
        methodVisitor.visitJumpInsn(GOTO, label0);
        methodVisitor.visitLabel(label19);
        methodVisitor.visitLineNumber(149, label19);
        methodVisitor.visitVarInsn(ALOAD, v5);
        methodVisitor.visitJumpInsn(IFNULL, label4);
        Label label22 = new Label();
        methodVisitor.visitLabel(label22);
        methodVisitor.visitLineNumber(150, label22);
        methodVisitor.visitVarInsn(ALOAD, v5);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "entrySet", "()Ljava/util/Set;", false);
        methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
        methodVisitor.visitVarInsn(ASTORE, v7);
        Label label23 = new Label();
        methodVisitor.visitLabel(label23);
        methodVisitor.visitVarInsn(ALOAD, v7);
        methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
        methodVisitor.visitJumpInsn(IFEQ, label4);
        methodVisitor.visitVarInsn(ALOAD, v7);
        methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
        methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");

        int v8 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v8);
        Label label24 = new Label();
        methodVisitor.visitLabel(label24);
        methodVisitor.visitLineNumber(151, label24);
        methodVisitor.visitVarInsn(ALOAD, v8);
        methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
        methodVisitor.visitTypeInsn(CHECKCAST, "java/beans/PropertyChangeSupport");
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/beans/PropertyChangeSupport", "getPropertyChangeListeners", "()[Ljava/beans/PropertyChangeListener;", false);

        int v9 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v9);
        methodVisitor.visitVarInsn(ALOAD, v9);
        methodVisitor.visitInsn(ARRAYLENGTH);

        int v10 = ++index;
        methodVisitor.visitVarInsn(ISTORE, v10);
        methodVisitor.visitInsn(ICONST_0);

        int v11 = ++index;
        methodVisitor.visitVarInsn(ISTORE, v11);
        Label label25 = new Label();
        methodVisitor.visitLabel(label25);
        methodVisitor.visitVarInsn(ILOAD, v11);
        methodVisitor.visitVarInsn(ILOAD, v10);
        Label label26 = new Label();
        methodVisitor.visitJumpInsn(IF_ICMPGE, label26);
        methodVisitor.visitVarInsn(ALOAD, v9);
        methodVisitor.visitVarInsn(ILOAD, v11);
        methodVisitor.visitInsn(AALOAD);

        int v12 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v12);
        Label label27 = new Label();
        methodVisitor.visitLabel(label27);
        methodVisitor.visitLineNumber(152, label27);
        methodVisitor.visitVarInsn(ALOAD, v3);
        methodVisitor.visitVarInsn(ALOAD, v8);
        methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
        methodVisitor.visitVarInsn(ALOAD, v12);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
        methodVisitor.visitInsn(POP);
        Label label28 = new Label();
        methodVisitor.visitLabel(label28);
        methodVisitor.visitLineNumber(151, label28);
        methodVisitor.visitIincInsn(v11, 1);
        methodVisitor.visitJumpInsn(GOTO, label25);
        methodVisitor.visitLabel(label26);
        methodVisitor.visitLineNumber(154, label26);
        methodVisitor.visitJumpInsn(GOTO, label23);
        methodVisitor.visitLabel(label4);
        methodVisitor.visitLineNumber(159, label4);
        methodVisitor.visitJumpInsn(GOTO, label7);
        methodVisitor.visitLabel(label5);
        methodVisitor.visitLineNumber(157, label5);
        methodVisitor.visitVarInsn(ASTORE, v1);
        Label label29 = new Label();
        methodVisitor.visitLabel(label29);
        methodVisitor.visitLineNumber(158, label29);
        methodVisitor.visitVarInsn(ALOAD, v1);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Exception", "printStackTrace", "()V", false);
        methodVisitor.visitLabel(label7);
        methodVisitor.visitLineNumber(161, label7);

    }
}