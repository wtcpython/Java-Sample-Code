package com.wtc.multithreading.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadPoolDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3, // 核心线程数，不能小于 0
                6, // 最大线程数，>= 核心线程数
                60, // 空闲线程最大存活时间
                TimeUnit.SECONDS, // 单位是什么
                new ArrayBlockingQueue<>(3), // 等待的任务队列
                Executors.defaultThreadFactory(), // 创建线程工厂
                new ThreadPoolExecutor.AbortPolicy() // 任务的拒绝策略
        );
        pool.submit(new MyRunnable());
        pool.close();
    }
}
