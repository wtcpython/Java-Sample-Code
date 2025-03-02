package com.wtc.iterable.generics;

import java.util.ArrayList;

public class Test {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        // ArrayList 在未指定类型时，可以使用任意类型 (Object)
        ArrayList list1 = new ArrayList<>();
        list1.add(123);
        list1.add("aaa");

        // 访问时出现问题，多态的限制

        // JDK 中的泛型显示是伪泛型，在编译时会去除泛型限制
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("aaa");
        list2.add("bbb");
    }
}
