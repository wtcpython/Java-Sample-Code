package com.wtc.iterable.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        // Collection 是一个接口
        Collection<String> coll = new ArrayList<>();

        // 添加元素
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");

        System.out.println(coll);

        // 清空
        // coll.clear();

        // 删除元素
        coll.remove("aaa");

        System.out.println(coll);

        // 判断元素是否包含
        System.out.println(coll.contains("bbb"));

        // 判断是否为空
        System.out.println(coll.isEmpty());
    }
}
