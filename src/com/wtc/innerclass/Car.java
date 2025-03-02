package com.wtc.innerclass;

public class Car {
    String name;
    int age;
    String color;

    public void show() {
        System.out.println(name);

        Engine e = new Engine();
        System.out.println(e.name);
    }

    class Engine {
        String name;
        int age;

        public void show() {
            System.out.println(name);
            System.out.println(Car.this.name);
        }
    }
}
