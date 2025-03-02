package com.wtc.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadManyObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("manyobj.txt"));

        @SuppressWarnings("unchecked")
        ArrayList<Student> list = (ArrayList<Student>) ois.readObject();

        for (Student stu : list) {
            System.out.println(stu);
        }

        ois.close();
    }
}
