package com.wtc.advanceclass.polymorphism;

public class PersonTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("王建国");
        t.setAge(30);

        Administrator admin = new Administrator();
        admin.setName("管理员");
        admin.setAge(35);

        register(s);
        register(t);
        register(admin);
    }

    public static void register(Person p) {
        p.show();
    }
}
