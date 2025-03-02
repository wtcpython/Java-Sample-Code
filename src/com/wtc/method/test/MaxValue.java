package com.wtc.method.test;

public class MaxValue {
    private static int getMaxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 10, 7, 4, 5 };
        int res = getMaxValue(arr);
        System.out.println(res);
    }
}
