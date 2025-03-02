package com.wtc.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamMethod2 {
    public static <T> void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "张无忌", "张无忌", "张无忌", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "周芷若", "赵敏");

        // distinct 用于去重
        list1.stream().distinct().forEach(s -> System.out.println(s));

        // concat 合并
        Stream.concat(list1.stream(), list2.stream()).forEach(s -> System.out.println(s));

        // map 转换
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-15", "周芷若-14", "赵敏-13", "张强-20", "张三丰-100", "张翠山-40", "张良-35", "王二麻子-37",
                "谢广坤-41");

        // list.stream().map(t -> {
        // String[] arr = t.split("-");
        // Integer age = Integer.parseInt(arr[1]);
        // return age;
        // }).forEach(s -> System.out.println(s));

        list.stream()
                .map(s -> Integer.parseInt(s.split("-")[1]))
                .forEach(s -> System.out.println(s));
    }
}
