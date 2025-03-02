package com.wtc.loop;

import java.util.Scanner;

public class ElseIfCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score = sc.nextInt();
        sc.close();

        // 需要对异常数据做处理
        if (score >= 0 && score <= 100) {
            if (score >= 95 && score <= 100) {
                System.out.println("获得一辆自行车");
            } else if (score >= 90 && score < 95) {
                System.out.println("游乐场一天");
            } else if (score >= 80 && score < 90) {
                System.out.println("送变形金刚一个");
            } else {
                System.out.println("揍一顿");
            }
        } else {
            System.out.println("成绩非法");
        }
    }
}
