package com.wtc.multithreading;
public class ThreadMember {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread("飞机");
        MyThread t2 = new MyThread("火车");

        // 如果未指定线程的名称，格式：Thread-X

        t1.start();
        t2.start();

        // System.out.println(Thread.currentThread().getName());

        // System.out.println("11111111111");
        // Thread.sleep(5000);
        // System.out.println("22222222222");
    }
}
