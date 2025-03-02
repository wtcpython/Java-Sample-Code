package com.wtc.api.regularexpression;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("----------1----------");
        System.out.println("你".matches(".."));
        System.out.println("你我".matches(".."));

        System.out.println("----------2----------");
        System.out.println("a".matches("\\d"));
        System.out.println("3".matches("\\d"));
        System.out.println("33".matches("\\d"));

        System.out.println("----------3----------");
        System.out.println("a".matches("\\w"));
        System.out.println("3".matches("\\w"));
        System.out.println("33".matches("\\w"));
        System.out.println("_".matches("\\w"));
        System.out.println("你".matches("\\w"));

        // 匹配次数
        // ? 匹配 0 次或一次
        // * 匹配 0 次或多次
        // + 匹配 1 次或多次
        // {n} 正好 n 次
        // {n, } 至少 n 次
        // {n, m} [n, m] 次

        System.out.println("----------4----------");
        System.out.println("123456789".matches("\\w{6,}"));
        System.out.println("1234".matches("\\w{6,}"));
    }
}
