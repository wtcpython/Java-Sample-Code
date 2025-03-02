package com.wtc.api.datetime.packageclass;

public class Test {
    public static void main(String[] args) {
        // Integer 在 -128 ~ 127 之间为引用，数据优化
        Integer i1 = Integer.valueOf(123);
        Integer i2 = Integer.valueOf("123");
        Integer i3 = Integer.valueOf("123", 8);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }
}
