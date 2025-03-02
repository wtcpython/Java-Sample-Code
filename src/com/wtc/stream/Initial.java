package com.wtc.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Initial {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "d", "e");

        // 获取流水线
        Stream<String> stream1 = list.stream();

        stream1.forEach(s -> System.out.println(s));
    }
}
