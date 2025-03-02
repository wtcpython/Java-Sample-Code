package com.wtc.api;

import java.util.Objects;

public class ObjectsDemo {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 23);
        // Student s1 = null;
        Student s2 = new Student("zhangsan", 23);

        // System.out.println(s1.equals(s2));

        // 避免空指针异常
        System.out.println(Objects.equals(s1, s2));

        Student s3 = new Student();
        Student s4 = null;
        System.out.println(Objects.isNull(s3));
        System.out.println(Objects.isNull(s4));
        System.out.println(Objects.nonNull(s3));
        System.out.println(Objects.nonNull(s4));
    }
}
