package com.wtc.method;

import java.util.Scanner;

public class ParamMethod {
    private static void getSum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
    }

    private static void getArea(double r) {
        double result = r * r * Math.PI;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入两个整数：");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        getSum(num1, num2);

        getArea(1.5);
    }
}
