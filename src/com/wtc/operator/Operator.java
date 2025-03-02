package com.wtc.operator;

public class Operator {
    public static void main(String[] args) {
        // +
        System.out.println(1 + 2);
        // -
        System.out.println(5 - 1);
        // *
        System.out.println(7 * 9);

        // 小数 存在精度损失
        System.out.println(1.1 + 1.01);
        System.out.println(1.1 - 2.01);
        System.out.println(1.1 * 2.1);

        // /
        System.out.println(10 / 2);
        // 整数除法依旧是整数
        System.out.println(10 / 3);
        System.out.println(10 / 3.0);

        // %
        System.out.println(10 % 3);
    }
}
