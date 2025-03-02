package com.wtc.operator;

public class SelfIncDec {
    public static void main(String[] args) {
        int a = 10;
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
        a--;
        System.out.println(a);
        --a;
        System.out.println(a);

        // 前置自增，后置自增
        int x = 10;
        int y = x++;
        int z = ++x;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
