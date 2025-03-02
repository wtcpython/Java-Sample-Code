package com.wtc.advanceclass.inherit.test;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("001", "张三", 15000, 8000);

        m.work();
        m.eat();

        Cook c = new Cook();
        c.setId("002");
        c.setName("李四");
        c.setSalary(8000);

        c.work();
        c.eat();
    }
}
