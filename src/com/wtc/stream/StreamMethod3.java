package com.wtc.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class StreamMethod3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

        list.stream().forEach(s -> System.out.println(s));

        long count = list.stream().count();
        System.out.println(count);

        Object[] arr1 = list.stream().toArray();
        System.out.println(Arrays.toString(arr1));

        String[] arr2 = list.stream().toArray(new IntFunction<String[]>() {
            // value 指的是数组的长度
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });

        System.out.println(Arrays.toString(arr2));

        String[] arr3 = list.stream().toArray(value -> new String[value]);

        System.out.println(Arrays.toString(arr3));

        String[] arr4 = list.stream().toArray(String[]::new);

        System.out.println(Arrays.toString(arr4));
    }
}
