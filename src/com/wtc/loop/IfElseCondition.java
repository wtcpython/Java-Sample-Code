package com.wtc.loop;

import java.util.Scanner;

public class IfElseCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你有多少钱：");
        int money = sc.nextInt();
        sc.close();

        if (money >= 100) {
            System.out.println("吃大餐");
        } else {
            System.out.println("吃沙县");
        }
    }
}
