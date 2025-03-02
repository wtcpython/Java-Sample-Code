package com.wtc.operator.test;

import java.util.Scanner;

public class SplitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个三位数：");
        int num = sc.nextInt();

        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);
        sc.close();
    }
}
