package com.wtc.object;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.brand = "小米";
        phone.price = 1999.98;

        System.out.println(phone.brand);
        System.out.println(phone.price);

        phone.call();
        phone.playGame();

        Phone p2 = new Phone();
        p2.brand = "苹果";
        p2.price = 8999;

        p2.call();
        p2.playGame();
    }
}