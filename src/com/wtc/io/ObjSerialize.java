package com.wtc.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjSerialize {
    public static void main(String[] args) throws IOException {
        Student stu = new Student("zhangsan", 23, "nanjing");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.txt"));

        oos.writeObject(stu);

        oos.close();
    }
}
