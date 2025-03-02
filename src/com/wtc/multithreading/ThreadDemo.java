package com.wtc.multithreading;
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("线程 1");
        t1.start();

        MyThread t2 = new MyThread();
        t2.setName("线程 2");
        t2.start();
    }
}
