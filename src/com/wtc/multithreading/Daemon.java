package com.wtc.multithreading;
public class Daemon {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.setName("飞机");
        t2.setName("火车");

        // 设置守护线程
        t2.setDaemon(true);

        // 当非守护线程结束后，守护线程会陆续中断（守护线程不会执行完毕）

        t1.start();
        t2.start();
    }
}
