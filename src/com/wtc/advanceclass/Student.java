package com.wtc.advanceclass;

public class Student {
    private String name;
    private int age;
    private String gender;

    // 新增属性
    public static String teacherName;

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", teacherName=" + teacherName + "]";
    }

    public void study() {
        System.out.println(name + "正在学习");
    }
}
