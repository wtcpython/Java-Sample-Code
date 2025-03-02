package com.wtc.advanceclass.inherit;

public class MemberAccess {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.ziShow();
    }
}

class Ye {
    String name = "Ye";
}

class Fu extends Ye {
    String name = "Fu";
}

class Zi extends Fu {
    String name = "Zi";

    public void ziShow() {
        // this 代表本类
        // super 代表父类
        String name = "ziShow";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
        // super 不能多次使用
        // System.out.println(super.super.name);
    }
}
