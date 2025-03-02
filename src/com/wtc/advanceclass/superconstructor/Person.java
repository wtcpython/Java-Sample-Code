package com.wtc.advanceclass.superconstructor;

public class Person {
    String name;
    int age;

    public Person() {
        System.out.println("Person 类的无参构造");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
