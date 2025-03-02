package com.wtc.api.bigdecimal;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        // System.out.println(0.09 + 0.01);
        // System.out.println(0.216 - 0.1);
        // System.out.println(0.226 * 0.01);
        // System.out.println(0.09 / 0.01);

        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);
        System.out.println(bd1);
        System.out.println(bd2);

        BigDecimal bd3 = new BigDecimal("0.01");
        BigDecimal bd4 = new BigDecimal("0.09");
        BigDecimal bd5 = bd3.add(bd4);
        System.out.println(bd3);
        System.out.println(bd4);
        System.out.println(bd5);

        BigDecimal bd6 = BigDecimal.valueOf(10);
        System.out.println(bd6);

        // 0 ~ 10 之间的整数返回已经生成的引用对象
        BigDecimal bd7 = BigDecimal.valueOf(10);
        System.out.println(bd6 == bd7);

        BigDecimal bd8 = BigDecimal.valueOf(10.0);
        BigDecimal bd9 = BigDecimal.valueOf(10.0);
        System.out.println(bd8 == bd9);
    }
}
