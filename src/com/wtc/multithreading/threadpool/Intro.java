package com.wtc.multithreading.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Intro {
    public static void main(String[] args) {
        ExecutorService pool1 = Executors.newFixedThreadPool(3);
        
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());

        // pool1.shutdown();
    }
}
