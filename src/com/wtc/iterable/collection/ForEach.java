package com.wtc.iterable.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");

        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        });

        coll.forEach(s -> System.out.println(s));
        
    }
}
