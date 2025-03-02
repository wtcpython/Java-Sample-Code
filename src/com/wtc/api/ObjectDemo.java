package com.wtc.api;

public class ObjectDemo {
    public static void main(String[] args) {
        Object obj = new Object();

        // toString
        System.out.println(obj.toString());
        System.out.println(obj);

        // equals
        // Object obj1 = new Object();
        // Object obj2 = new Object();
        // System.out.println(obj1 == obj2);
        // System.out.println(obj1.equals(obj2));

        // String s1 = "123123";
        // String s2 = "123123";
        // System.out.println(s1 == s2);
        // System.out.println(s1.equals(s2));
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("zhangsan", 23);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        // 默认使用 Object.equals 方法比较，比较的是地址值是否相等

        String s = "abc";
        StringBuilder sb = new StringBuilder("abc");

        System.out.println(s.equals(sb));
        System.out.println(sb.equals(s));
    }
}
