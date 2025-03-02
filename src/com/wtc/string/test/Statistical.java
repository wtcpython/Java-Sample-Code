package com.wtc.string.test;

import java.util.Scanner;

public class Statistical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");

        String s = sc.next();
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >= 'a' && c <= 'z') {
                smallCount++;
            } else if (c >= '0' && c <= '9') {
                numberCount++;
            }
        }
        sc.close();
        System.out.println(bigCount);
        System.out.println(smallCount);
        System.out.println(numberCount);
    }
}
