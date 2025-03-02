package com.wtc.advanceclass;

public class StaticMethod {
    public static void main(String[] args) {
        // Student.teacherName = "王老师";

        // Student s1 = new Student();
        // s1.setName("张三");
        // s1.setAge(23);
        // s1.setGender("男");

        // s1.study();
        // System.out.println(s1);

        // Student s2 = new Student();
        // s2.setName("李四");
        // s2.setAge(24);
        // s2.setGender("女");

        // s2.study();
        // System.out.println(s2);

        int[] arr1 = { 1, 2, 3, 4, 5 };
        String str = ArrayUtil.printArr(arr1);
        System.out.println(str);

        double[] arr2 = { 1.5, 3.7, 4.9, 5.8, 6.6 };
        double avg = ArrayUtil.getAverage(arr2);
        System.out.println(avg);
    }
}
