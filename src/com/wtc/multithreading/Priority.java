package com.wtc.multithreading;
public class Priority {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();
    }
}
