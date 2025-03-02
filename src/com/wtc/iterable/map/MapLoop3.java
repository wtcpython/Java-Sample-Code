package com.wtc.iterable.map;

import java.util.HashMap;
import java.util.Map;

public class MapLoop3 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        m.put("aaa", "111");
        m.put("bbb", "222");
        m.put("ccc", "333");

        // forEach 遍历
        m.forEach((k, v) -> System.out.println(k + " = " + v));
    }
}
