package com.wtc.interfaceclass.defaultmethod;

public interface InterA {
    public abstract void method();

    public default void show() {
        System.out.println("InterA 接口中的默认方法");
    }
}
