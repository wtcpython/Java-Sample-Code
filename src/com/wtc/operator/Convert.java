package com.wtc.operator;

public class Convert {
    public static void main(String[] args) {
        int a = 10;
        double b = 12.3;
        var c = a + b;
        System.out.println(c);

        // 隐式转换
        // 数据类型转换为范围更大的数据时，会自动转换类型
        int d = 10;
        double e = d;
        System.out.println(e);

        // byte, short, char 会自动提升为 int 类型
        byte f = 10;
        byte g = 20;
        // byte h = f + g;
        int h = f + g;
        System.out.println(h);

        // 强制转换
        // 有可能会导致精度丢失
        int i = 300;
        byte j = (byte) i;
        System.out.println(j);
    }
}
