package com.wtc.api.datetime;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdDemo {
    public static void main(String[] args) {
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds);
        System.out.println(zoneIds.size());

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
    }
}
