package com.wtc.api.regularexpression;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("----------1----------");
        System.out.println("a".matches("[abc]"));
        System.out.println("z".matches("[abc]"));
        System.out.println("ab".matches("[abc]"));

        System.out.println("----------2----------");
        System.out.println("a".matches("[^abc]"));
        System.out.println("z".matches("[^abc]"));
        System.out.println("zz".matches("[^abc]"));

        System.out.println("----------3----------");
        System.out.println("a".matches("[a-zA-Z]"));
        System.out.println("z".matches("[a-zA-Z]"));
        System.out.println("zz".matches("[a-zA-Z]"));
        System.out.println("0".matches("[a-zA-Z]"));


        System.out.println("----------4----------");
        System.out.println("a".matches("[a-d[m-p]]"));
        System.out.println("d".matches("[a-d[m-p]]"));
        System.out.println("m".matches("[a-d[m-p]]"));
        System.out.println("p".matches("[a-d[m-p]]"));
        System.out.println("z".matches("[a-d[m-p]]"));
        System.out.println("ad".matches("[a-d[m-p]]"));
    }
}
