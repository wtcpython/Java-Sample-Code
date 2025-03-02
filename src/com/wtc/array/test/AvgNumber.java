package com.wtc.array.test;

import java.util.Random;

public class AvgNumber {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            int number = random.nextInt(1, 101);
            array[i] = number;
            sum += number;
        }

        System.out.println(sum);
        double avg = sum / 10.0;
        System.out.println(avg);

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < avg) {
                count++;
            }
        }

        System.out.println("有" + count + "个数比平均数小");
    }
}
