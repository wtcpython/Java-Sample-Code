package com.wtc.method;

public class Transmit {
    private static void change(int number) {
        number = 200;
    }

    private static void change(int[] arr) {
        arr[1] = 200;
    }

    public static void main(String[] args) {
        // 基本数据类型
        int num = 100;
        change(num);
        System.out.println(num);

        // 引用数据类型
        int[] arr = { 1, 2, 3 };
        change(arr);
        System.out.println(arr[1]);
    }
}
