package com.wtc.multithreading;
public class RunnableDemo {
    public static void main(String[] args) {
        MyRun mr = new MyRun();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        t1.setName("线程 1");
        t2.setName("线程 2");

        t1.start();
        t2.start();
    }
}
