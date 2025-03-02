package com.wtc.advanceclass.polymorphism.test;

public class Cat extends Animal {
    public Cat() {

    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的猫咪在吃" + something);
    }

    public void lookHome() {
        System.out.println("狗在看家");
    }
}
