package com.wtc.api.datetime;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        Date d = new Date(0L);
        c.setTime(d);

        System.out.println(c);

        // Calendar:
        // 月份：范围 0 ~ 11
        // 星期：星期日是一周的第一天
        // 1 2 3 4 5 6 7
        // 日 一 二 三 四 五 六

        // 0 纪元
        // 1 年
        // 2 月
        // 3 一年中的第几周
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DAY_OF_MONTH);
        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year + ", " + month + ", " + date + ", " + week);
    }
}
