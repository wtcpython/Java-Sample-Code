package com.wtc.loop;

public class CasePenetration {
    public static void main(String[] args) {
        // 语句中没有 break 时，switch 语句会从第一个匹配上的 case 开始
        // 运行下面的所有内容

        int num = 10;
        switch (num) {
            case 1:
                System.out.println("number 为 1");
            case 10:
                System.out.println("number 为 10");
            case 20:
                System.out.println("number 为 20");
            case 100:
                System.out.println("number 为 100");
            default:
                System.out.println("number 为 " + num);
        }
    }
}
