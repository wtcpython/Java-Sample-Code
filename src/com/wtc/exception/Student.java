package com.wtc.exception;

import com.wtc.exception.test.AgeOutOfBoundsException;
import com.wtc.exception.test.NameFormatException;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        int len = name.length();
        if (len < 3 || len > 10) {
            throw new NameFormatException(name + " 格式有误，长度应为：3~10");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 40) {
            throw new AgeOutOfBoundsException(age + " 年龄超出范围");
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}
