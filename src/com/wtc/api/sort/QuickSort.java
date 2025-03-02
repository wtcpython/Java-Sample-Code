package com.wtc.api.sort;

public class QuickSort {
    public static void main(String[] args) {
        // 快速排序

        int[] arr = { 6, 1, 2, 7, 9, 3, 4, 5, 10, 8 };
        // int[] arr = { 2, 1, 3 };
        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int partition = Partition(arr, start, end);
            quickSort(arr, start, partition - 1);
            quickSort(arr, partition + 1, end);
        }
    }

    private static int Partition(int[] arr, int start, int end) {
        int pivot = arr[start];

        while (start < end) {
            while (start < end && arr[end] > pivot) {
                end--;
            }
            while (start < end && arr[start] < pivot) {
                start++;
            }

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        arr[start] = pivot;
        // while (start < end) {
        // while (start < end && arr[end] > pivot) {
        // end--;
        // }

        // arr[start] = arr[end];

        // while (start < end && arr[start] < pivot) {
        // start++;
        // }
        // arr[end] = arr[start];

        // }
        // arr[start] = pivot;
        return start;
    }
}
