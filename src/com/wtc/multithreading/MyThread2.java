package com.wtc.multithreading;
public class MyThread2 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(getName() + "@" + i);
        }
    }
}