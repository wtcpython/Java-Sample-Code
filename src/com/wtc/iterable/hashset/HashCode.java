package com.wtc.iterable.hashset;

public class HashCode {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("zhangsan", 23);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        // hash 碰撞

    }
}
