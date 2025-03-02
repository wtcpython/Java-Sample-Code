package com.wtc.reflex;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class JMethod {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
            IllegalAccessException, InvocationTargetException {
        Class<?> clazz = Class.forName("Student");

        // 包含 Object 类中的方法
        Method[] methods = clazz.getMethods();
        System.out.println(Arrays.toString(methods));

        // 不包含 Object 类中的方法，包含私有方法
        Method[] methods2 = clazz.getDeclaredMethods();
        System.out.println(Arrays.toString(methods2));

        // 获取指定的单一方法
        Method m = clazz.getMethod("setName", String.class);
        System.out.println(m);

        // 获取权限
        int modifiers = m.getModifiers();
        System.out.println(modifiers);

        String name = m.getName();
        System.out.println(name);

        Class<?>[] exceptionTypes = m.getExceptionTypes();
        System.out.println(Arrays.toString(exceptionTypes));

        // 运行方法
        Student s = new Student("zhangsan", 23);
        // 没有返回值，则为 null
        Object retVal = m.invoke(s, "lisi");
        System.out.println(retVal);
        System.out.println(s.getName());
    }
}
