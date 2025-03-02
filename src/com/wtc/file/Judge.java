package com.wtc.file;
import java.io.File;

public class Judge {
    public static void main(String[] args) {
        // 判断文件
        File f1 = new File("a.txt");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());

        // 判断文件夹
        File f2 = new File("SubDirectory");
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(f2.exists());

        // 判断不存在的文件
        File f3 = new File("NotExist.txt");
        System.out.println(f3.isDirectory());
        System.out.println(f3.isFile());
        System.out.println(f3.exists());
    }
}
