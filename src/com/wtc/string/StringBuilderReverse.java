package com.wtc.string;

import java.util.Scanner;

public class StringBuilderReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.next();
        sc.close();

        String res = new StringBuilder(s).reverse().toString();

        if (s.equals(res)) {
            System.out.println("是对称字符串");
        } else {
            System.out.println("不是对称字符串");
        }
    }
}
