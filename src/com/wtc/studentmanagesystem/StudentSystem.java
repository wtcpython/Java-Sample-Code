package com.wtc.studentmanagesystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-----------欢迎来到学生管理系统-----------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入您的选择：");

            String choose = sc.next();
            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    sc.close();
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);

        String id = null;
        while (true) {
            System.out.println("请输入学生的id");
            id = sc.next();

            if (contains(list, id)) {
                // id 已经存在
                System.out.println("id 已经存在，请重新录入");
            } else {
                break;
            }
        }

        System.out.println("请输入学生的姓名");
        String name = sc.next();

        System.out.println("请输入学生的年龄");
        int age = sc.nextInt();

        System.out.println("请输入学生的家庭住址");
        String address = sc.next();

        Student s = new Student(id, name, age, address);
        list.add(s);

        // 提示用户
        System.out.println("学生信息添加成功");
    }

    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的 id");
        String id = sc.next();

        int index = getIndex(list, id);
        if (index == -1) {
            System.out.println("id 不存在，删除失败");
            return;
        }

        // 存在，直接删除
        list.remove(index);
        System.out.println("删除成功");
    }

    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的 id");
        String id = sc.next();

        int index = getIndex(list, id);
        if (index == -1) {
            System.out.println("id 不存在，请重新输入");
            return;
        }

        Student stu = list.get(index);

        System.out.println("请输入修改后学生的姓名");
        String name = sc.next();
        stu.setName(name);

        System.out.println("请输入修改后学生的年龄");
        int age = sc.nextInt();
        stu.setAge(age);

        System.out.println("请输入修改后学生的家庭住址");
        String address = sc.next();
        stu.setAddress(address);

        System.out.println("学生信息修改成功");
    }

    public static void queryStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }

        // 打印表头信息
        System.out.println("id\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu);
        }
    }

    public static boolean contains(ArrayList<Student> list, String id) {
        // for (int i = 0; i < list.size(); i++) {
        // Student stu = list.get(i);
        // if (stu.getId().equals(id)) {
        // return true;
        // }
        // }
        // return false;
        return getIndex(list, id) >= 0;
    }

    public static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
