package com.wtc.iterable.map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // LinkedHashMap 会记录存储的顺序
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("b", 456);
        lhm.put("c", 789);
        lhm.put("a", 123);
        lhm.put("a", 111);

        System.out.println(lhm);
    }
}
