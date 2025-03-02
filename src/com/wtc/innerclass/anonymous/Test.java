package com.wtc.innerclass.anonymous;

public class Test {
    public static void main(String[] args) {
        // Animal a = new Animal() {
        // @Override
        // public void eat() {
        // System.out.println("重写 eat 方法");
        // }
        // };
        // a.eat();
        // method(new Animal() {
        // @Override
        // public void eat() {
        // System.out.println("重写 eat 方法");
        // }
        // });

        new Animal() {
            @Override
            public void eat() {
                System.out.println("重写 eat 方法");
            }
        }.eat();
    }

    public static void method(Animal a) {
        a.eat();
    }
}
