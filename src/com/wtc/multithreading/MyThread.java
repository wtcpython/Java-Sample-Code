package com.wtc.multithreading;
public class MyThread extends Thread {

    MyThread() {
    }

    MyThread(String name) {
        setName(name);
    }

    @Override
    public void run() {
        // for (int i = 0; i < 100; i++) {
        // try {
        // Thread.sleep(5000);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        // System.out.println(getName() + ": Hello World!");
        // }
        for (int i = 1; i <= 100; i++) {
            System.out.println(getName() + "@" + i);
            
            // 出让当前 CPU 的执行权
            Thread.yield();
        }
    }
}
