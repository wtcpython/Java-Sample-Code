package com.wtc.advanceclass.classlayout;

import org.openjdk.jol.info.ClassLayout;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "zhangsan";
        s.age = 23;

        s.show();

        ClassLayout layout = ClassLayout.parseInstance(s);
        System.out.println(layout.toPrintable());
    }
}
