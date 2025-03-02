package com.wtc.innerclass;

public class Test {
    public static void main(String[] args) {

        // Outer o = new Outer();
        // System.out.println(o.name);

        // 创建内部类对象
        // 在创建内部类的同时，也要初始化外部类对象
        // Outer.Inner oi = new Outer().new Inner();

        Outer o = new Outer();
        System.out.println(o.getInstance());

    }
}
