package com.wtc.exercises;

import java.util.Scanner;

public class SellTickets {
    public static void main(String[] args) {
        // 机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
        // 按照如下规则计算机票价格:旺季（5-10月）头等舱9折,经济舱8.5折，
        // 淡季（11月到次年4月）头等舱7折，经济舱6.5折。

        // 需求分析
        // 1. 键盘录入机票原价、月份、头等舱或经济舱
        Scanner sc = new Scanner(System.in);
        System.out.println("输入机票的原价：");
        int ticket = sc.nextInt();
        System.out.println("输入当前月份：");
        int month = sc.nextInt();
        System.out.println("输入购买的机票类型（0 头等舱，1 经济舱）：");
        int seat = sc.nextInt();
        sc.close();
        // 2. 判断月份是旺季还是淡季
        double result;
        if (month >= 5 && month <= 10) {
            // 3. 判断机票是经济舱还是头等舱
            // 旺季
            if (seat == 0) {
                result = ticket * 0.9;
            } else {
                result = ticket * 0.85;
            }
        } else {
            // 淡季
            if (seat == 0) {
                result = ticket * 0.7;
            } else {
                result = ticket * 0.65;
            }
        }

        // 4. 计算价格
        System.out.println(result);
    }
}
