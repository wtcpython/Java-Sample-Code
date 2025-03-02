package com.wtc.reflex;
import java.lang.reflect.Field;
import java.util.Arrays;

public class Member {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        Class<?> clazz = Class.forName("Student");

        Field[] fields = clazz.getDeclaredFields();
        System.out.println(Arrays.toString(fields));

        // 获取单个成员变量
        Field name = clazz.getDeclaredField("name");
        System.out.println(name);

        // 获取权限修饰符
        int modifiers = name.getModifiers();
        System.out.println(modifiers);

        String n = name.getName();
        System.out.println(n);

        Class<?> type = name.getType();
        System.out.println(type);

        Student s = new Student("zhangsan", 23);
        // 临时授权
        name.setAccessible(true);
        Object value = name.get(s);
        System.out.println(value);

        name.set(s, "lisi");
        System.out.println(s.getName());
    }
}
