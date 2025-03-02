package com.wtc.api.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);

        System.out.println(nowDate.getYear());

        Month month = nowDate.getMonth();
        System.out.println(month);
        System.out.println(month.getValue());

        System.out.println(nowDate.getMonthValue());

        System.out.println(nowDate.getDayOfYear());

        DayOfWeek dayOfWeek = nowDate.getDayOfWeek();
        System.out.println(dayOfWeek);
        System.out.println(dayOfWeek.getValue());
    }
}
