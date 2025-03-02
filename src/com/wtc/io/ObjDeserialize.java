package com.wtc.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjDeserialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.txt"));

        Object o = ois.readObject();

        System.out.println(o);

        ois.close();
    }
}
