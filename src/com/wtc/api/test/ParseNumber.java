package com.wtc.api.test;

public class ParseNumber {
    public static void main(String[] args) {
        String s = "123456789";

        // 校验字符串
        if (!s.matches("[1-9]\\d{0,9}")) {
            System.out.println("格式有误");
        } else {
            System.out.println("格式正确");

            int number = 0;
            for (int i = 0; i < s.length(); i++) {
                int num = s.charAt(i) - '0';
                number = number * 10 + num;
            }

            System.out.println(number);
        }
    }
}
