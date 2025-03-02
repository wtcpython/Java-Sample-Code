package com.wtc.exception;
public class CatchException {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        try {
            System.out.println(arr[10]);
            System.out.println(2 / 0);
            String s = null;
            System.out.println(s.length());
            System.out.println("看看我执行了吗？"); // 不会执行代码
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("索引越界了");
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        }

        System.out.println("看看我执行了吗？");
    }
}
