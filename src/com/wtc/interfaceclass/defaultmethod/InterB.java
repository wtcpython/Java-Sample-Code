package com.wtc.interfaceclass.defaultmethod;

public interface InterB {
    public default void show() {
        System.out.println("InterB 接口中的默认方法");
    }
}
