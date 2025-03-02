package com.wtc.advanceclass.polymorphism.test;

public class Dog extends Animal {
    public Dog() {

    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的狗在吃" + something);
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
