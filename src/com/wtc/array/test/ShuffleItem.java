package com.wtc.array.test;

import java.util.Random;

public class ShuffleItem {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };

        Random random = new Random();

        for (int i = 0; i < array.length - 1; i++) {
            int index = random.nextInt(i + 1, array.length);
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
