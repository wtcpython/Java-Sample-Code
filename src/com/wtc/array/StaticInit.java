package com.wtc.array;

public class StaticInit {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };

        for (int num : array) {
            System.out.println(num);
        }

        // 直接输出地址
        // System.out.println(array);

        // 使用索引获取数组的值
        System.out.println(array[3]);
    }
}
