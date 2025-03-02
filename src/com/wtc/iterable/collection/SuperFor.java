package com.wtc.iterable.collection;

import java.util.ArrayList;
import java.util.Collection;

public class SuperFor {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");

        for (String s : coll) {
            // s = "qqq";
            System.out.println(s);
        }
        System.out.println(coll);
    }
}
