package com.wtc.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStream {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Arrays.stream(arr).forEach(s -> System.out.println(s));

        Stream.of(1, 2, 3, 4, 5).forEach(s -> System.out.println(s));

        // Stream.of 中的数组必须是引用数据类型的数组
        // Stream.of(arr).forEach(s -> System.out.println(s));
    }
}
