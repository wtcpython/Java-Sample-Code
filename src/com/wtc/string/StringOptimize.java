package com.wtc.string;

public class StringOptimize {
    public static void main(String[] args) {
        String s = "a" + "b" + "c";
        System.out.println(s);

        String s1 = "a";
        String s2 = s1 + "b";
        String s3 = s2 + "c";
        System.out.println(s3);

        String s4 = "abc";
        System.out.println(s3 == s4);
        System.out.println(s == s4);
        
        StringBuilder sb = new StringBuilder();

        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("abcdefghijklmnopqrstuvwxyz");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
