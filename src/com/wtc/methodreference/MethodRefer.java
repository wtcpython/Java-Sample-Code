package com.wtc.methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MethodRefer {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa", "bbb", "ccc", "ddd");

        // 方法引用：

        list.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));

        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 1, 2, 3, 4, 5);

        Integer[] list3 = list2.stream().toArray(Integer[]::new);

        System.out.println(Arrays.toString(list3));
    }
}
