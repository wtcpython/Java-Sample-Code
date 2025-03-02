package com.wtc.interfaceclass.staticmethod;

public class InterImpl implements Inter {

    @Override
    public void method() {
        System.out.println("InterImpl 重写的抽象方法");
    }

    public static void show() {
        System.out.println("InterImpl 中的 show 方法");
    }
}
