package com.wtc.loop.test;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();

        // 左闭右开
        // 1 ~ 100
        int guess = random.nextInt(1, 101);
        // int number = random.nextInt(100) + 1;
        // int number = random.nextInt(MAX - MIN + 1) + MIN; [MIN, MAX]

        // System.out.println(guess);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("输入你要猜的数字：");
            int number = sc.nextInt();

            if (guess > number) {
                System.out.println("小了");
            } else if (guess < number) {
                System.out.println("大了");
            } else {
                System.out.println("猜中了");
                break;
            }
        }
        sc.close();
    }
}
