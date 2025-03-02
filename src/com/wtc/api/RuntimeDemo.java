package com.wtc.api;

import java.io.IOException;

public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        // Runtime r = Runtime.getRuntime();
        // r.exit(0);

        // System.out.println("看看我执行了吗？");
        System.out.println(Runtime.getRuntime().availableProcessors());

        // 总内存大小，单位 byte
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024 / 1024);

        // 已经获取的内存大小
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);

        // 剩余内存大小
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);

        // String[] command = new String[] { "notepad" };
        // String[] command = new String[] { "shutdown", "-s", "-t", "3600" };
        String[] command = new String[] { "shutdown", "-s", "-a" };
        System.out.println(Runtime.getRuntime().exec(command));
    }
}
