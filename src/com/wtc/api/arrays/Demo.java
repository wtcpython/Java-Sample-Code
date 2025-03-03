package com.wtc.api.arrays;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        System.out.println("----------toString----------");
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.toString(arr));

        System.out.println("----------binarySearch----------");
        // 数据不存在时，返回的是 - 插入点 - 1
        System.out.println(Arrays.binarySearch(arr, 0));
        System.out.println(Arrays.binarySearch(arr, 5));
        System.out.println(Arrays.binarySearch(arr, 10));
        System.out.println(Arrays.binarySearch(arr, 20));

        System.out.println("----------copyOf----------");
        int[] newArr1 = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(newArr1));

        System.out.println("----------copyOfRange----------");
        int[] newArr2 = Arrays.copyOfRange(arr, 0, 9);
        System.out.println(Arrays.toString(newArr2));

        System.out.println("----------fill----------");
        Arrays.fill(arr, 100);
        System.out.println(Arrays.toString(arr));

        System.out.println("----------sort----------");
        int[] arr2 = { 10, 2, 3, 5, 6, 1, 7, 8, 4, 9 };
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
