package com.wtc.advanceclass.superconstructor;

public class Student extends Person {
    public Student() {
        super();
        System.out.println("Student 类的无参构造");
    }

    public Student(String name, int age) {
        super(name, age);
    }
}
