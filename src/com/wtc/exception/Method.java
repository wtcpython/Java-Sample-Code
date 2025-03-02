package com.wtc.exception;
public class Method {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            e.printStackTrace(); // 仅仅打印信息，不会影响程序运行
        }

        System.out.println("看看我执行了吗？");
    }
}
