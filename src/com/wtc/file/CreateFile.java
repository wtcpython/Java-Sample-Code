package com.wtc.file;
import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        // createNewFile
        File f1 = new File("c.txt");
        boolean b = f1.createNewFile(); // 无法创建多层文件夹和文件
        System.out.println(b); // 是否创建成功

        // mkdir 创建文件夹
        // mkdir 遵循路径唯一原则，且只能创建单级文件夹
        File f2 = new File("docs");
        boolean b2 = f2.mkdir();
        System.out.println(b2);

        // mkdirs 可以创建多级文件夹
        File f3 = new File("path/to/directory");
        boolean b3 = f3.mkdirs();
        System.out.println(b3);
    }
}
