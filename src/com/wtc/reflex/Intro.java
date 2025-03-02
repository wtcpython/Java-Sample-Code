package com.wtc.reflex;
public class Intro {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
         * 1. Class.forName();
         * 2. 类名.class;
         * 3. Object.getClass();
         */

        Class<?> clazz1 = Class.forName("Student");
        System.out.println(clazz1);

        Class<?> clazz2 = Student.class;
        System.out.println(clazz2);

        Student stu = new Student();
        Class<?> clazz3 = stu.getClass();
        System.out.println(clazz3);
    }
}
