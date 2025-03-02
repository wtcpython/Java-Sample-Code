package com.wtc.iterable.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        m.put("aaa", "111");
        m.put("bbb", "222");
        m.put("ccc", "333");

        // 返回被覆盖的值
        String res = m.put("bbb", "444");
        System.out.println(res);

        // 删除键
        // V remove(K key)
        String result = m.remove("ccc");
        System.out.println(result);

        // 清空
        // m.clear();

        // 检查是否包含
        boolean keyResult = m.containsKey("aaa");
        System.out.println(keyResult);

        boolean valueResult = m.containsValue("333");
        System.out.println(valueResult);

        // 判断是否为空
        boolean isEmpty = m.isEmpty();
        System.out.println(isEmpty);

        // 获取大小
        System.out.println(m.size());

        System.out.println(m);
    }
}
