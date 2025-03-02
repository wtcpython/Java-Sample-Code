package com.wtc.api.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test2 {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal(10.0);
        BigDecimal bd2 = new BigDecimal(3.0);

        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);

        BigDecimal bd4 = bd1.subtract(bd2);
        System.out.println(bd4);

        BigDecimal bd5 = bd1.multiply(bd2);
        System.out.println(bd5);

        // BigDecimal bd6 = bd1.divide(bd2);
        // System.out.println(bd6);

        // 除法除不尽会报错
        // 保留小数位数，舍入模式
        BigDecimal bd7 = bd1.divide(bd2, 2, RoundingMode.HALF_UP);
        System.out.println(bd7);
    }
}
