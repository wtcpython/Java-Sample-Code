package com.wtc.string;

public class Initial {
    public static void main(String[] args) {
        // 1. 直接赋值
        String s1 = "abc";
        System.out.println(s1);

        // 2. new 空参
        String s2 = new String();
        System.out.println(s2);

        // 3. 用 String 创建 String
        String s3 = new String("abc");
        System.out.println(s3);

        // 4. 用 char[] 创建 String
        char[] chars = { 'a', 'b', 'c', 'd' };
        String s4 = new String(chars);
        System.out.println(s4);

        // 5. 用 byte[] 创建 String
        // byte 转 ASCII 字符
        byte[] bytes = { 97, 98, 99, 100 };
        String s5 = new String(bytes);
        System.out.println(s5);
    }
}
