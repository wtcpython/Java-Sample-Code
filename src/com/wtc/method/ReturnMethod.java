package com.wtc.method;

public class ReturnMethod {
    private static int getSum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        int result = getSum(10, 20, 30);
        System.out.println(result);
    }
}
