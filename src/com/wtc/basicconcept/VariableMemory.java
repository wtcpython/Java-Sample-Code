package com.wtc.basicconcept;

public class VariableMemory {
    public static void main(String[] args) {
        // 基本数据类型
        int a = 10;
        int b = a;
        System.out.println(a);
        System.out.println(b);

        b = 20;
        System.out.println(a);
        System.out.println(b);

        // 引用数据类型
        int[] c = { 1, 2, 3 };
        int[] d = c;
        System.out.println(c[1]);
        System.out.println(d[1]);

        d[1] = 100;
        System.out.println(c[1]);
        System.out.println(d[1]);

        // clone 拷贝
        int[] e = { 1, 2, 3 };
        int[] f = e.clone();
        System.out.println(e[1]);
        System.out.println(f[1]);

        f[1] = 100;
        System.out.println(e[1]);
        System.out.println(f[1]);
    }
}
