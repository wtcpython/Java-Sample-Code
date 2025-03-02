package com.wtc.io;

import java.io.Serializable;

public class Student implements Serializable {
    // 固定版本号以防止序列化失败
    private static final long serialVersionID = 1L;

    private String name;
    private int age;
    // transient 参数用于防止序列化
    private transient String address;

    public Student() {
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static long getSerialversionid() {
        return serialVersionID;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
    }

}
