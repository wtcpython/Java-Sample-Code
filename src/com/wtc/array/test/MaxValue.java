package com.wtc.array.test;

public class MaxValue {
    public static void main(String[] args) {
        int[] array = { 33, 5, 22, 44, 55 };

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
