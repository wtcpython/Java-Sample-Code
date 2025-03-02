package com.wtc.operator;

public class StringCombine {
    public static void main(String[] args) {
        String s1 = "123" + 123;
        String s2 = 1 + 99 + "123";
        System.out.println(s1);
        System.out.println(s2);

        // 字符串一律为拼接操作
        System.out.println(3.7 + "abc");
        System.out.println("abc" + true);

        int age = 18;
        System.out.println("年龄是" + age + "岁");

        // 在拼接的时候，从左到右依次运算
        System.out.println(1 + 2 + "abc" + 1 + 2);
    }
}
