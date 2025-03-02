package com.wtc.multithreading.waitwakeup;

public class Desk {
    // 是否有面条
    public static int foodFlag = 0;

    public static int count = 10;

    public static Object lock = new Object();
}
