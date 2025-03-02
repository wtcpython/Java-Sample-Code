package com.wtc.iterable.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        // 增加元素
        list.add(1, "QQQ");

        // 删除元素
        String remove = list.remove(0);
        System.out.println(remove);

        // 设置元素
        String res = list.set(0, "QQQ");
        System.out.println(res);

        // 获取元素
        String s = list.get(0);
        System.out.println(s);

        System.out.println(list);
    }
}
