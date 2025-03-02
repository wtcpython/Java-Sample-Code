package com.wtc.iterable.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RandomRollCallV3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "范闲", "范建", "范统", "杜子腾", "杜琦燕", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰", "袁明媛");

        ArrayList<String> list2 = new ArrayList<>();

        // 10 轮遍历
        for (int i = 0; i < 10; i++) {
            System.out.println("--------" + (i + 1) + "--------");
            Random r = new Random();
            // for (int i = 0; i < list.size(); i++) {
            while (!list.isEmpty()) {
                int index = r.nextInt(list.size());
                String name = list.remove(index);
                list2.add(name);
                System.out.println(name);
            }

            // 一轮点名结束
            // System.out.println(list);
            // System.out.println(list2);
            list.addAll(list2);
            list2.clear();
        }

    }
}
