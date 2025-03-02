package com.wtc.arraylist;

import java.util.ArrayList;

public class Initial {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        // remove 值，返回 bool
        // remove index，返回 被删除的值

        // 删除元素
        // String res = list.remove(2);
        // System.out.println(res);

        // 修改元素
        // String res = list.set(1, "ddd");
        // System.out.println(res);

        // 获取元素
        String s = list.get(0);
        System.out.println(s);

        // 遍历元素
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }
    }
}
