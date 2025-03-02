package com.wtc.multithreading.redbag;

import java.util.Random;

public class MyThread extends Thread {
    static double money = 100;
    static int count = 3;
    static final double MIN = 0.01;

    @Override
    public void run() {
        synchronized (MyThread.class) {
            if (count == 0) {
                System.out.println(getName() + "没有抢到红包！");
            } else {
                double prize = 0;
                Random r = new Random();
                if (count > 1) {
                    prize =  r.nextDouble(0.01, money - (count - 1) * MIN);
                } else {
                    prize = money;
                }
                money -= prize;
                count--;
                System.out.println(getName() + "抢到了" + prize + "元！");
            }
        }
    }
}
