package com.wtc.api.test;

public class Rabbit {
    public static void main(String[] args) {
        int[] arr = new int[12];
        arr[0] = arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        System.out.println(arr[arr.length - 1]);

        System.out.println(Fib(12));
    }

    private static int Fib(int month) {
        if (month == 1 || month == 2) {
            return 1;
        }
        return Fib(month - 1) + Fib(month - 2);
    }
}
