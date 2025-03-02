package com.wtc.advanceclass.abstractmethod;

public abstract class Person {
    String name;
    int age;

    public Person() {
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

    // 抽象方法，父类也必须是抽象类
    public abstract void work();

    public void sleep() {
        System.out.println("睡觉");
    }
}
