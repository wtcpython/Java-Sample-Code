package com.wtc.operator.test;

import java.util.Scanner;

public class NumberSix {
    public static void main(String[] args) {
        // 键盘录入两个整数
        // 如果其中一个为6，最终结果输出 true
        // 如果它们的和为6的倍数，最终结果输出 true
        // 其他情况都是 false。
        Scanner sc = new Scanner(System.in);

        System.out.println("输入两个整数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println((a == 6 || b == 6 || (a + b) % 6 == 0));
    }
}
