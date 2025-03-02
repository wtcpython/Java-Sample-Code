package com.wtc.object;

public class Student {
    private String name;

    private int age;

    public Student() {
        System.out.println("默认构造函数");
    }

    public Student(String name, int age) {
        System.out.println("带参构造函数");
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
