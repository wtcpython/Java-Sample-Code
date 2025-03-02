package com.wtc.object.test;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] arr = new Car[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();
            System.out.println("输入汽车的品牌：");
            c.setBrand(sc.next());

            System.out.println("输入汽车的价格：");
            c.setPrice(sc.nextInt());

            System.out.println("输入汽车的颜色：");
            c.setColor(sc.next());

            arr[i] = c;
        }
        sc.close();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
