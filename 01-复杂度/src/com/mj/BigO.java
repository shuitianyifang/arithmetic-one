package com.mj;

/**
 * 大O 表示法来描述复杂度
 * 大O 是一种粗略的分析模型，是一种估算
 * 复杂度从低到高为：常数-> logn -> n -> nlogn -> n^2 -> n^3 -> 2^n -> n! -> n^n
 */
public class BigO {

    public static void test1(int n) {
        // 汇编指令

        // 1
        if (n > 10) {
            System.out.println("n > 10");
        } else if (n > 5) { // 2
            System.out.println("n > 5");
        } else {
            System.out.println("n <= 5");
        }

        // 1 + 4 + 4 + 4
        for (int i = 0; i < 4; i++) {
            System.out.println("test");
        }

        // 忽略常熟，为：
        // O(1)

    }

    public static void test2(int n) {
        // 1 + 3n
        for (int i = 0; i < n; i++) {
            System.out.println("test");
        }

        // 忽略低阶，为：
        // O(n)
    }

    public static void test3(int n) {
        // 1 + 2n + n * (1 + 3n)
        // 1 + 2n + n + 3n^2
        // 3n^2 + 3n + 1

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("test");
            }
        }

        // 忽略低阶，为：
        // O(n^2)
    }

    public static void test4(int n) {
        // 1 + 2n + n * (1 + 45)
        // 1 + 2n + 46n
        // 48n + 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.println("test");
            }
        }

        // 忽略低阶，为：
        // O(n)
    }

    public static void test5(int n) {
        // 8 = 2^3
        // 16 = 2^4

        // 3 = log2(8)
        // 4 = log2(16)

        // 执行次数 = log2(n)
        while ((n = n / 2) > 0) {
            System.out.println("test");
        }

        // 忽略底数，为：
        // O(logn)
    }

    public static void test6(int n) {
        // log5(n)
        while ((n = n / 5) > 0) {
            System.out.println("test");
        }

        // 忽略底数，为：
        // O(logn)
    }

    public static void test7(int n) {
        // 1 + 2*log2(n) + log2(n) * (1 + 3n)

        // 1 + 3*log2(n) + 2 * nlog2(n)
        for (int i = 1; i < n; i = i * 2) {
            // 1 + 3n
            for (int j = 0; j < n; j++) {
                System.out.println("test");
            }
        }

        // 忽略底数，为：
        // O(logn + nlogn)
        // 再忽略低阶，为：
        // O(nlogn)
    }

}
