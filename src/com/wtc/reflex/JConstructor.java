package com.wtc.reflex;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class JConstructor {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> clazz = Class.forName("Student");

        // Constructor<?>[] cons = clazz.getConstructors();

        // for (Constructor<?> con : cons) {
        // System.out.println(con);
        // }

        // Constructor<?>[] cons = clazz.getDeclaredConstructors();

        // for (Constructor<?> con : cons) {
        // System.out.println(con);
        // }

        Constructor<?> con1 = clazz.getDeclaredConstructor();
        System.out.println(con1);

        // 传参：参数类型
        Constructor<?> con2 = clazz.getDeclaredConstructor(String.class, int.class);
        int modifiers = con2.getModifiers();
        System.out.println(modifiers);

        Parameter[] parameters = con2.getParameters();
        System.out.println(Arrays.toString(parameters));

        // 临时取消权限校验
        con2.setAccessible(true);
        Student stu = (Student) con2.newInstance("zhangsan", 23);
        System.out.println(stu);
        // System.out.println(con2);
    }
}
