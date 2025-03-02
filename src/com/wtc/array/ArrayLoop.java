package com.wtc.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        // 方式一
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 方式二
        // arr.length 获取长度
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
