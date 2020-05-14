package com.mj;

public class Main {

    public static void main(String[] args) {

        // 像这样一旦定义好一个数组后，大小就不能变了
        int array [] = new int[] {11,22,33};

        // 使用自己定义的 动态数组
        MyArrayList list = new MyArrayList();
        list.get(0);
    }

}
