package com.wtc.multithreading.sellticket;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
    static int ticket = 0;

    // 锁对象必须唯一
    static Object obj = new Object();

    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            // 为执行片段加锁
            // 同步代码块
            // synchronized (MyThread.class) {
            lock.lock();
            try {
                if (ticket < 100) {
                    Thread.sleep(100);
                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "张票！！！");
                } else {
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
            // }
        }
    }
}
