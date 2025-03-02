package com.wtc.exception.test;
import java.util.Scanner;

import com.wtc.exception.Student;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();
        while (true) {
            try {
                System.out.println("输入名称：");
                String name = sc.nextLine();
                stu.setName(name);
                System.out.println("输入年龄：");
                String ageString = sc.nextLine();
                int age = Integer.parseInt(ageString);
                stu.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄格式有误");
            } catch (NameFormatException e) {
                e.printStackTrace();
            } catch (AgeOutOfBoundsException e) {
                e.printStackTrace();
            }
        }

        System.out.println(stu);
        sc.close();
    }
}
