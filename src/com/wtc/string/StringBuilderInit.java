package com.wtc.string;

public class StringBuilderInit {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");

        // 添加元素
        // sb.append(1);
        // sb.append(2.3);
        // sb.append(true);

        // 反转
        sb.reverse();

        // 获取长度
        int length = sb.length();
        System.out.println(length);

        System.out.println(sb);
    }
}
