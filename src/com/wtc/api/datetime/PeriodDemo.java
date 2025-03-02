package com.wtc.api.datetime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate birDate = LocalDate.of(2000, 1, 1);
        System.out.println(birDate);

        Period period = Period.between(birDate, today);
        System.out.println(period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        System.out.println(period.toTotalMonths());
    }
}
