package com.wtc.multithreading;
public class Other {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("飞机");
        t2.setName("火车");

        t1.start();
        t2.start();
    }
}
