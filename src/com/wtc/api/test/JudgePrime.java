package com.wtc.api.test;

public class JudgePrime {
    public static void main(String[] args) {
        System.out.println(isPrime(13));
        System.out.println(isPrime(10));
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
