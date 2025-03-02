package com.wtc.iterable;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String[] args) {
        // addAll
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "aaa", "bbb", "ccc", "ddd", "eee");
        System.out.println(list);

        Collections.shuffle(list);

        System.out.println(list);
    }
}
