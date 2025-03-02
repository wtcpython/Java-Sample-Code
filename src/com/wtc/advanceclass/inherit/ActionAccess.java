package com.wtc.advanceclass.inherit;

public class ActionAccess {
    public static void main(String[] args) {
        // Student s = new Student();
        // s.lunch();

        OverseasStudent s = new OverseasStudent();
        s.lunch();
    }
}

class Person {
    public void eat() {
        System.out.println("吃米饭，吃菜");
    }

    public void drink() {
        System.out.println("喝开水");
    }
}

class OverseasStudent extends Person {
    public void lunch() {
        this.eat();
        this.drink();

        // 直接调用父类方法
        super.eat();
        super.drink();
    }

    // 重写父类方法
    @Override
    public void eat() {
        System.out.println("吃意大利面");
    }

    @Override
    public void drink() {
        System.out.println("喝凉水");
    }
}

class Student extends Person {
    public void lunch() {
        eat();
        drink();

        // 直接调用父类方法
        super.eat();
        super.drink();
    }
}
 