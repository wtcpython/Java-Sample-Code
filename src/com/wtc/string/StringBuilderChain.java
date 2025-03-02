package com.wtc.string;

import java.util.Scanner;

public class StringBuilderChain {
    public static void main(String[] args) {
        // int len = getString().substring(1).replace('A', 'Q').length();
        // System.out.println(len);

        StringBuilder sb = new StringBuilder();

        sb.append("AAA").append("BBB").append("CCC").append("DDD");

        System.out.println(sb);
    }

    public static String getString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        sc.close();
        return str;
    }
}
