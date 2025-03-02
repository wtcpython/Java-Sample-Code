package com.wtc.string;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        // 对于基本数据类型，比较的是数据值
        // int a = 10;
        // int b = 10;
        // System.out.println(a == b);

        // 引用数据类型，比较的是地址
        String s1 = new String("aaa");
        String s2 = new String("aaa");
        System.out.println(s1 == s2);

        // String 比较使用 equals 方法
        System.out.println(s1.equals(s2));

        // equalsIgnoreCase 忽略大小写
        String s3 = new String("AAA");
        System.out.println(s1.equalsIgnoreCase(s3));

        // Scanner 输入的字符串和直接创建的地址不一样
        Scanner sc = new Scanner(System.in);

        String s4 = sc.next(); // new 了一个
        sc.close();

        String s5 = "abc";
        System.out.println(s4 == s5); // false
    }
}
