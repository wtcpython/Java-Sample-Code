package com.wtc.iterable.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RandomRollCall {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "范闲", "范建", "范统", "杜子腾", "杜琦燕", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰", "袁明媛");

        Random r =new Random();
        int index = r.nextInt(list.size());

        System.out.println(list.get(index));

        Collections.shuffle(list);
        String name = list.get(0);
        System.out.println(name);
    }
}
