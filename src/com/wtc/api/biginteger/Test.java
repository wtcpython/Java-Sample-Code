package com.wtc.api.biginteger;

import java.math.BigInteger;
import java.util.Random;

public class Test {
    public static void main(String[] args) {

        // public BigInteger(int numBits, Random rnd) 范围 [0 ~ 2 ^ numBits - 1]
        BigInteger bi1 = new BigInteger(4, new Random());
        System.out.println(bi1);

        // public BigInteger(String val)
        BigInteger bi2 = new BigInteger("9999999999999999999999999999999999");
        System.out.println(bi2);

        // BigInteger bi3 = new BigInteger("1.1");
        // System.out.println(bi3);

        BigInteger bi4 = BigInteger.valueOf(1000);
        System.out.println(bi4);

        BigInteger bi5 = BigInteger.valueOf(16);
        BigInteger bi6 = BigInteger.valueOf(16);

        System.out.println(bi5 == bi6); // true

        BigInteger bi7 = BigInteger.valueOf(17);
        BigInteger bi8 = BigInteger.valueOf(17);

        System.out.println(bi7 == bi8); // false

        // BigInteger.valueOf 会存储 -16 ~ 16 的值，
        // 因此，对于 -16 ~ 16，是引用对象，对于其他数，则创建新对象

        BigInteger bi9 = BigInteger.valueOf(1);
        BigInteger bi10 = BigInteger.valueOf(2);

        BigInteger res = bi9.add(bi10);
        System.out.println(res);
    }
}
