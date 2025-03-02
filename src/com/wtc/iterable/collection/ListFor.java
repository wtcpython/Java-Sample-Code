package com.wtc.iterable.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListFor {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

        for (String s : list) {
            System.out.println(s);
        }

        list.forEach(s -> System.out.println(s));

        ListIterator<String> listit = list.listIterator();
        while (listit.hasNext()) {
            String s = listit.next();
            if ("bbb".equals(s)) {
                listit.add("qqq");
            }
            System.out.println(s);
        }

        System.out.println(list);
    }
}
