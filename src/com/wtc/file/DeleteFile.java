package com.wtc.file;
import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        // 对于文件，直接删除
        File f1 = new File("c.txt");
        boolean b1 = f1.delete();
        System.out.println(b1);

        // 对于空文件夹，直接删除
        File f2 = new File("docs");
        boolean b2 = f2.delete();
        System.out.println(b2);

        // 非空文件夹，无法删除
        File f3 = new File("SubDirectory");
        boolean b3 = f3.delete();
        System.out.println(b3);
    }
}
