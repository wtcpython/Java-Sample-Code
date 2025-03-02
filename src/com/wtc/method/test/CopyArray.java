package com.wtc.method.test;

public class CopyArray {
    private static int[] copyArray(int[] arr, int start, int end) {
        int[] newArr = new int[end - start];
        for (int i = start; i < end; i++) {
            newArr[i - start] = arr[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] newArr = copyArray(arr, 3, 7);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
