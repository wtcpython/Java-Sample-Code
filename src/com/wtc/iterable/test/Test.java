package com.wtc.iterable.test;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<PersianCat> list1 = new ArrayList<>();
        ArrayList<LiHuaCat> list2 = new ArrayList<>();
        ArrayList<TeddyDog> list3 = new ArrayList<>();
        ArrayList<HuskyDog> list4 = new ArrayList<>();

        keepPet(list1);
        keepPet(list2);
        // keepPet(list3);
        // keepPet(list4);

        // keepPet2(list1);
        // keepPet2(list2);
        keepPet2(list3);
        keepPet2(list4);

        keepPet3(list1);
        keepPet3(list2);
        keepPet3(list3);
        keepPet3(list4);
    }

    // 只有猫，没有狗
    public static <E> void keepPet(ArrayList<? extends Cat> list) {

    }

    // 只有狗，没有猫
    public static <E> void keepPet2(ArrayList<? extends Dog> list) {

    }

    // 所有动物
    public static <E> void keepPet3(ArrayList<? extends Animal> list) {

    }
}
