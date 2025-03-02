package com.wtc.basicconcept;

import java.util.Scanner;

public class KeyBoard {
    public static void main(String[] args) {
        // nextInt();
        // nextDouble();
        // next();
        // 遇到空格停止接收

        // nextLine();
        Scanner sc = new Scanner(System.in);
        // System.out.println("请输入第一个整数：");
        // int num = sc.nextInt();
        // System.out.println(num);
        // System.out.println("请输入第二个整数：");
        // int num2 = sc.nextInt();
        // System.out.println(num2);

        // System.out.println("请输入第一个字符串：");
        // String s = sc.next();
        // System.out.println(s);
        // System.out.println("请输入第二个字符串：");
        // String s2 = sc.next();
        // System.out.println(s2);

        System.out.println("请输入第一个字符串：");
        String s3 = sc.nextLine();
        System.out.println(s3);
        System.out.println("请输入第二个字符串：");
        String s4 = sc.nextLine();
        System.out.println(s4);

        sc.close();
    }
}
