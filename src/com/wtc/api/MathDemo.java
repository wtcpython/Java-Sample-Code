package com.wtc.api;

public class MathDemo {
    public static void main(String[] args) {
        // abs 获取绝对值
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));

        System.out.println(Math.abs(-2147483648));
        System.out.println(Math.abs(-2147483648L));

        // ceil 向上取整
        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(12.54));
        System.out.println(Math.ceil(-12.34));
        System.out.println(Math.ceil(-12.54));

        System.out.println("--------------------");

        // floor 向下取整
        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor(12.54));
        System.out.println(Math.floor(-12.34));
        System.out.println(Math.floor(-12.54));

        System.out.println("--------------------");

        // round 四舍五入
        System.out.println(Math.round(12.34));
        System.out.println(Math.round(12.54));
        System.out.println(Math.round(-12.34));
        System.out.println(Math.round(-12.54));

        System.out.println("--------------------");

        // max min
        System.out.println(Math.max(20, 30));
        System.out.println(Math.min(20, 30));

        System.out.println("--------------------");

        // pow a ^ b
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.pow(4, 0.5));
        System.out.println(Math.pow(2, -2));

        System.out.println("--------------------");

        // sqrt
        System.out.println(Math.sqrt(4));
        System.out.println(Math.cbrt(8)); // 开立方

        System.out.println("--------------------");

        // random 范围 [0.0, 1.0)
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }
    }
}
