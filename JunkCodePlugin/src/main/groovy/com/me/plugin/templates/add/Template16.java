package com.me.plugin.templates.add;

import static org.objectweb.asm.Opcodes.*;
import  org.objectweb.asm.Opcodes;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

public class Template16 {

    public static void  fillfromCode(MethodVisitor methodVisitor){
        methodVisitor.visitCode();
        Label label0 = new Label();
        Label label1 = new Label();
        Label label2 = new Label();
        methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/ArrayIndexOutOfBoundsException");
        methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/NegativeArraySizeException");
        Label label3 = new Label();
        methodVisitor.visitLabel(label3);
        methodVisitor.visitLineNumber(894, label3);
        methodVisitor.visitLdcInsn("abcdefthijklmnopqrstuvwxyz");
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
        methodVisitor.visitVarInsn(ASTORE, 1);
        Label label4 = new Label();
        methodVisitor.visitLabel(label4);
        methodVisitor.visitLineNumber(895, label4);
        methodVisitor.visitInsn(ICONST_0);
        methodVisitor.visitVarInsn(ISTORE, 2);
        Label label5 = new Label();
        methodVisitor.visitLabel(label5);
        methodVisitor.visitLineNumber(896, label5);
        methodVisitor.visitVarInsn(ALOAD, 1);
        methodVisitor.visitInsn(ARRAYLENGTH);
        methodVisitor.visitVarInsn(ISTORE, 3);
        Label label6 = new Label();
        methodVisitor.visitLabel(label6);
        methodVisitor.visitLineNumber(899, label6);
        methodVisitor.visitIntInsn(BIPUSH, 10);
        methodVisitor.visitVarInsn(ISTORE, 5);
        Label label7 = new Label();
        methodVisitor.visitLabel(label7);
        methodVisitor.visitLineNumber(901, label7);
        methodVisitor.visitInsn(ICONST_0);
        methodVisitor.visitVarInsn(ISTORE, 6);
        Label label8 = new Label();
        methodVisitor.visitLabel(label8);
        methodVisitor.visitLineNumber(902, label8);
        methodVisitor.visitInsn(ICONST_0);
        methodVisitor.visitVarInsn(ISTORE, 7);
        Label label9 = new Label();
        methodVisitor.visitLabel(label9);
        methodVisitor.visitLineNumber(903, label9);
        methodVisitor.visitInsn(LCONST_0);
        methodVisitor.visitVarInsn(LSTORE, 8);
        Label label10 = new Label();
        methodVisitor.visitLabel(label10);
        methodVisitor.visitLineNumber(904, label10);
        methodVisitor.visitInsn(ACONST_NULL);
        methodVisitor.visitVarInsn(ASTORE, 10);
        methodVisitor.visitLabel(label0);
        methodVisitor.visitLineNumber(906, label0);
        methodVisitor.visitInsn(ICONST_0);
        methodVisitor.visitVarInsn(ISTORE, 11);
        Label label11 = new Label();
        methodVisitor.visitLabel(label11);
        methodVisitor.visitLineNumber(907, label11);
        methodVisitor.visitVarInsn(ALOAD, 1);
        methodVisitor.visitVarInsn(ILOAD, 2);
        methodVisitor.visitInsn(CALOAD);
        methodVisitor.visitIntInsn(BIPUSH, 45);
        Label label12 = new Label();
        methodVisitor.visitJumpInsn(IF_ICMPNE, label12);
        Label label13 = new Label();
        methodVisitor.visitLabel(label13);
        methodVisitor.visitLineNumber(908, label13);
        methodVisitor.visitInsn(ICONST_1);
        methodVisitor.visitVarInsn(ISTORE, 11);
        Label label14 = new Label();
        methodVisitor.visitLabel(label14);
        methodVisitor.visitLineNumber(909, label14);
        methodVisitor.visitIincInsn(2, 1);
        Label label15 = new Label();
        methodVisitor.visitLabel(label15);
        methodVisitor.visitLineNumber(910, label15);
        methodVisitor.visitIincInsn(3, -1);
        Label label16 = new Label();
        methodVisitor.visitJumpInsn(GOTO, label16);
        methodVisitor.visitLabel(label12);
        methodVisitor.visitLineNumber(911, label12);
        methodVisitor.visitVarInsn(ALOAD, 1);
        methodVisitor.visitVarInsn(ILOAD, 2);
        methodVisitor.visitInsn(CALOAD);
        methodVisitor.visitIntInsn(BIPUSH, 43);
        methodVisitor.visitJumpInsn(IF_ICMPNE, label16);
        Label label17 = new Label();
        methodVisitor.visitLabel(label17);
        methodVisitor.visitLineNumber(912, label17);
        methodVisitor.visitIincInsn(2, 1);
        Label label18 = new Label();
        methodVisitor.visitLabel(label18);
        methodVisitor.visitLineNumber(913, label18);
        methodVisitor.visitIincInsn(3, -1);
        methodVisitor.visitLabel(label16);
        methodVisitor.visitLineNumber(915, label16);
        methodVisitor.visitInsn(ICONST_0);
        methodVisitor.visitVarInsn(ISTORE, 12);
        Label label19 = new Label();
        methodVisitor.visitLabel(label19);
        methodVisitor.visitLineNumber(916, label19);
        methodVisitor.visitInsn(LCONST_0);
        methodVisitor.visitVarInsn(LSTORE, 13);
        Label label20 = new Label();
        methodVisitor.visitLabel(label20);
        methodVisitor.visitLineNumber(918, label20);
        methodVisitor.visitTypeInsn(NEW, "java/util/Random");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Random", "<init>", "()V", false);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Random", "nextBoolean", "()Z", false);
        methodVisitor.visitVarInsn(ISTORE, 16);
        Label label21 = new Label();
        methodVisitor.visitLabel(label21);
        methodVisitor.visitLineNumber(919, label21);
        methodVisitor.visitInsn(ICONST_0);
        methodVisitor.visitVarInsn(ISTORE, 17);
        Label label22 = new Label();
        methodVisitor.visitLabel(label22);
        methodVisitor.visitLineNumber(920, label22);
        methodVisitor.visitVarInsn(ILOAD, 16);
        Label label23 = new Label();
        methodVisitor.visitJumpInsn(IFEQ, label23);
        Label label24 = new Label();
        methodVisitor.visitLabel(label24);
        methodVisitor.visitLineNumber(921, label24);
        methodVisitor.visitVarInsn(ILOAD, 3);
        Label label25 = new Label();
        methodVisitor.visitJumpInsn(IFLE, label25);
        Label label26 = new Label();
        methodVisitor.visitLabel(label26);
        methodVisitor.visitLineNumber(922, label26);
        methodVisitor.visitVarInsn(ALOAD, 1);
        methodVisitor.visitVarInsn(ILOAD, 2);
        methodVisitor.visitInsn(CALOAD);
        methodVisitor.visitVarInsn(ISTORE, 15);
        Label label27 = new Label();
        methodVisitor.visitLabel(label27);
        methodVisitor.visitLineNumber(923, label27);
        methodVisitor.visitVarInsn(ILOAD, 15);
        methodVisitor.visitIntInsn(BIPUSH, 48);
        Label label28 = new Label();
        methodVisitor.visitJumpInsn(IF_ICMPNE, label28);
        Label label29 = new Label();
        methodVisitor.visitLabel(label29);
        methodVisitor.visitLineNumber(924, label29);
        methodVisitor.visitVarInsn(ILOAD, 6);
        Label label30 = new Label();
        methodVisitor.visitJumpInsn(IFNE, label30);
        Label label31 = new Label();
        methodVisitor.visitLabel(label31);
        methodVisitor.visitLineNumber(925, label31);
        methodVisitor.visitInsn(ICONST_1);
        methodVisitor.visitVarInsn(ISTORE, 6);
        Label label32 = new Label();
        methodVisitor.visitJumpInsn(GOTO, label32);
        methodVisitor.visitLabel(label30);
        methodVisitor.visitLineNumber(926, label30);
        methodVisitor.visitVarInsn(LLOAD, 8);
        methodVisitor.visitInsn(LCONST_0);
        methodVisitor.visitInsn(LCMP);
        methodVisitor.visitJumpInsn(IFEQ, label32);
        Label label33 = new Label();
        methodVisitor.visitLabel(label33);
        methodVisitor.visitLineNumber(927, label33);
        methodVisitor.visitVarInsn(LLOAD, 8);
        methodVisitor.visitLdcInsn(new Long(10L));
        methodVisitor.visitInsn(LMUL);
        methodVisitor.visitVarInsn(LSTORE, 8);
        Label label34 = new Label();
        methodVisitor.visitLabel(label34);
        methodVisitor.visitLineNumber(928, label34);
        methodVisitor.visitIincInsn(6, 1);
        methodVisitor.visitLabel(label32);
        methodVisitor.visitLineNumber(930, label32);
        methodVisitor.visitVarInsn(ILOAD, 12);
        Label label35 = new Label();
        methodVisitor.visitJumpInsn(IFEQ, label35);
        Label label36 = new Label();
        methodVisitor.visitLabel(label36);
        methodVisitor.visitLineNumber(931, label36);
        methodVisitor.visitIincInsn(7, 1);
        methodVisitor.visitJumpInsn(GOTO, label35);
        methodVisitor.visitLabel(label28);
        methodVisitor.visitLineNumber(932, label28);
        methodVisitor.visitVarInsn(ILOAD, 15);
        methodVisitor.visitIntInsn(BIPUSH, 49);
        Label label37 = new Label();
        methodVisitor.visitJumpInsn(IF_ICMPLT, label37);
        methodVisitor.visitVarInsn(ILOAD, 15);
        methodVisitor.visitIntInsn(BIPUSH, 57);
        methodVisitor.visitJumpInsn(IF_ICMPGT, label37);
        Label label38 = new Label();
        methodVisitor.visitLabel(label38);
        methodVisitor.visitLineNumber(933, label38);
        methodVisitor.visitVarInsn(ILOAD, 15);
        methodVisitor.visitIntInsn(BIPUSH, 48);
        methodVisitor.visitInsn(ISUB);
        methodVisitor.visitVarInsn(ISTORE, 18);
        Label label39 = new Label();
        methodVisitor.visitLabel(label39);
        methodVisitor.visitLineNumber(934, label39);
        methodVisitor.visitVarInsn(ILOAD, 6);
        methodVisitor.visitInsn(ICONST_1);
        Label label40 = new Label();
        methodVisitor.visitJumpInsn(IF_ICMPNE, label40);
        methodVisitor.visitVarInsn(LLOAD, 8);
        methodVisitor.visitInsn(LCONST_0);
        methodVisitor.visitInsn(LCMP);
        Label label41 = new Label();
        methodVisitor.visitJumpInsn(IFEQ, label41);
        methodVisitor.visitLabel(label40);
        methodVisitor.visitLineNumber(935, label40);
        methodVisitor.visitIincInsn(6, 1);
        methodVisitor.visitLabel(label41);
        methodVisitor.visitLineNumber(936, label41);
        methodVisitor.visitVarInsn(LLOAD, 8);
        methodVisitor.visitLdcInsn(new Long(10L));
        methodVisitor.visitInsn(LMUL);
        methodVisitor.visitVarInsn(ILOAD, 18);
        methodVisitor.visitInsn(I2L);
        methodVisitor.visitInsn(LADD);
        methodVisitor.visitVarInsn(LSTORE, 8);
        Label label42 = new Label();
        methodVisitor.visitLabel(label42);
        methodVisitor.visitLineNumber(937, label42);
        methodVisitor.visitVarInsn(ILOAD, 12);
        Label label43 = new Label();
        methodVisitor.visitJumpInsn(IFEQ, label43);
        Label label44 = new Label();
        methodVisitor.visitLabel(label44);
        methodVisitor.visitLineNumber(938, label44);
        methodVisitor.visitIincInsn(7, 1);
        methodVisitor.visitLabel(label43);
        methodVisitor.visitLineNumber(939, label43);
        methodVisitor.visitJumpInsn(GOTO, label35);
        methodVisitor.visitLabel(label37);
        methodVisitor.visitVarInsn(ILOAD, 15);
        methodVisitor.visitIntInsn(BIPUSH, 46);
        Label label45 = new Label();
        methodVisitor.visitJumpInsn(IF_ICMPNE, label45);
        Label label46 = new Label();
        methodVisitor.visitLabel(label46);
        methodVisitor.visitLineNumber(941, label46);
        methodVisitor.visitVarInsn(ILOAD, 12);
        Label label47 = new Label();
        methodVisitor.visitJumpInsn(IFEQ, label47);
        Label label48 = new Label();
        methodVisitor.visitLabel(label48);
        methodVisitor.visitLineNumber(942, label48);
        methodVisitor.visitTypeInsn(NEW, "java/lang/NumberFormatException");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NumberFormatException", "<init>", "()V", false);
        methodVisitor.visitInsn(ATHROW);
        methodVisitor.visitLabel(label47);
        methodVisitor.visitLineNumber(943, label47);
        methodVisitor.visitInsn(ICONST_1);
        methodVisitor.visitVarInsn(ISTORE, 12);
        methodVisitor.visitJumpInsn(GOTO, label35);
        methodVisitor.visitLabel(label45);
        methodVisitor.visitLineNumber(944, label45);
        methodVisitor.visitVarInsn(ILOAD, 15);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "isDigit", "(C)Z", false);
        Label label49 = new Label();
        methodVisitor.visitJumpInsn(IFEQ, label49);
        Label label50 = new Label();
        methodVisitor.visitLabel(label50);
        methodVisitor.visitLineNumber(945, label50);
        methodVisitor.visitVarInsn(ILOAD, 15);
        methodVisitor.visitIntInsn(BIPUSH, 10);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "digit", "(CI)I", false);
        methodVisitor.visitVarInsn(ISTORE, 18);
        Label label51 = new Label();
        methodVisitor.visitLabel(label51);
        methodVisitor.visitLineNumber(946, label51);
        methodVisitor.visitVarInsn(ILOAD, 18);
        Label label52 = new Label();
        methodVisitor.visitJumpInsn(IFNE, label52);
        Label label53 = new Label();
        methodVisitor.visitLabel(label53);
        methodVisitor.visitLineNumber(947, label53);
        methodVisitor.visitVarInsn(ILOAD, 6);
        Label label54 = new Label();
        methodVisitor.visitJumpInsn(IFNE, label54);
        Label label55 = new Label();
        methodVisitor.visitLabel(label55);
        methodVisitor.visitLineNumber(948, label55);
        methodVisitor.visitInsn(ICONST_1);
        methodVisitor.visitVarInsn(ISTORE, 6);
        Label label56 = new Label();
        methodVisitor.visitJumpInsn(GOTO, label56);
        methodVisitor.visitLabel(label54);
        methodVisitor.visitLineNumber(949, label54);
        methodVisitor.visitVarInsn(LLOAD, 8);
        methodVisitor.visitInsn(LCONST_0);
        methodVisitor.visitInsn(LCMP);
        methodVisitor.visitJumpInsn(IFEQ, label56);
        Label label57 = new Label();
        methodVisitor.visitLabel(label57);
        methodVisitor.visitLineNumber(950, label57);
        methodVisitor.visitVarInsn(LLOAD, 8);
        methodVisitor.visitLdcInsn(new Long(10L));
        methodVisitor.visitInsn(LMUL);
        methodVisitor.visitVarInsn(LSTORE, 8);
        Label label58 = new Label();
        methodVisitor.visitLabel(label58);
        methodVisitor.visitLineNumber(951, label58);
        methodVisitor.visitIincInsn(6, 1);
        methodVisitor.visitJumpInsn(GOTO, label56);
        methodVisitor.visitLabel(label52);
        methodVisitor.visitLineNumber(954, label52);
        methodVisitor.visitVarInsn(ILOAD, 6);
        methodVisitor.visitInsn(ICONST_1);
        Label label59 = new Label();
        methodVisitor.visitJumpInsn(IF_ICMPNE, label59);
        methodVisitor.visitVarInsn(LLOAD, 8);
        methodVisitor.visitInsn(LCONST_0);
        methodVisitor.visitInsn(LCMP);
        Label label60 = new Label();
        methodVisitor.visitJumpInsn(IFEQ, label60);
        methodVisitor.visitLabel(label59);
        methodVisitor.visitLineNumber(955, label59);
        methodVisitor.visitIincInsn(6, 1);
        methodVisitor.visitLabel(label60);
        methodVisitor.visitLineNumber(956, label60);
        methodVisitor.visitVarInsn(LLOAD, 8);
        methodVisitor.visitLdcInsn(new Long(10L));
        methodVisitor.visitInsn(LMUL);
        methodVisitor.visitVarInsn(ILOAD, 18);
        methodVisitor.visitInsn(I2L);
        methodVisitor.visitInsn(LADD);
        methodVisitor.visitVarInsn(LSTORE, 8);
        methodVisitor.visitLabel(label56);
        methodVisitor.visitLineNumber(958, label56);
        methodVisitor.visitVarInsn(ILOAD, 12);
        Label label61 = new Label();
        methodVisitor.visitJumpInsn(IFEQ, label61);
        Label label62 = new Label();
        methodVisitor.visitLabel(label62);
        methodVisitor.visitLineNumber(959, label62);
        methodVisitor.visitIincInsn(7, 1);
        methodVisitor.visitLabel(label61);
        methodVisitor.visitLineNumber(960, label61);
        methodVisitor.visitJumpInsn(GOTO, label35);
        methodVisitor.visitLabel(label49);
        methodVisitor.visitVarInsn(ILOAD, 15);
        methodVisitor.visitIntInsn(BIPUSH, 101);
        methodVisitor.visitJumpInsn(IF_ICMPEQ, label25);
        methodVisitor.visitVarInsn(ILOAD, 15);
        methodVisitor.visitIntInsn(BIPUSH, 69);
        Label label63 = new Label();
        methodVisitor.visitJumpInsn(IF_ICMPNE, label63);
        Label label64 = new Label();
        methodVisitor.visitLabel(label64);
        methodVisitor.visitLineNumber(963, label64);
        methodVisitor.visitJumpInsn(GOTO, label25);
        methodVisitor.visitLabel(label63);
        methodVisitor.visitLineNumber(965, label63);
        methodVisitor.visitTypeInsn(NEW, "java/lang/NumberFormatException");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NumberFormatException", "<init>", "()V", false);
        methodVisitor.visitInsn(ATHROW);
        methodVisitor.visitLabel(label35);
        methodVisitor.visitLineNumber(921, label35);
        methodVisitor.visitIincInsn(2, 1);
        methodVisitor.visitIincInsn(3, -1);
        methodVisitor.visitJumpInsn(GOTO, label24);
        methodVisitor.visitLabel(label25);
        methodVisitor.visitLineNumber(968, label25);
        methodVisitor.visitVarInsn(ILOAD, 6);
        Label label65 = new Label();
        methodVisitor.visitJumpInsn(IFNE, label65);
        Label label66 = new Label();
        methodVisitor.visitLabel(label66);
        methodVisitor.visitLineNumber(969, label66);
        methodVisitor.visitTypeInsn(NEW, "java/lang/NumberFormatException");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NumberFormatException", "<init>", "()V", false);
        methodVisitor.visitInsn(ATHROW);
        methodVisitor.visitLabel(label65);
        methodVisitor.visitLineNumber(972, label65);
        methodVisitor.visitVarInsn(ILOAD, 11);
        Label label67 = new Label();
        methodVisitor.visitJumpInsn(IFEQ, label67);
        methodVisitor.visitVarInsn(LLOAD, 8);
        methodVisitor.visitInsn(LNEG);
        Label label68 = new Label();
        methodVisitor.visitJumpInsn(GOTO, label68);
        methodVisitor.visitLabel(label67);
        methodVisitor.visitVarInsn(LLOAD, 8);
        methodVisitor.visitLabel(label68);
        methodVisitor.visitVarInsn(LSTORE, 8);
        Label label69 = new Label();
        methodVisitor.visitLabel(label69);
        methodVisitor.visitLineNumber(973, label69);
        methodVisitor.visitInsn(ICONST_0);
        methodVisitor.visitVarInsn(ISTORE, 18);
        Label label70 = new Label();
        methodVisitor.visitLabel(label70);
        methodVisitor.visitLineNumber(974, label70);
        methodVisitor.visitVarInsn(ILOAD, 6);
        methodVisitor.visitVarInsn(ILOAD, 18);
        methodVisitor.visitInsn(ISUB);
        methodVisitor.visitVarInsn(ISTORE, 19);
        Label label71 = new Label();
        methodVisitor.visitLabel(label71);
        methodVisitor.visitLineNumber(977, label71);
        methodVisitor.visitJumpInsn(GOTO, label1);
        methodVisitor.visitLabel(label23);
        methodVisitor.visitLineNumber(978, label23);
        methodVisitor.visitVarInsn(ILOAD, 3);
        methodVisitor.visitIntInsn(NEWARRAY, T_CHAR);
        methodVisitor.visitVarInsn(ASTORE, 18);
        Label label72 = new Label();
        methodVisitor.visitLabel(label72);
        methodVisitor.visitLineNumber(979, label72);
        methodVisitor.visitVarInsn(ILOAD, 3);
        Label label73 = new Label();
        methodVisitor.visitJumpInsn(IFLE, label73);
        Label label74 = new Label();
        methodVisitor.visitLabel(label74);
        methodVisitor.visitLineNumber(980, label74);
        methodVisitor.visitVarInsn(ALOAD, 1);
        methodVisitor.visitVarInsn(ILOAD, 2);
        methodVisitor.visitInsn(CALOAD);
        methodVisitor.visitVarInsn(ISTORE, 15);
        Label label75 = new Label();
        methodVisitor.visitLabel(label75);
        methodVisitor.visitLineNumber(982, label75);
        methodVisitor.visitVarInsn(ILOAD, 15);
        methodVisitor.visitIntInsn(BIPUSH, 48);
        Label label76 = new Label();
        methodVisitor.visitJumpInsn(IF_ICMPLT, label76);
        methodVisitor.visitVarInsn(ILOAD, 15);
        methodVisitor.visitIntInsn(BIPUSH, 57);
        Label label77 = new Label();
        methodVisitor.visitJumpInsn(IF_ICMPLE, label77);
        methodVisitor.visitLabel(label76);
        methodVisitor.visitVarInsn(ILOAD, 15);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "isDigit", "(C)Z", false);
        Label label78 = new Label();
        methodVisitor.visitJumpInsn(IFEQ, label78);
        methodVisitor.visitLabel(label77);
        methodVisitor.visitLineNumber(985, label77);
        methodVisitor.visitVarInsn(ILOAD, 15);
        methodVisitor.visitIntInsn(BIPUSH, 48);
        Label label79 = new Label();
        methodVisitor.visitJumpInsn(IF_ICMPEQ, label79);
        methodVisitor.visitVarInsn(ILOAD, 15);
        methodVisitor.visitIntInsn(BIPUSH, 10);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "digit", "(CI)I", false);
        Label label80 = new Label();
        methodVisitor.visitJumpInsn(IFNE, label80);
        methodVisitor.visitLabel(label79);
        methodVisitor.visitLineNumber(986, label79);
        methodVisitor.visitVarInsn(ILOAD, 6);
        Label label81 = new Label();
        methodVisitor.visitJumpInsn(IFNE, label81);
        Label label82 = new Label();
        methodVisitor.visitLabel(label82);
        methodVisitor.visitLineNumber(987, label82);
        methodVisitor.visitVarInsn(ALOAD, 18);
        methodVisitor.visitVarInsn(ILOAD, 17);
        methodVisitor.visitVarInsn(ILOAD, 15);
        methodVisitor.visitInsn(CASTORE);
        Label label83 = new Label();
        methodVisitor.visitLabel(label83);
        methodVisitor.visitLineNumber(988, label83);
        methodVisitor.visitInsn(ICONST_1);
        methodVisitor.visitVarInsn(ISTORE, 6);
        Label label84 = new Label();
        methodVisitor.visitJumpInsn(GOTO, label84);
        methodVisitor.visitLabel(label81);
        methodVisitor.visitLineNumber(989, label81);
        methodVisitor.visitVarInsn(ILOAD, 17);
        methodVisitor.visitJumpInsn(IFEQ, label84);
        Label label85 = new Label();
        methodVisitor.visitLabel(label85);
        methodVisitor.visitLineNumber(990, label85);
        methodVisitor.visitVarInsn(ALOAD, 18);
        methodVisitor.visitVarInsn(ILOAD, 17);
        methodVisitor.visitIincInsn(17, 1);
        methodVisitor.visitVarInsn(ILOAD, 15);
        methodVisitor.visitInsn(CASTORE);
        Label label86 = new Label();
        methodVisitor.visitLabel(label86);
        methodVisitor.visitLineNumber(991, label86);
        methodVisitor.visitIincInsn(6, 1);
        methodVisitor.visitJumpInsn(GOTO, label84);
        methodVisitor.visitLabel(label80);
        methodVisitor.visitLineNumber(994, label80);
        methodVisitor.visitVarInsn(ILOAD, 6);
        methodVisitor.visitInsn(ICONST_1);
        Label label87 = new Label();
        methodVisitor.visitJumpInsn(IF_ICMPNE, label87);
        methodVisitor.visitVarInsn(ILOAD, 17);
        Label label88 = new Label();
        methodVisitor.visitJumpInsn(IFEQ, label88);
        methodVisitor.visitLabel(label87);
        methodVisitor.visitLineNumber(995, label87);
        methodVisitor.visitIincInsn(6, 1);
        methodVisitor.visitLabel(label88);
        methodVisitor.visitLineNumber(996, label88);
        methodVisitor.visitVarInsn(ALOAD, 18);
        methodVisitor.visitVarInsn(ILOAD, 17);
        methodVisitor.visitIincInsn(17, 1);
        methodVisitor.visitVarInsn(ILOAD, 15);
        methodVisitor.visitInsn(CASTORE);
        methodVisitor.visitLabel(label84);
        methodVisitor.visitLineNumber(998, label84);
        methodVisitor.visitVarInsn(ILOAD, 12);
        Label label89 = new Label();
        methodVisitor.visitJumpInsn(IFEQ, label89);
        Label label90 = new Label();
        methodVisitor.visitLabel(label90);
        methodVisitor.visitLineNumber(999, label90);
        methodVisitor.visitIincInsn(7, 1);
        methodVisitor.visitJumpInsn(GOTO, label89);
        methodVisitor.visitLabel(label78);
        methodVisitor.visitLineNumber(1003, label78);
        methodVisitor.visitVarInsn(ILOAD, 15);
        methodVisitor.visitIntInsn(BIPUSH, 46);
        Label label91 = new Label();
        methodVisitor.visitJumpInsn(IF_ICMPNE, label91);
        Label label92 = new Label();
        methodVisitor.visitLabel(label92);
        methodVisitor.visitLineNumber(1005, label92);
        methodVisitor.visitVarInsn(ILOAD, 12);
        Label label93 = new Label();
        methodVisitor.visitJumpInsn(IFEQ, label93);
        Label label94 = new Label();
        methodVisitor.visitLabel(label94);
        methodVisitor.visitLineNumber(1006, label94);
        methodVisitor.visitTypeInsn(NEW, "java/lang/NumberFormatException");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NumberFormatException", "<init>", "()V", false);
        methodVisitor.visitInsn(ATHROW);
        methodVisitor.visitLabel(label93);
        methodVisitor.visitLineNumber(1007, label93);
        methodVisitor.visitInsn(ICONST_1);
        methodVisitor.visitVarInsn(ISTORE, 12);
        Label label95 = new Label();
        methodVisitor.visitLabel(label95);
        methodVisitor.visitLineNumber(1008, label95);
        methodVisitor.visitJumpInsn(GOTO, label89);
        methodVisitor.visitLabel(label91);
        methodVisitor.visitLineNumber(1011, label91);
        methodVisitor.visitVarInsn(ILOAD, 15);
        methodVisitor.visitIntInsn(BIPUSH, 101);
        methodVisitor.visitJumpInsn(IF_ICMPEQ, label73);
        methodVisitor.visitVarInsn(ILOAD, 15);
        methodVisitor.visitIntInsn(BIPUSH, 69);
        methodVisitor.visitJumpInsn(IF_ICMPEQ, label73);
        Label label96 = new Label();
        methodVisitor.visitLabel(label96);
        methodVisitor.visitLineNumber(1012, label96);
        methodVisitor.visitTypeInsn(NEW, "java/lang/NumberFormatException");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NumberFormatException", "<init>", "()V", false);
        methodVisitor.visitInsn(ATHROW);
        methodVisitor.visitLabel(label89);
        methodVisitor.visitLineNumber(979, label89);
        methodVisitor.visitIincInsn(2, 1);
        methodVisitor.visitIincInsn(3, -1);
        methodVisitor.visitJumpInsn(GOTO, label72);
        methodVisitor.visitLabel(label73);
        methodVisitor.visitLineNumber(1017, label73);
        methodVisitor.visitVarInsn(ILOAD, 6);
        methodVisitor.visitJumpInsn(IFNE, label1);
        Label label97 = new Label();
        methodVisitor.visitLabel(label97);
        methodVisitor.visitLineNumber(1018, label97);
        methodVisitor.visitTypeInsn(NEW, "java/lang/NumberFormatException");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NumberFormatException", "<init>", "()V", false);
        methodVisitor.visitInsn(ATHROW);
        methodVisitor.visitLabel(label1);
        methodVisitor.visitLineNumber(1026, label1);
        Label label98 = new Label();
        methodVisitor.visitJumpInsn(GOTO, label98);
        methodVisitor.visitLabel(label2);
        methodVisitor.visitLineNumber(1024, label2);
        methodVisitor.visitVarInsn(ASTORE, 11);
        Label label99 = new Label();
        methodVisitor.visitLabel(label99);
        methodVisitor.visitLineNumber(1025, label99);
        methodVisitor.visitTypeInsn(NEW, "java/lang/NumberFormatException");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NumberFormatException", "<init>", "()V", false);
        methodVisitor.visitInsn(ATHROW);
        methodVisitor.visitLabel(label98);
        methodVisitor.visitLineNumber(1028, label98);
        methodVisitor.visitInsn(RETURN);
        Label label100 = new Label();
        methodVisitor.visitLabel(label100);
        methodVisitor.visitLocalVariable("digit", "I", null, label39, label43, 18);
        methodVisitor.visitLocalVariable("digit", "I", null, label51, label61, 18);
        methodVisitor.visitLocalVariable("c", "C", null, label27, label25, 15);
        methodVisitor.visitLocalVariable("mcp", "I", null, label70, label71, 18);
        methodVisitor.visitLocalVariable("c", "C", null, label75, label73, 15);
        methodVisitor.visitLocalVariable("coeff", "[C", null, label72, label1, 18);
        methodVisitor.visitLocalVariable("isneg", "Z", null, label11, label1, 11);
        methodVisitor.visitLocalVariable("dot", "Z", null, label19, label1, 12);
        methodVisitor.visitLocalVariable("exp", "J", null, label20, label1, 13);
        methodVisitor.visitLocalVariable("isCompact", "Z", null, label21, label1, 16);
        methodVisitor.visitLocalVariable("idx", "I", null, label22, label1, 17);
        methodVisitor.visitLocalVariable("e", "Ljava/lang/RuntimeException;", null, label99, label98, 11);
        methodVisitor.visitLocalVariable("in", "[C", null, label4, label100, 1);
        methodVisitor.visitLocalVariable("offset", "I", null, label5, label100, 2);
        methodVisitor.visitLocalVariable("len", "I", null, label6, label100, 3);
        methodVisitor.visitLocalVariable("MAX_COMPACT_DIGITS", "I", null, label7, label100, 5);
        methodVisitor.visitLocalVariable("prec", "I", null, label8, label100, 6);
        methodVisitor.visitLocalVariable("scl", "I", null, label9, label100, 7);
        methodVisitor.visitLocalVariable("rs", "J", null, label10, label100, 8);
        methodVisitor.visitLocalVariable("rb", "Ljava/math/BigInteger;", null, label0, label100, 10);
        methodVisitor.visitMaxs(4, 20);
        methodVisitor.visitEnd();
    }
}
