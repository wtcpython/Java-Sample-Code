package com.wtc.api.clone;

import com.google.gson.Gson;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0 };
        User u1 = new User(1, "zhangsan", "1234qwer", "11", data);

        // clone
        // 1. 重写 clone 方法
        // 2. 实现 Cloneable 接口
        // 3. 创建对象并克隆
        User u2 = (User) u1.clone();

        int[] arr = u1.getData();
        arr[0] = 100;

        System.out.println(u1);
        System.out.println(u2);

        // 第三方工具
        Gson gson = new Gson();
        String s = gson.toJson(u1);
        System.out.println(s);
        User user = gson.fromJson(s, User.class);
        System.out.println(user);
    }
}
