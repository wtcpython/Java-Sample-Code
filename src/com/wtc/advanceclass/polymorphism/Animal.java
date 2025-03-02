package com.wtc.advanceclass.polymorphism;

public class Animal {

    String name = "动物";

    public void show() {
        System.out.println("Animal --- show 方法");
    }
}

class Dog extends Animal {
    String name = "狗";

    @Override
    public void show() {
        System.out.println("Dog --- show 方法");
    }
}

class Cat extends Animal {
    String name = "猫";

    @Override
    public void show() {
        System.out.println("Cat --- show 方法");
    }
}
