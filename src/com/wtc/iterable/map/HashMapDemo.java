package com.wtc.iterable.map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<>();

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        Student s4 = new Student("wangwu", 25);

        hm.put(s1, "江苏");
        hm.put(s2, "浙江");
        hm.put(s3, "福建");
        hm.put(s4, "山东");

        // 遍历
        for (Entry<Student, String> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
