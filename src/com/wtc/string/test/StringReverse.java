package com.wtc.string.test;

public class StringReverse {
    public static void main(String[] args) {
        String res = reverse("abc");
        System.out.println(res);
    }

    public static String reverse(String s) {
        String res = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            res += s.charAt(i);
        }
        return res;
    }
}
