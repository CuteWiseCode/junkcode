package com.me.plugin.templates.modity;

import static org.objectweb.asm.Opcodes.*;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

public class Template16 {

    public static void  modifyFromCode(MethodVisitor methodVisitor,int index){

        Label label0 = new Label();
        methodVisitor.visitLabel(label0);
        methodVisitor.visitLineNumber(88, label0);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Calendar", "getInstance", "()Ljava/util/Calendar;", false);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "identityHashCode", "(Ljava/lang/Object;)I", false);
        methodVisitor.visitLdcInsn(2147483647);
        methodVisitor.visitInsn(IAND);
        Label label1 = new Label();
        methodVisitor.visitJumpInsn(IFNE, label1);
        Label label2 = new Label();
        methodVisitor.visitLabel(label2);
        methodVisitor.visitLineNumber(90, label2);
        methodVisitor.visitLdcInsn("a");
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);

        int v1 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v1);
        Label label3 = new Label();
        methodVisitor.visitLabel(label3);
        methodVisitor.visitLineNumber(91, label3);
        methodVisitor.visitVarInsn(ALOAD, v1);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getGenericInterfaces", "()[Ljava/lang/reflect/Type;", false);

        int v2 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v2);
        Label label4 = new Label();
        methodVisitor.visitLabel(label4);
        methodVisitor.visitLineNumber(92, label4);
        methodVisitor.visitVarInsn(ALOAD, v2);
        methodVisitor.visitJumpInsn(IFNULL, label1);
        Label label5 = new Label();
        methodVisitor.visitLabel(label5);
        methodVisitor.visitLineNumber(93, label5);
        methodVisitor.visitVarInsn(ALOAD, v2);

        int v3 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v3);
        methodVisitor.visitVarInsn(ALOAD, v3);
        methodVisitor.visitInsn(ARRAYLENGTH);

        int v4 = ++index;
        methodVisitor.visitVarInsn(ISTORE, v4);
        methodVisitor.visitInsn(ICONST_0);

        int v5 = ++index;
        methodVisitor.visitVarInsn(ISTORE, v5);
        Label label6 = new Label();
        methodVisitor.visitLabel(label6);
        methodVisitor.visitFrame(Opcodes.F_NEW, 6, new Object[]{Opcodes.TOP, "java/lang/Class", "[Ljava/lang/reflect/Type;", "[Ljava/lang/reflect/Type;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[]{});
        methodVisitor.visitVarInsn(ILOAD, v5);
        methodVisitor.visitVarInsn(ILOAD, v4);
        methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
        methodVisitor.visitVarInsn(ALOAD, v3);
        methodVisitor.visitVarInsn(ILOAD, v5);
        methodVisitor.visitInsn(AALOAD);

        int v6 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v6);
        Label label7 = new Label();
        methodVisitor.visitLabel(label7);
        methodVisitor.visitLineNumber(94, label7);
        methodVisitor.visitVarInsn(ALOAD, v6);
        methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/reflect/ParameterizedType");
        Label label8 = new Label();
        methodVisitor.visitJumpInsn(IFEQ, label8);
        Label label9 = new Label();
        methodVisitor.visitLabel(label9);
        methodVisitor.visitLineNumber(95, label9);
        methodVisitor.visitVarInsn(ALOAD, v6);
        methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/ParameterizedType");

        int v7 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v7);
        Label label10 = new Label();
        methodVisitor.visitLabel(label10);
        methodVisitor.visitLineNumber(96, label10);
        methodVisitor.visitVarInsn(ALOAD, v7);
        methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/reflect/ParameterizedType", "getRawType", "()Ljava/lang/reflect/Type;", true);
        methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Comparable;"));
        methodVisitor.visitJumpInsn(IF_ACMPNE, label8);
        methodVisitor.visitVarInsn(ALOAD, v7);
        methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/reflect/ParameterizedType", "getActualTypeArguments", "()[Ljava/lang/reflect/Type;", true);
        methodVisitor.visitInsn(DUP);

        int v0 = ++index;
        methodVisitor.visitVarInsn(ASTORE, v0);
        Label label11 = new Label();
        methodVisitor.visitLabel(label11);
        methodVisitor.visitJumpInsn(IFNULL, label8);
        methodVisitor.visitVarInsn(ALOAD, 0);
        methodVisitor.visitInsn(ARRAYLENGTH);
        methodVisitor.visitInsn(ICONST_1);
        methodVisitor.visitJumpInsn(IF_ICMPNE, label8);
        methodVisitor.visitVarInsn(ALOAD, v0);
        methodVisitor.visitInsn(ICONST_0);
        methodVisitor.visitInsn(AALOAD);
        methodVisitor.visitVarInsn(ALOAD, v1);
        methodVisitor.visitJumpInsn(IF_ACMPNE, label8);
        Label label12 = new Label();
        methodVisitor.visitLabel(label12);
        methodVisitor.visitLineNumber(97, label12);
        methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        methodVisitor.visitVarInsn(ALOAD, v1);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
        methodVisitor.visitLabel(label8);
        methodVisitor.visitLineNumber(93, label8);
        methodVisitor.visitFrame(Opcodes.F_NEW, 6, new Object[]{Opcodes.TOP, "java/lang/Class", "[Ljava/lang/reflect/Type;", "[Ljava/lang/reflect/Type;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[]{});
        methodVisitor.visitIincInsn(v5, v1);
        methodVisitor.visitJumpInsn(GOTO, label6);
        methodVisitor.visitLabel(label1);
        methodVisitor.visitLineNumber(105, label1);
        methodVisitor.visitFrame(Opcodes.F_NEW, 0, new Object[]{}, 0, new Object[]{});

    }
}
