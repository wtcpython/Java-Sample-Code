package com.wtc.api.regularexpression;

public class Test5 {
    public static void main(String[] args) {
        // 身份证校验
        String regex = "[1-9]\\d{16}(\\d|X|x)";

        System.out.println("41080119930228457x".matches(regex));
        System.out.println("510801197609022309".matches(regex));
        System.out.println("15040119810705387X".matches(regex));
        System.out.println("130133197204039024".matches(regex));
        System.out.println("430102197606046442".matches(regex));

        // 较严格的校验
        // 
    }
}
