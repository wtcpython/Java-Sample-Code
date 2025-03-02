package com.wtc.loop;

import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入酒量：");
        int value = sc.nextInt();
        sc.close();

        if (value > 2) {
            System.out.println("酒量不错哟！");
        }
    }
}
