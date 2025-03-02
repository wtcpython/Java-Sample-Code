package com.wtc.iterable.map;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>((o1, o2) -> o2 - o1);

        // 添加元素
        tm.put(1, "粤利粤");
        tm.put(2, "康帅傅");
        tm.put(3, "九个核桃");
        tm.put(4, "雷碧");
        tm.put(5, "可恰可乐");

        // 默认按照 Key 排序

        System.out.println(tm);
    }
}
