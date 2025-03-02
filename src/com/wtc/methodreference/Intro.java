package com.wtc.methodreference;

import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {
        Integer[] arr = { 3, 5, 4, 1, 6, 2 };

        // Arrays.sort(arr, (o1, o2) -> o2 - o1);
        Arrays.sort(arr, Intro::subtraction);

        System.out.println(Arrays.toString(arr));
    }

    public static int subtraction(int num1, int num2) {
        return num2 - num1;
    }
}
