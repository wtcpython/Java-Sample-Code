package com.wtc.api.datetime;

import java.util.Date;
import java.util.Random;

public class DateDemo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        Date d2 = new Date(0);
        System.out.println(d2);

        d2.setTime(1000L);
        System.out.println(d2);

        Date d3 = new Date(0L);
        long time = d3.getTime();
        time += 1000L * 60 * 60 * 24 * 365;
        d3.setTime(time);

        System.out.println(d3);

        System.out.println("------------------------------");

        Random r = new Random();
        Date d4 = new Date(Math.abs(r.nextInt()));
        Date d5 = new Date(Math.abs(r.nextInt()));
        long time4 = d4.getTime();
        long time5 = d5.getTime();
        if (time4 > time5) {
            System.out.println("第一个时间在后面，第二个时间在前面");
        } else if (time4 < time5) {
            System.out.println("第二个时间在后面，第一个时间在前面");
        } else {
            System.out.println("表示两个时间一样");
        }
    }
}
