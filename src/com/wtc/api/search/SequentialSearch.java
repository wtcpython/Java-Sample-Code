package com.wtc.api.search;

import java.util.ArrayList;

public class SequentialSearch {
    public static void main(String[] args) {
        // 顺序查找
        int[] arr = { 131, 127, 147, 81, 103, 23, 7, 79 };
        int number = 82;
        System.out.println(search(arr, number));

        int[] arr2 = { 131, 127, 147, 81, 103, 23, 7, 79, 81 };
        int number2 = 81;
        System.out.println(searchMany(arr2, number2));
    }

    public static boolean search(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Integer> searchMany(int[] arr, int number) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                res.add(i);
            }
        }
        return res;
    }
}
