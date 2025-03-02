package com.wtc.loop.test;

public class JumpLoop {
    public static void main(String[] args) {
        // continue 会直接进入下一次循环
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

        // break 会退出循环
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
    }
}
