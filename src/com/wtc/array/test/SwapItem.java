package com.wtc.array.test;

public class SwapItem {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        // int temp = arr[0];
        // arr[0] = arr[4];
        // arr[4] = temp;

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
