package com.wtc.advanceclass.polymorphism;

public class TypeConvert {
    public static void main(String[] args) {
        Animal a = new Dog();

        // 编译看左边，运行看右边
        a.eat();

        // 多态的弊端
        // 无法调用子类的特有功能
        // a.lookHome();

        // 强制转换为子类
        // instanceof 用于判断是不是 某个类型 并转换
        if (a instanceof Dog d) {
            d.lookHome();
        } else if (a instanceof Cat c) {
            c.catchMouse();
        } else {
            System.out.println("类型无法转换");
        }
    }
}

class Animal {
    public void eat() {
        System.out.println("动物在吃东西");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void lookHome() {
        System.out.println("狗看家");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃小鱼干");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}