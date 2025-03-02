package com.wtc.iterable.map;

import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<Student, String> tm = new TreeMap<>();

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);

        tm.put(s1, "江苏");
        tm.put(s2, "天津");
        tm.put(s3, "北京");

        System.out.println(tm);
    }
}
