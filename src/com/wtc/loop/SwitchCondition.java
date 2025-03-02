package com.wtc.loop;

import java.util.Scanner;

public class SwitchCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String noodles = sc.nextLine();
        sc.close();

        switch (noodles) {
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("武汉热干面");
                break;
            case "北京炸酱面":
                System.out.println("北京炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("陕西油泼面");
                break;
            default:
                System.out.println("吃方便面");
                break;
        }
    }
}
