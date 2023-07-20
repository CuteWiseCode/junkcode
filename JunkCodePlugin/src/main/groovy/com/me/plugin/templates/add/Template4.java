package com.me.plugin.templates.add;

import static org.objectweb.asm.Opcodes.*;
import  org.objectweb.asm.Opcodes;


import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

public class Template4 {

    public static void  fillfromCode(MethodVisitor methodVisitor){
        methodVisitor.visitCode();
        Label label0 = new Label();
        methodVisitor.visitLabel(label0);
        methodVisitor.visitLineNumber(214, label0);
        methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
        methodVisitor.visitVarInsn(ASTORE, 1);
        Label label1 = new Label();
        methodVisitor.visitLabel(label1);
        methodVisitor.visitLineNumber(215, label1);
        methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
        methodVisitor.visitVarInsn(ASTORE, 2);
        Label label2 = new Label();
        methodVisitor.visitLabel(label2);
        methodVisitor.visitLineNumber(216, label2);
        methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
        methodVisitor.visitVarInsn(ASTORE, 3);
        Label label3 = new Label();
        methodVisitor.visitLabel(label3);
        methodVisitor.visitLineNumber(217, label3);
        methodVisitor.visitVarInsn(ALOAD, 1);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "isEmpty", "()Z", false);
        Label label4 = new Label();
        methodVisitor.visitJumpInsn(IFNE, label4);
        methodVisitor.visitInsn(ICONST_1);
        Label label5 = new Label();
        methodVisitor.visitJumpInsn(GOTO, label5);
        methodVisitor.visitLabel(label4);
        methodVisitor.visitInsn(ICONST_0);
        methodVisitor.visitLabel(label5);
        methodVisitor.visitVarInsn(ISTORE, 4);
        Label label6 = new Label();
        methodVisitor.visitLabel(label6);
        methodVisitor.visitLineNumber(218, label6);
        methodVisitor.visitInsn(ICONST_0);
        methodVisitor.visitVarInsn(ISTORE, 5);
        Label label7 = new Label();
        methodVisitor.visitLabel(label7);
        methodVisitor.visitLineNumber(219, label7);
        methodVisitor.visitInsn(ICONST_1);
        methodVisitor.visitVarInsn(ISTORE, 6);
        Label label8 = new Label();
        methodVisitor.visitLabel(label8);
        methodVisitor.visitLineNumber(220, label8);
        methodVisitor.visitVarInsn(ALOAD, 2);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "isEmpty", "()Z", false);
        Label label9 = new Label();
        methodVisitor.visitJumpInsn(IFNE, label9);
        methodVisitor.visitInsn(ICONST_1);
        Label label10 = new Label();
        methodVisitor.visitJumpInsn(GOTO, label10);
        methodVisitor.visitLabel(label9);
        methodVisitor.visitInsn(ICONST_0);
        methodVisitor.visitLabel(label10);
        methodVisitor.visitVarInsn(ISTORE, 7);
        Label label11 = new Label();
        methodVisitor.visitLabel(label11);
        methodVisitor.visitLineNumber(221, label11);
        methodVisitor.visitVarInsn(ILOAD, 4);
        Label label12 = new Label();
        methodVisitor.visitJumpInsn(IFNE, label12);
        methodVisitor.visitVarInsn(ILOAD, 5);
        methodVisitor.visitJumpInsn(IFNE, label12);
        methodVisitor.visitVarInsn(ILOAD, 7);
        methodVisitor.visitJumpInsn(IFNE, label12);
        methodVisitor.visitVarInsn(ILOAD, 6);
        methodVisitor.visitJumpInsn(IFNE, label12);
        Label label13 = new Label();
        methodVisitor.visitLabel(label13);
        methodVisitor.visitLineNumber(223, label13);
        methodVisitor.visitInsn(RETURN);
        methodVisitor.visitLabel(label12);
        methodVisitor.visitLineNumber(226, label12);
        methodVisitor.visitVarInsn(ALOAD, 1);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "iterator", "()Ljava/util/Iterator;", false);
        methodVisitor.visitVarInsn(ASTORE, 8);
        Label label14 = new Label();
        methodVisitor.visitLabel(label14);
        methodVisitor.visitVarInsn(ALOAD, 8);
        methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
        Label label15 = new Label();
        methodVisitor.visitJumpInsn(IFEQ, label15);
        methodVisitor.visitVarInsn(ALOAD, 8);
        methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
        methodVisitor.visitTypeInsn(CHECKCAST, "androidx/recyclerview/widget/RecyclerView$ViewHolder");
        methodVisitor.visitVarInsn(ASTORE, 9);
        Label label16 = new Label();
        methodVisitor.visitLabel(label16);
        methodVisitor.visitLineNumber(227, label16);
        methodVisitor.visitVarInsn(ILOAD, 6);
        Label label17 = new Label();
        methodVisitor.visitJumpInsn(IFNE, label17);
        methodVisitor.visitInsn(ICONST_1);
        Label label18 = new Label();
        methodVisitor.visitJumpInsn(GOTO, label18);
        methodVisitor.visitLabel(label17);
        methodVisitor.visitInsn(ICONST_0);
        methodVisitor.visitLabel(label18);
        methodVisitor.visitVarInsn(ISTORE, 6);
        Label label19 = new Label();
        methodVisitor.visitLabel(label19);
        methodVisitor.visitLineNumber(228, label19);
        methodVisitor.visitJumpInsn(GOTO, label14);
        methodVisitor.visitLabel(label15);
        methodVisitor.visitLineNumber(229, label15);
        methodVisitor.visitVarInsn(ALOAD, 1);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "clear", "()V", false);
        Label label20 = new Label();
        methodVisitor.visitLabel(label20);
        methodVisitor.visitLineNumber(231, label20);
        methodVisitor.visitVarInsn(ILOAD, 5);
        Label label21 = new Label();
        methodVisitor.visitJumpInsn(IFEQ, label21);
        Label label22 = new Label();
        methodVisitor.visitLabel(label22);
        methodVisitor.visitLineNumber(234, label22);
        methodVisitor.visitVarInsn(ILOAD, 4);
        Label label23 = new Label();
        methodVisitor.visitJumpInsn(IFEQ, label23);
        Label label24 = new Label();
        methodVisitor.visitLabel(label24);
        methodVisitor.visitLineNumber(235, label24);
        methodVisitor.visitInsn(ACONST_NULL);
        methodVisitor.visitVarInsn(ASTORE, 8);
        Label label25 = new Label();
        methodVisitor.visitLabel(label25);
        methodVisitor.visitLineNumber(236, label25);
        methodVisitor.visitJumpInsn(GOTO, label21);
        methodVisitor.visitLabel(label23);
        methodVisitor.visitLineNumber(237, label23);
        methodVisitor.visitInsn(ACONST_NULL);
        methodVisitor.visitVarInsn(ASTORE, 8);
        methodVisitor.visitLabel(label21);
        methodVisitor.visitLineNumber(241, label21);
        methodVisitor.visitVarInsn(ILOAD, 6);
        Label label26 = new Label();
        methodVisitor.visitJumpInsn(IFEQ, label26);
        Label label27 = new Label();
        methodVisitor.visitLabel(label27);
        methodVisitor.visitLineNumber(243, label27);
        methodVisitor.visitVarInsn(ILOAD, 4);
        methodVisitor.visitJumpInsn(IFEQ, label26);
        Label label28 = new Label();
        methodVisitor.visitLabel(label28);
        methodVisitor.visitLineNumber(244, label28);
        methodVisitor.visitInsn(ACONST_NULL);
        methodVisitor.visitVarInsn(ASTORE, 8);
        methodVisitor.visitLabel(label26);
        methodVisitor.visitLineNumber(249, label26);
        methodVisitor.visitVarInsn(ILOAD, 7);
        Label label29 = new Label();
        methodVisitor.visitJumpInsn(IFEQ, label29);
        Label label30 = new Label();
        methodVisitor.visitLabel(label30);
        methodVisitor.visitLineNumber(250, label30);
        methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
        methodVisitor.visitVarInsn(ASTORE, 8);
        Label label31 = new Label();
        methodVisitor.visitLabel(label31);
        methodVisitor.visitLineNumber(251, label31);
        methodVisitor.visitVarInsn(ALOAD, 8);
        methodVisitor.visitVarInsn(ALOAD, 2);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "addAll", "(Ljava/util/Collection;)Z", false);
        methodVisitor.visitInsn(POP);
        Label label32 = new Label();
        methodVisitor.visitLabel(label32);
        methodVisitor.visitLineNumber(252, label32);
        methodVisitor.visitVarInsn(ALOAD, 3);
        methodVisitor.visitVarInsn(ALOAD, 8);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "add", "(Ljava/lang/Object;)Z", false);
        methodVisitor.visitInsn(POP);
        Label label33 = new Label();
        methodVisitor.visitLabel(label33);
        methodVisitor.visitLineNumber(253, label33);
        methodVisitor.visitVarInsn(ALOAD, 2);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "clear", "()V", false);
        Label label34 = new Label();
        methodVisitor.visitLabel(label34);
        methodVisitor.visitLineNumber(254, label34);
        methodVisitor.visitInsn(ACONST_NULL);
        methodVisitor.visitVarInsn(ASTORE, 9);
        Label label35 = new Label();
        methodVisitor.visitLabel(label35);
        methodVisitor.visitLineNumber(255, label35);
        methodVisitor.visitVarInsn(ALOAD, 8);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "clear", "()V", false);
        Label label36 = new Label();
        methodVisitor.visitLabel(label36);
        methodVisitor.visitLineNumber(256, label36);
        methodVisitor.visitVarInsn(ALOAD, 3);
        methodVisitor.visitVarInsn(ALOAD, 8);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "remove", "(Ljava/lang/Object;)Z", false);
        methodVisitor.visitInsn(POP);
        Label label37 = new Label();
        methodVisitor.visitLabel(label37);
        methodVisitor.visitLineNumber(258, label37);
        methodVisitor.visitVarInsn(ILOAD, 4);
        Label label38 = new Label();
        methodVisitor.visitJumpInsn(IFNE, label38);
        methodVisitor.visitVarInsn(ILOAD, 5);
        methodVisitor.visitJumpInsn(IFNE, label38);
        methodVisitor.visitVarInsn(ILOAD, 6);
        Label label39 = new Label();
        methodVisitor.visitJumpInsn(IFEQ, label39);
        methodVisitor.visitLabel(label38);
        methodVisitor.visitLineNumber(259, label38);
        methodVisitor.visitInsn(LCONST_0);
        methodVisitor.visitVarInsn(LSTORE, 10);
        Label label40 = new Label();
        methodVisitor.visitLabel(label40);
        methodVisitor.visitLineNumber(260, label40);
        methodVisitor.visitInsn(LCONST_0);
        methodVisitor.visitVarInsn(LSTORE, 12);
        Label label41 = new Label();
        methodVisitor.visitLabel(label41);
        methodVisitor.visitLineNumber(261, label41);
        methodVisitor.visitInsn(LCONST_0);
        methodVisitor.visitVarInsn(LSTORE, 14);
        Label label42 = new Label();
        methodVisitor.visitLabel(label42);
        methodVisitor.visitLineNumber(262, label42);
        methodVisitor.visitVarInsn(LLOAD, 10);
        methodVisitor.visitVarInsn(LLOAD, 12);
        methodVisitor.visitVarInsn(LLOAD, 14);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "max", "(JJ)J", false);
        methodVisitor.visitInsn(LADD);
        methodVisitor.visitVarInsn(LSTORE, 16);
        Label label43 = new Label();
        methodVisitor.visitLabel(label43);
        methodVisitor.visitLineNumber(263, label43);
        methodVisitor.visitVarInsn(ALOAD, 8);
        methodVisitor.visitInsn(ICONST_0);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "get", "(I)Ljava/lang/Object;", false);
        methodVisitor.visitTypeInsn(CHECKCAST, "androidx/recyclerview/widget/RecyclerView$ViewHolder");
        methodVisitor.visitFieldInsn(GETFIELD, "androidx/recyclerview/widget/RecyclerView$ViewHolder", "itemView", "Landroid/view/View;");
        methodVisitor.visitVarInsn(ASTORE, 18);
        Label label44 = new Label();
        methodVisitor.visitLabel(label44);
        methodVisitor.visitLineNumber(264, label44);
        methodVisitor.visitVarInsn(ALOAD, 18);
        methodVisitor.visitVarInsn(ALOAD, 9);
        methodVisitor.visitVarInsn(LLOAD, 16);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "androidx/core/view/ViewCompat", "postOnAnimationDelayed", "(Landroid/view/View;Ljava/lang/Runnable;J)V", false);
        Label label45 = new Label();
        methodVisitor.visitLabel(label45);
        methodVisitor.visitLineNumber(265, label45);
        methodVisitor.visitJumpInsn(GOTO, label29);
        methodVisitor.visitLabel(label39);
        methodVisitor.visitLineNumber(266, label39);
        methodVisitor.visitVarInsn(ALOAD, 9);
        methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/Runnable", "run", "()V", true);
        methodVisitor.visitLabel(label29);
        methodVisitor.visitLineNumber(269, label29);
        methodVisitor.visitInsn(RETURN);
        Label label46 = new Label();
        methodVisitor.visitLabel(label46);
        methodVisitor.visitLocalVariable("holder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", null, label16, label19, 9);
        methodVisitor.visitLocalVariable("removeDuration", "J", null, label40, label45, 10);
        methodVisitor.visitLocalVariable("moveDuration", "J", null, label41, label45, 12);
        methodVisitor.visitLocalVariable("changeDuration", "J", null, label42, label45, 14);
        methodVisitor.visitLocalVariable("totalDelay", "J", null, label43, label45, 16);
        methodVisitor.visitLocalVariable("view", "Landroid/view/View;", null, label44, label45, 18);
        methodVisitor.visitLocalVariable("additions", "Ljava/util/ArrayList;", "Ljava/util/ArrayList<Landroidx/recyclerview/widget/RecyclerView$ViewHolder;>;", label31, label29, 8);
        methodVisitor.visitLocalVariable("adder", "Ljava/lang/Runnable;", null, label35, label29, 9);
        methodVisitor.visitLocalVariable("mPendingRemovals", "Ljava/util/ArrayList;", "Ljava/util/ArrayList<Landroidx/recyclerview/widget/RecyclerView$ViewHolder;>;", label1, label46, 1);
        methodVisitor.visitLocalVariable("mPendingAdditions", "Ljava/util/ArrayList;", "Ljava/util/ArrayList<Landroidx/recyclerview/widget/RecyclerView$ViewHolder;>;", label2, label46, 2);
        methodVisitor.visitLocalVariable("mAdditionsList", "Ljava/util/ArrayList;", "Ljava/util/ArrayList<Ljava/util/ArrayList<Landroidx/recyclerview/widget/RecyclerView$ViewHolder;>;>;", label3, label46, 3);
        methodVisitor.visitLocalVariable("removalsPending", "Z", null, label6, label46, 4);
        methodVisitor.visitLocalVariable("movesPending", "Z", null, label7, label46, 5);
        methodVisitor.visitLocalVariable("changesPending", "Z", null, label8, label46, 6);
        methodVisitor.visitLocalVariable("additionsPending", "Z", null, label11, label46, 7);
        methodVisitor.visitMaxs(6, 19);
        methodVisitor.visitEnd();
    }
}