package com.wtc.iterable.hashset;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // 创建一个默认长度16，默认加载因子为 0.75 的数组，数组名table
        // 根据元素的 hash 值和数组的长度计算出应存入的位置
        // int index = (数组长度 - 1) & 哈希值
        // 判断位置是否为 null，如果是 null 直接存入
        // 不是 null 使用 equals 比较，一样不存，不一样，新元素挂在老元素下面

        // 加载因子决定扩容时机，当数组大小大于 (默认长度 x 加载因子) 时，会扩容

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        Student s4 = new Student("zhangsan", 23);

        HashSet<Student> hs = new HashSet<>();

        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));

        System.out.println(hs);
    }
}
