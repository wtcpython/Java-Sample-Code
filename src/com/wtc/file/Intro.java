package com.wtc.file;
import java.io.File;

public class Intro {
    public static void main(String[] args) {
        String str = "a.txt";
        File f1 = new File(str);
        System.out.println(f1);

        String parent = "Directory";
        String child = "a.txt";
        File f2 = new File(parent, child);
        System.out.println(f2);

        File f3 = new File(parent);
        File f4 = new File(f3, child);
        System.out.println(f4);
    }
}
