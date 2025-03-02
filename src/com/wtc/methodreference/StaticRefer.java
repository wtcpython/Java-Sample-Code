package com.wtc.methodreference;

import java.util.ArrayList;
import java.util.Collections;

public class StaticRefer {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "1", "2", "3", "4", "5");

        list.stream().map(Integer::parseInt).forEach(s -> System.out.println(s));

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "张无忌", "周芷若", "赵敏", "张强", "张三丰");

        list2.stream().filter(StaticRefer::judge).forEach(s -> System.out.println(s));
    }

    public static boolean judge(String s) {
        return s.startsWith("张") && s.length() == 3;
    }
}
