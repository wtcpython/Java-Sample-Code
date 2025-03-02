package com.wtc.methodreference.test;

import java.util.ArrayList;
import java.util.Arrays;

import com.wtc.methodreference.Student;

public class Test2 {
    public static void main(String[] args) {
        // 1.创建集合
        ArrayList<Student> list = new ArrayList<>();
        // 2.添加元素
        list.add(new Student("zhangsan", 23));
        list.add(new Student("lisi", 24));
        list.add(new Student("wangwu", 25));
        // 3.获取姓名并放到数组当中

        String[] arr = list.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
