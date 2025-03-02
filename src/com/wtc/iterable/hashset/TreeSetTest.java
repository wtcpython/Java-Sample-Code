package com.wtc.iterable.hashset;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>((o1, o2) -> {
            // o1 是要添加的元素
            // o2 是已经存在于红黑树的元素

            // 按照长度排序，若长度相等，则按照首字母排序
            int i = o1.length() - o2.length();
            i = i == 0 ? o1.compareTo(o2) : i;
            return i;
        });

        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        System.out.println(ts);
    }
}
