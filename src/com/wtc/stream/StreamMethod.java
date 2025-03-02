package com.wtc.stream;

import java.util.ArrayList;
import java.util.Collections;

public class StreamMethod {
    public static void main(String[] args) {
        // filter
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

        list.stream()
                .filter(s -> s.startsWith("张"))
                .forEach(s -> System.out.println(s));

        list.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .forEach(s -> System.out.println(s));

        System.out.println(list);

        System.out.println("-------------------------");

        // limit 选择前 n 个
        // skip 跳过前 n 个
        list.stream()
                .limit(3)
                .forEach(s -> System.out.println(s));

        list.stream()
                .skip(4)
                .forEach(s -> System.out.println(s));

        list.stream()
                .skip(3)
                .limit(3)
                .forEach(s -> System.out.println(s));
    }
}
