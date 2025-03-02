package com.wtc.iterable.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();

        s.add("张三");
        s.add("张三");
        s.add("李四");
        s.add("王五");

        // System.out.println(s);
        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }

        // 增强 for
        for (String str : s) {
            System.out.println(str);
        }

        // lambda
        s.forEach(str -> System.out.println(str));
    }
}
