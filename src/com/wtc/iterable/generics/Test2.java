package com.wtc.iterable.generics;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();

        // 调用方法
        method(list1);

        // 泛型无法继承，写的是什么就是什么
        // method(list2);
        // method(list3);

        // 添加数据时可以继承
        list1.add(new Ye());
        list1.add(new Fu());
        list1.add(new Zi());

        // 泛型通配符
        // ? extends E 可以是 E 或者 E 的子类
        // ? super E 可以是 E 或者 E 的父类
        method2(list1);
        method2(list2);
        method2(list3);
        // method2(list4);

        method3(list4);
    }

    public static void method(ArrayList<Ye> list) {

    }

    public static void method2(ArrayList<? extends Ye> list) {

    }

    public static <E> void method3(ArrayList<E> list) {

    }
}

class Ye {
}

class Fu extends Ye {
}

class Zi extends Fu {
}
