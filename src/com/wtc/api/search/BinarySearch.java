package com.wtc.api.search;

public class BinarySearch {
    public static void main(String[] args) {
        // 二分查找
        int[] arr = { 7, 23, 79, 81, 103, 127, 131, 147 };
        int number = 81;
        System.out.println(search(arr, number));
    }

    public static int search(int[] arr, int number) {
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (arr[mid] == number) {
                return mid;
            }
            if (arr[mid] > number) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return -1;
    }

    public static int SearchV2(int[] arr, int key) {
        // 插值查找
        // mid = min + (key - arr[min]) / (arr[max] - arr[min]) * (max - min)
        return -1;
    }
}
