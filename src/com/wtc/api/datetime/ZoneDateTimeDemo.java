package com.wtc.api.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeDemo {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        ZonedDateTime time1 = ZonedDateTime.of(2023, 10, 1, 11, 12, 12, 0, ZoneId.of("Asia/Shanghai"));
        System.out.println(time1);

        ZonedDateTime time2 = time1.withYear(2000);
        System.out.println(time2);
    }
}
