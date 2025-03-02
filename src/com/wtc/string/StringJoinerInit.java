package com.wtc.string;

import java.util.StringJoiner;

public class StringJoinerInit {
    public static void main(String[] args) {
        // StringJoiner sj = new StringJoiner("---");
        // sj.add("aaa").add("bbb").add("ccc");
        // System.out.println(sj);

        StringJoiner sj = new StringJoiner(", ", "[", "]");
        sj.add("aaa").add("bbb").add("ccc");

        int len = sj.length();
        System.out.println(len);

        System.out.println(sj);
    }
}
