package com.wtc.loop.test;

public class JumpSeven {
    public static void main(String[] args) {
        // 逢 7 过
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
