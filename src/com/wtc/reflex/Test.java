package com.wtc.reflex;
public class Test {
    public static void main(String[] args) {
        BigStar bigStar = new BigStar("xck");
        IStar star = ProxyUtil.CreateProxy(bigStar);
        String result = star.sing("zyntm");
        System.out.println(result);
        star.dance();
    }
} 
