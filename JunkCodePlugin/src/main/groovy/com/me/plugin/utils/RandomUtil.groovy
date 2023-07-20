package com.me.plugin.utils

import org.objectweb.asm.Opcodes


/**
 * @Desc: 生成一个随机的字符串
 */
class RandomUtil {
    private static RandomUtil instance = null;

    static def ACC_LIST = [Opcodes.ACC_PRIVATE, Opcodes.ACC_PUBLIC, Opcodes.ACC_PROTECTED]
    static def ACC_LIST1 = [Opcodes.ACC_STATIC, Opcodes.ACC_FINAL]
    static def DESC_LIST = ["Ljava/lang/String;", "Z", "C", "B", "S", "I", "F", "J", "D", "[I"]

    static RandomUtil getInstance() {
        if (instance == null) {
            instance = new RandomUtil()
        }

        return instance;
    }


    /**
     *
     * @return
     */
    static String genRandomStr() {
        Random randomC = new Random();
        int count = randomC.nextInt(7) + 3;
        Random random = new Random()
        String str = "abcdefghijklmnopqrstuvwxyz"
        StringBuilder sb = new StringBuilder()
        for (int j = 0; j < count; j++) {
            int number = random.nextInt(26)
            sb.append(str.charAt(number))
        }

        return sb.toString()
    }


    static int getOpcode() {

        def flag = ACC_LIST[new Random().nextInt(ACC_LIST.size)]
        def acc = ACC_LIST1[new Random().nextInt(ACC_LIST1.size)]
        return flag + acc;
    }


    static String getDescriptor() {
        return DESC_LIST[new Random().nextInt(DESC_LIST.size)]
    }

    static String getMethodDescriptor() {
        return "(${DESC_LIST[new Random().nextInt(DESC_LIST.size)]}) ${DESC_LIST[new Random().nextInt(DESC_LIST.size)]}"
    }

    static int getRandomNumber(int bound) {
        Random random
        if (random == null)
            random = Random.newInstance()
        if (bound <= 0) bound = 10

        def ran = random.nextInt(bound)
        if (ran == 0) ran = 1
        return ran
    }


    Random random
    Set<Integer> set
    int getRandomInteger(int bound, boolean isGet) {

        if (bound <= 0) bound = 10
        if (isGet) {
            if (random == null) {
                random = Random.newInstance()
                set = new LinkedHashSet<>()
            }
            if (set.isEmpty()) {
                while (set.size() < bound) {
                    int ran = random.nextInt(bound)
                    set.add(ran)
                }
            }
        } else {
            if (set != null)
                set.clear()
        }


        int ran = 0
        if (set != null && set.iterator().hasNext()) {
            ran = set.iterator().next()
            set.remove(ran)
        }

        return ran
    }
}