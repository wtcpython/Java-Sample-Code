package com.wtc.string;

public class StringCombine {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        // System.out.println(arr);
        System.out.println(arrToString(arr));
    }

    public static String arrToString(int[] arr) {
        if (arr == null) {
            return "";
        } else if (arr.length == 0) {
            return "[]";
        } else {
            String res = "[";
            res += arr[0];
            for (int i = 1; i < arr.length; i++) {
                res += ", " + arr[i];
            }
            res += "]";
            return res;
        }
    }
}
