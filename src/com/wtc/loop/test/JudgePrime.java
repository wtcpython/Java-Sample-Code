package com.wtc.loop.test;

public class JudgePrime {
    public static void main(String[] args) {
        int num = 1000000;
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                flag = false;
            }
        }

        if (flag) {
            System.out.println("是质数");
        } else {
            System.out.println("不是质数");
        }
    }
}
