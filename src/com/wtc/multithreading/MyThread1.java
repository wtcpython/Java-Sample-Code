package com.wtc.multithreading;
public class MyThread1 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + "@" + i);
        }
    }
}