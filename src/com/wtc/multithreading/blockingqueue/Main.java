package com.wtc.multithreading.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        // 生产者和消费者需要使用同一个阻塞队列
        // ArrayBlockingQueue 必须指定大小
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

        Cook c = new Cook(queue);
        Foodie f = new Foodie(queue);

        c.start();
        f.start();
    }
}
