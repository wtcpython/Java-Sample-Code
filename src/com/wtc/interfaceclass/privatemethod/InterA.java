package com.wtc.interfaceclass.privatemethod;

public interface InterA {
    public default void show1() {
        System.out.println("show1方法开始执行了");
        show3();
    }

    public default void show2() {
        System.out.println("show2方法开始执行了");
        show3();
    }

    // 普通的私有方法，给 default 方法使用
    private void show3() {
        System.out.println("记录程序在运行过程中的各种细节,这里有100行代码");
    }
}
