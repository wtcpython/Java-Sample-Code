package com.wtc.api.test;

public class EatPeach {
    public static void main(String[] args) {
        System.out.println(peach(10));
    }

    private static int peach(int day) {
        if (day == 1) {
            return 1;
        }
        return 2 * (peach(day - 1) + 1);
    }
}
