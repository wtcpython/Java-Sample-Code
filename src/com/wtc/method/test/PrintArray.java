package com.wtc.method.test;

public class PrintArray {
    private static void printArr(int[] arr) {
        System.out.print("[" + arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.print(", " + arr[i]);
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] arr = { 11, 22, 33, 44, 55 };
        printArr(arr);
    }
}
