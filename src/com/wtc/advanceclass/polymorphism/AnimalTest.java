package com.wtc.advanceclass.polymorphism;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Dog();

        // 调用成员变量时，编译看左边，运行看右边
        System.out.println(a.name);

        // 调用成员方法时，编译看左边，运行看右边
        a.show();
    }
}
