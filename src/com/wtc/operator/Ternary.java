package com.wtc.operator;

public class Ternary {
    public static void main(String[] args) {
        // 三元运算符
        // 关系表达式 ? 表达式1: 表达式2
        int a = 5;
        int b = 3;
        int c = a > b ? a : b;
        System.out.println(c);

        int h1 = 150;
        int h2 = 210;
        int h3 = 165;
        int maxh = h1 > h2 ? (h1 > h3 ? h1 : h3) : (h2 > h3 ? h2 : h3);
        System.out.println(maxh);
    }
}
