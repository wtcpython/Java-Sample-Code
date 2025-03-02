package com.wtc.iterable.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        Iterator<String> it = coll.iterator();
        while (it.hasNext()) {
            // 循环中只能用一次 next 方法
            // 在移动的时候不能删除
            String str = it.next();
            if ("bbb".equals(str)) {
                // coll.remove("bbb");
                it.remove();
            }
            System.out.println(str);
        }
        System.out.println(coll);
    }
}
