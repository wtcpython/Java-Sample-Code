package com.wtc.api.test;

public class BinaryString {
    public static void main(String[] args) {
        int num = 123;
        System.out.println(toBinaryString(num));
        System.out.println(Integer.toBinaryString(num));
    }

    public static String toBinaryString(int number) {
        StringBuilder sb = new StringBuilder();

        while (true) {
            if (number == 0) {
                break;
            }

            int remainder = number % 2;
            sb.append(remainder);

            number /= 2;
        }
        return sb.reverse().toString();
    }
}
