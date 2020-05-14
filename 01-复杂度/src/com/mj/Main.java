package com.mj;

public class Main {

    /**
     * 斐波那契数
     * 0 1 1 2 3 5 8 13 21  (值)
     * 1 2 3 4 5 6 7 8 9    (下标)
     */

    // 方法一：用递归的形式
    // 存在问题：当 n 较大时（比如64），这种算法算的就非常慢了
    public static int fib1(int n){
        if(n <= 1){
            return n;
        }
        return fib1(n -1) + fib1(n -2);
    }

    // 方法二：相加法
    // 当计算次数很大时，运算时间依旧很短很短
    public static int fib2(int n){
        if(n <= 1){
            return n;
        }
        int first = 0;
        int second = 1;

        // 需要相加的次数（n-1），如：n 为 5 时，加 4 次即可得到值
        for (int i = 0; i < n-1; i++) {

            // 可以观察出：前一次相加的第二个数，为下一次相加时的第一个数；
            //            前一次相加的值，为下一次相加的第二个数
            int sum = first + second;
            first = second;
            second = sum;
        }

        return second;
    }



    public static void main(String[] args) {
        int n = 80;

        // TimeTool.check("fib1", new TimeTool.Task() {
        //     @Override
        //     public void execute() {
        //         System.out.println(fib1(n));
        //     }
        // });
        TimeTool.check("fib2", new TimeTool.Task() {
            @Override
            public void execute() {
                System.out.println(fib2(n));
            }
        });
    }

}
