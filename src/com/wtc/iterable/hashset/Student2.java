package com.wtc.iterable.hashset;

public class Student2 implements Comparable<Student2> {
    // 姓名
    private String name;
    // 年龄
    private int age;
    // 语文成绩
    private int chinese;
    // 数学成绩
    private int math;
    // 英语成绩
    private int english;

    public Student2() {
    }

    public Student2(String name, int age, int chinese, int math, int english) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
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

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return "Student2 [name=" + name + ", age=" + age + ", chinese=" + chinese + ", math=" + math + ", english="
                + english + "]";
    }

    @Override
    public int compareTo(Student2 o) {
        int sum1 = getChinese() + getMath() + getEnglish();
        int sum2 = o.getChinese() + o.getMath() + o.getEnglish();
        // 总分比较
        int i = sum1 - sum2;
        // 语文比较
        i = i == 0 ? getChinese() - o.getChinese() : i;
        // 数学比较
        i = i == 0 ? getMath() - o.getMath() : i;
        // 英语比较（可选）
        // i = i == 0 ? getEnglish() - o.getEnglish() : i;
        // 年龄比较
        i = i == 0 ? getAge() - o.getAge() : i;
        // 姓名比较
        i = i == 0 ? getName().compareTo(o.getName()) : i;
        return i;
    }

}
