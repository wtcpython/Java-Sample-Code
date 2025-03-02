package com.wtc.exception;
public class Init {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(50); // RuntimeException: 年龄超出范围
    }
}
