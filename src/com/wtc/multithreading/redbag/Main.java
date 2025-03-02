package com.wtc.multithreading.redbag;

public class Main {
    public static void main(String[] args) {
        // 抢红包
        // 100 元，分成 3 个包，共 5 人抢
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        MyThread t4 = new MyThread();
        MyThread t5 = new MyThread();

        t1.setName("AAA");
        t2.setName("BBB");
        t3.setName("CCC");
        t4.setName("DDD");
        t5.setName("EEE");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
