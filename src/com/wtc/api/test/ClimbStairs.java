package com.wtc.api.test;

public class ClimbStairs {
    public static void main(String[] args) {

        System.out.println(Climb(20));
        System.out.println(Climb3(20));
    }

    private static int Climb(int number) {
        if (number == 1) {
            return 1;
        }
        if (number == 2) {
            return 2;
        }
        return Climb(number - 1) + Climb(number - 2);
    }

    private static int Climb3(int number) {
        if (number == 1) {
            return 1;
        }
        if (number == 2) {
            return 2;
        }
        if (number == 3) {
            return 4;
        }
        return Climb3(number - 1) + Climb3(number - 2) + Climb3(number - 3);
    }
}
