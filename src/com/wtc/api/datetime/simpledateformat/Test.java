package com.wtc.api.datetime.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date d = new Date(0L);
        String str = sdf.format(d);
        System.out.println(str);

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str2 = sdf2.format(d);
        System.out.println(str2);

        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEEE");
        String str3 = sdf3.format(d);
        System.out.println(str3);

        String str4 = "2023-11-11 11:11:11";
        SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d2 = sdf4.parse(str4);
        System.out.println(d2.getTime());
    }
}
