package com.wtc.loop;

public class SwitchJDK14 {
    public static void main(String[] args) {
        int number = 3;
        switch (number) {
            case 1 -> System.out.println("一");
            case 2 -> System.out.println("二");
            case 3 -> System.out.println("三");
            default -> System.out.println(number);
        }
    }
}
