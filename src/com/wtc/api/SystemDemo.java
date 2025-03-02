package com.wtc.api;

public class SystemDemo {
    public static void main(String[] args) {
        // System.exit(0);

        // System.out.println("看看我执行了吗？");

        System.out.println(System.currentTimeMillis());

        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr2 = new int[10];

        // System.arraycopy(arr1, 0, arr2, 0, 5);

        // 0 0 7 8 9 0 0 0 0 0
        System.arraycopy(arr1, 6, arr2, 2, 3);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
