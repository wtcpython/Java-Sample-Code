package com.wtc.stream;

import java.util.HashMap;

public class MapStream {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("aaa", 111);
        hm.put("bbb", 222);
        hm.put("ccc", 333);
        hm.put("ddd", 444);

        hm.keySet().stream().forEach(s -> System.out.println(s));

        hm.entrySet().stream().forEach(s -> System.out.println(s));
    }
}
