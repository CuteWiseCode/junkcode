package com.me.plugin.templates.add;

import static org.objectweb.asm.Opcodes.*;
import  org.objectweb.asm.Opcodes;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;

public class Template20 {

    public static void  fillfromCode(MethodVisitor methodVisitor){
        methodVisitor.visitCode();
        Label label0 = new Label();
        Label label1 = new Label();
        Label label2 = new Label();
        methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/ClassNotFoundException");
        Label label3 = new Label();
        methodVisitor.visitLabel(label3);
        methodVisitor.visitLineNumber(1230, label3);
        methodVisitor.visitInsn(ACONST_NULL);
        methodVisitor.visitVarInsn(ASTORE, 1);
        Label label4 = new Label();
        methodVisitor.visitLabel(label4);
        methodVisitor.visitLineNumber(1231, label4);
        methodVisitor.visitInsn(ICONST_5);
        methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitInsn(ICONST_0);
        methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
        methodVisitor.visitInsn(AASTORE);
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitInsn(ICONST_1);
        methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
        methodVisitor.visitInsn(AASTORE);
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitInsn(ICONST_2);
        methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
        methodVisitor.visitInsn(AASTORE);
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitInsn(ICONST_3);
        methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
        methodVisitor.visitInsn(AASTORE);
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitInsn(ICONST_4);
        methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
        methodVisitor.visitInsn(AASTORE);
        methodVisitor.visitVarInsn(ASTORE, 2);
        Label label5 = new Label();
        methodVisitor.visitLabel(label5);
        methodVisitor.visitLineNumber(1233, label5);
        methodVisitor.visitTypeInsn(NEW, "java/util/IdentityHashMap");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitVarInsn(ALOAD, 2);
        methodVisitor.visitInsn(ARRAYLENGTH);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/IdentityHashMap", "<init>", "(I)V", false);
        methodVisitor.visitVarInsn(ASTORE, 3);
        Label label6 = new Label();
        methodVisitor.visitLabel(label6);
        methodVisitor.visitLineNumber(1234, label6);
        methodVisitor.visitVarInsn(ALOAD, 2);
        methodVisitor.visitVarInsn(ASTORE, 4);
        methodVisitor.visitVarInsn(ALOAD, 4);
        methodVisitor.visitInsn(ARRAYLENGTH);
        methodVisitor.visitVarInsn(ISTORE, 5);
        methodVisitor.visitInsn(ICONST_0);
        methodVisitor.visitVarInsn(ISTORE, 6);
        Label label7 = new Label();
        methodVisitor.visitLabel(label7);
        methodVisitor.visitVarInsn(ILOAD, 6);
        methodVisitor.visitVarInsn(ILOAD, 5);
        Label label8 = new Label();
        methodVisitor.visitJumpInsn(IF_ICMPGE, label8);
        methodVisitor.visitVarInsn(ALOAD, 4);
        methodVisitor.visitVarInsn(ILOAD, 6);
        methodVisitor.visitInsn(AALOAD);
        methodVisitor.visitVarInsn(ASTORE, 7);
        Label label9 = new Label();
        methodVisitor.visitLabel(label9);
        methodVisitor.visitLineNumber(1236, label9);
        methodVisitor.visitInsn(ACONST_NULL);
        methodVisitor.visitVarInsn(ASTORE, 8);
        methodVisitor.visitLabel(label0);
        methodVisitor.visitLineNumber(1238, label0);
        methodVisitor.visitVarInsn(ALOAD, 7);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
        methodVisitor.visitInsn(ICONST_0);
        methodVisitor.visitVarInsn(ALOAD, 1);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Class", "forName", "(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;", false);
        methodVisitor.visitVarInsn(ASTORE, 8);
        methodVisitor.visitLabel(label1);
        methodVisitor.visitLineNumber(1240, label1);
        Label label10 = new Label();
        methodVisitor.visitJumpInsn(GOTO, label10);
        methodVisitor.visitLabel(label2);
        methodVisitor.visitLineNumber(1239, label2);
        methodVisitor.visitVarInsn(ASTORE, 9);
        methodVisitor.visitLabel(label10);
        methodVisitor.visitLineNumber(1241, label10);
        methodVisitor.visitVarInsn(ALOAD, 8);
        methodVisitor.visitVarInsn(ALOAD, 7);
        Label label11 = new Label();
        methodVisitor.visitJumpInsn(IF_ACMPEQ, label11);
        Label label12 = new Label();
        methodVisitor.visitLabel(label12);
        methodVisitor.visitLineNumber(1242, label12);
        methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
        methodVisitor.visitVarInsn(ALOAD, 7);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
        methodVisitor.visitLdcInsn(" is not visible from class loader");
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
        methodVisitor.visitInsn(ATHROW);
        methodVisitor.visitLabel(label11);
        methodVisitor.visitLineNumber(1246, label11);
        methodVisitor.visitVarInsn(ALOAD, 8);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isInterface", "()Z", false);
        Label label13 = new Label();
        methodVisitor.visitJumpInsn(IFNE, label13);
        Label label14 = new Label();
        methodVisitor.visitLabel(label14);
        methodVisitor.visitLineNumber(1247, label14);
        methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
        methodVisitor.visitVarInsn(ALOAD, 8);
        Label label15 = new Label();
        methodVisitor.visitLabel(label15);
        methodVisitor.visitLineNumber(1248, label15);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
        methodVisitor.visitLdcInsn(" is not an interface");
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
        methodVisitor.visitInsn(ATHROW);
        methodVisitor.visitLabel(label13);
        methodVisitor.visitLineNumber(1251, label13);
        methodVisitor.visitVarInsn(ALOAD, 3);
        methodVisitor.visitVarInsn(ALOAD, 8);
        methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
        methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
        Label label16 = new Label();
        methodVisitor.visitJumpInsn(IFNULL, label16);
        Label label17 = new Label();
        methodVisitor.visitLabel(label17);
        methodVisitor.visitLineNumber(1252, label17);
        methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
        methodVisitor.visitLdcInsn("repeated interface: ");
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
        methodVisitor.visitVarInsn(ALOAD, 8);
        Label label18 = new Label();
        methodVisitor.visitLabel(label18);
        methodVisitor.visitLineNumber(1253, label18);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
        methodVisitor.visitInsn(ATHROW);
        methodVisitor.visitLabel(label16);
        methodVisitor.visitLineNumber(1234, label16);
        methodVisitor.visitIincInsn(6, 1);
        methodVisitor.visitJumpInsn(GOTO, label7);
        methodVisitor.visitLabel(label8);
        methodVisitor.visitLineNumber(1257, label8);
        methodVisitor.visitInsn(ACONST_NULL);
        methodVisitor.visitVarInsn(ASTORE, 4);
        Label label19 = new Label();
        methodVisitor.visitLabel(label19);
        methodVisitor.visitLineNumber(1258, label19);
        methodVisitor.visitIntInsn(BIPUSH, 17);
        methodVisitor.visitVarInsn(ISTORE, 5);
        Label label20 = new Label();
        methodVisitor.visitLabel(label20);
        methodVisitor.visitLineNumber(1261, label20);
        methodVisitor.visitVarInsn(ALOAD, 2);
        methodVisitor.visitVarInsn(ASTORE, 6);
        methodVisitor.visitVarInsn(ALOAD, 6);
        methodVisitor.visitInsn(ARRAYLENGTH);
        methodVisitor.visitVarInsn(ISTORE, 7);
        methodVisitor.visitInsn(ICONST_0);
        methodVisitor.visitVarInsn(ISTORE, 8);
        Label label21 = new Label();
        methodVisitor.visitLabel(label21);
        methodVisitor.visitVarInsn(ILOAD, 8);
        methodVisitor.visitVarInsn(ILOAD, 7);
        Label label22 = new Label();
        methodVisitor.visitJumpInsn(IF_ICMPGE, label22);
        methodVisitor.visitVarInsn(ALOAD, 6);
        methodVisitor.visitVarInsn(ILOAD, 8);
        methodVisitor.visitInsn(AALOAD);
        methodVisitor.visitVarInsn(ASTORE, 9);
        Label label23 = new Label();
        methodVisitor.visitLabel(label23);
        methodVisitor.visitLineNumber(1262, label23);
        methodVisitor.visitVarInsn(ALOAD, 9);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getModifiers", "()I", false);
        methodVisitor.visitVarInsn(ISTORE, 10);
        Label label24 = new Label();
        methodVisitor.visitLabel(label24);
        methodVisitor.visitLineNumber(1263, label24);
        methodVisitor.visitVarInsn(ILOAD, 10);
        methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/reflect/Modifier", "isPublic", "(I)Z", false);
        Label label25 = new Label();
        methodVisitor.visitJumpInsn(IFNE, label25);
        Label label26 = new Label();
        methodVisitor.visitLabel(label26);
        methodVisitor.visitLineNumber(1264, label26);
        methodVisitor.visitIntInsn(BIPUSH, 16);
        methodVisitor.visitVarInsn(ISTORE, 5);
        Label label27 = new Label();
        methodVisitor.visitLabel(label27);
        methodVisitor.visitLineNumber(1265, label27);
        methodVisitor.visitVarInsn(ALOAD, 9);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
        methodVisitor.visitVarInsn(ASTORE, 11);
        Label label28 = new Label();
        methodVisitor.visitLabel(label28);
        methodVisitor.visitLineNumber(1266, label28);
        methodVisitor.visitVarInsn(ALOAD, 11);
        methodVisitor.visitIntInsn(BIPUSH, 46);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "lastIndexOf", "(I)I", false);
        methodVisitor.visitVarInsn(ISTORE, 12);
        Label label29 = new Label();
        methodVisitor.visitLabel(label29);
        methodVisitor.visitLineNumber(1267, label29);
        methodVisitor.visitVarInsn(ILOAD, 12);
        methodVisitor.visitInsn(ICONST_M1);
        Label label30 = new Label();
        methodVisitor.visitJumpInsn(IF_ICMPNE, label30);
        methodVisitor.visitLdcInsn("");
        Label label31 = new Label();
        methodVisitor.visitJumpInsn(GOTO, label31);
        methodVisitor.visitLabel(label30);
        methodVisitor.visitVarInsn(ALOAD, 11);
        methodVisitor.visitInsn(ICONST_0);
        methodVisitor.visitVarInsn(ILOAD, 12);
        methodVisitor.visitInsn(ICONST_1);
        methodVisitor.visitInsn(IADD);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(II)Ljava/lang/String;", false);
        methodVisitor.visitLabel(label31);
        methodVisitor.visitVarInsn(ASTORE, 13);
        Label label32 = new Label();
        methodVisitor.visitLabel(label32);
        methodVisitor.visitLineNumber(1268, label32);
        methodVisitor.visitVarInsn(ALOAD, 4);
        methodVisitor.visitJumpInsn(IFNONNULL, label25);
        Label label33 = new Label();
        methodVisitor.visitLabel(label33);
        methodVisitor.visitLineNumber(1269, label33);
        methodVisitor.visitVarInsn(ALOAD, 13);
        methodVisitor.visitVarInsn(ASTORE, 4);
        methodVisitor.visitLabel(label25);
        methodVisitor.visitLineNumber(1261, label25);
        methodVisitor.visitIincInsn(8, 1);
        methodVisitor.visitJumpInsn(GOTO, label21);
        methodVisitor.visitLabel(label22);
        methodVisitor.visitLineNumber(1274, label22);
        methodVisitor.visitVarInsn(ALOAD, 4);
        Label label34 = new Label();
        methodVisitor.visitJumpInsn(IFNONNULL, label34);
        Label label35 = new Label();
        methodVisitor.visitLabel(label35);
        methodVisitor.visitLineNumber(1276, label35);
        methodVisitor.visitLdcInsn("");
        methodVisitor.visitVarInsn(ASTORE, 4);
        Label label36 = new Label();
        methodVisitor.visitLabel(label36);
        methodVisitor.visitLineNumber(1277, label36);
        methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
        methodVisitor.visitInsn(DUP);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
        methodVisitor.visitVarInsn(ILOAD, 5);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
        methodVisitor.visitLdcInsn("");
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
        methodVisitor.visitLabel(label34);
        methodVisitor.visitLineNumber(1280, label34);
        methodVisitor.visitInsn(RETURN);
        Label label37 = new Label();
        methodVisitor.visitLabel(label37);
        methodVisitor.visitLocalVariable("interfaceClass", "Ljava/lang/Class;", "Ljava/lang/Class<*>;", label0, label16, 8);
        methodVisitor.visitLocalVariable("intf", "Ljava/lang/Class;", "Ljava/lang/Class<*>;", label9, label16, 7);
        methodVisitor.visitLocalVariable("name", "Ljava/lang/String;", null, label28, label25, 11);
        methodVisitor.visitLocalVariable("n", "I", null, label29, label25, 12);
        methodVisitor.visitLocalVariable("pkg", "Ljava/lang/String;", null, label32, label25, 13);
        methodVisitor.visitLocalVariable("flags", "I", null, label24, label25, 10);
        methodVisitor.visitLocalVariable("intf", "Ljava/lang/Class;", "Ljava/lang/Class<*>;", label23, label25, 9);
        methodVisitor.visitLocalVariable("loader", "Ljava/lang/ClassLoader;", null, label4, label37, 1);
        methodVisitor.visitLocalVariable("interfaces", "[Ljava/lang/Class;", "[Ljava/lang/Class<*>;", label5, label37, 2);
        methodVisitor.visitLocalVariable("interfaceSet", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/Class<*>;Ljava/lang/Boolean;>;", label6, label37, 3);
        methodVisitor.visitLocalVariable("proxyPkg", "Ljava/lang/String;", null, label19, label37, 4);
        methodVisitor.visitLocalVariable("accessFlags", "I", null, label20, label37, 5);
        methodVisitor.visitMaxs(4, 14);
        methodVisitor.visitEnd();
    }
}
