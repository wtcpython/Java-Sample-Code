package com.wtc.web.uploadfile;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
    public static void main(String[] args) throws IOException {

        // 创建线程池对象
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,
                16,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        ServerSocket ss = new ServerSocket(10000);

        while (true) {
            Socket socket = ss.accept();

            // 开启线程
            // new Thread(new MyRunnable(socket)).start();
            pool.submit(new MyRunnable(socket));
        }

        // ss.close();
    }
}
