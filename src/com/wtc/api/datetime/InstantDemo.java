package com.wtc.api.datetime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantDemo {
    public static void main(String[] args) {
        Instant instant1 = Instant.ofEpochMilli(0L);
        System.out.println(instant1);

        Instant instant2 = Instant.ofEpochSecond(1L);
        System.out.println(instant2);

        Instant instant3 = Instant.ofEpochSecond(1L, 1000000000L);
        System.out.println(instant3);

        // 指定时区
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);

        Instant instant4 = Instant.ofEpochMilli(0L);
        Instant instant5 = Instant.ofEpochMilli(1000L);

        boolean res = instant4.isBefore(instant5);
        System.out.println(res);

        boolean res2 = instant4.isAfter(instant5);
        System.out.println(res2);

        Instant instant6 = Instant.ofEpochMilli(3000L);
        System.out.println(instant6);

        Instant instant7 = instant6.minusSeconds(1);
        System.out.println(instant7);
    }
}
