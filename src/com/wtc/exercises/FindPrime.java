package com.wtc.exercises;

public class FindPrime {
    private static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        if (number == 2)
            return true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // 判断 101 ~ 200 之间有多少个质数，并打印所有质数
        int start = 101;
        int end = 200;

        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }

        System.out.println("一共有" + count + "个质数");
    }
}
