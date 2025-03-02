package com.wtc.string.test;

public class StringModify {
    public static void main(String[] args) {
        String strA = "abcde";
        String strB = "cdeab";

        System.out.println(check(strA, strB));

    }

    public static boolean check(String strA, String strB) {
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if (strA.equals(strB)) {
                return true;
            }
        }
        return false;
    }

    public static String rotate(String str) {
        // char first = str.charAt(0);
        // String end = str.substring(1);

        // return end + first;

        char[] arr = str.toCharArray();

        char first = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;

        return new String(arr);
    }
}
