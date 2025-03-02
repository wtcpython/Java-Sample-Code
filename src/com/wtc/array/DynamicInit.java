package com.wtc.array;

public class DynamicInit {
    public static void main(String[] args) {
        // 动态初始化
        String[] arr = new String[50];
        
        // 添加数据
        arr[0] = "zhangsan";
        arr[1] = "lisi";

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]); // 默认值为 null
    }
}
