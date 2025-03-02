package com.wtc.stream.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DataFilter {
    public static void main(String[] args) {
        // 定义一个集合，并添加一些整数1，2，3，4，5，6，7，8，9，10
        // 过滤奇数，只留下偶数
        // 并将结果保存起来

        Set<Integer> set = new HashSet<>();
        Collections.addAll(set, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer[] arr = set.stream().filter(s -> s % 2 == 0).toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
