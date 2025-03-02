package com.wtc.api.biginteger;

import java.math.BigInteger;

public class Test2 {
    public static void main(String[] args) {
        BigInteger bi1 = BigInteger.valueOf(10);
        BigInteger bi2 = BigInteger.valueOf(2);

        BigInteger bi3 = bi1.add(bi2);
        System.out.println(bi3);

        BigInteger[] arr = bi1.divideAndRemainder(bi2);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        boolean res = bi1.equals(bi2);
        System.out.println(res);

        BigInteger bi4 = bi1.pow(2);
        System.out.println(bi4);

        BigInteger bi5 = bi1.max(bi2);
        System.out.println(bi5);
        // 返回引用对象
        System.out.println(bi5 == bi1); // true
        System.out.println(bi5 == bi2); // false

        // BigInteger bi6 = BigInteger.valueOf(2147483647L);
        // int i = bi6.intValue();
        // System.out.println(i);

        BigInteger bi6 = BigInteger.valueOf(200);
        long l = bi6.longValue();
        double d = bi6.doubleValue();
        System.out.println(l);
        System.out.println(d);

        BigInteger bi = new BigInteger("27670116110564327424");
        System.out.println(bi);
    }
}
