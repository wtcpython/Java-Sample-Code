package com.wtc.operator;

public class Logical {
    public static void main(String[] args) {
        // 逻辑与，非
        System.out.println(true & true);
        System.out.println(true & false);

        System.out.println(true | true);
        System.out.println(true | false);

        // 逻辑异或，逻辑非
        System.out.println(2 ^ 3);
        System.out.println(2 ^ 2);

        boolean b = false;
        System.out.println(!b);
        System.out.println(b);
    }
}
