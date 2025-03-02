package com.wtc.operator;

public class ShortCircuitLogical {
    public static void main(String[] args) {
        // 短路运算 && ||
        // 当前一个条件已经足以得出总的计算结果，则不会计算后一个条件
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true); // Dead Code
        System.out.println(false && false); // Dead Code

        System.out.println(true || true); // Dead Code
        System.out.println(true || false); // Dead Code
        System.out.println(false || true);
        System.out.println(false || false);
    }
}
