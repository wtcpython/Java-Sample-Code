package com.wtc.multithreading.waitwakeup;

public class Foodie extends Thread {
    @Override
    public void run() {
        /*
         * 1. 循环 while (true)
         * 2. 同步代码块 synchronized
         * 3. 判断共享数据是否到了末尾
         */
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    if (Desk.foodFlag == 0) {
                        try {
                            Desk.lock.wait(); // 让当前线程和锁绑定
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        Desk.count--;
                        System.out.println("吃面条，还能再吃" + Desk.count + "碗！！！");
                        Desk.lock.notifyAll();
                        Desk.foodFlag = 0;
                    }
                }
            }
        }
    }
}
