package com.wtc.iterable.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapLoop2 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        m.put("aaa", "111");
        m.put("bbb", "222");
        m.put("ccc", "333");

        // 获取键值对对象
        Set<Entry<String, String>> entries = m.entrySet();

        // 遍历
        for (Entry<String,String> entry : entries) {
            // 获取键和值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}
