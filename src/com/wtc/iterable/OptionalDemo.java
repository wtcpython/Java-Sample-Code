package com.wtc.iterable;

public class OptionalDemo {
    public static void main(String[] args) {
        int sum = getSum(1, 2, 3, 4, 5, 6, 7);
        System.out.println(sum);

        // 可变参数必须写在形参的最后，且只能有一个可变参数
    }

    public static int getSum(int... args) {
        int sum = 0;
        for (int i : args) {
            sum += i;
        }
        return sum;
    }
}
