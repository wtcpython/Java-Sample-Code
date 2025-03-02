package com.wtc.iterable.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapLoop {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        m.put("aaa", "111");
        m.put("bbb", "222");
        m.put("ccc", "333");

        // 通过键找值
        Set<String> keys = m.keySet();

        // 遍历
        for (String key : keys) {
            // System.out.println(key);
            // 获取值
            System.out.println(m.get(key));
        }
    }
}
