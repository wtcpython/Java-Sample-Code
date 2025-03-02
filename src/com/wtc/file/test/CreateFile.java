package com.wtc.file.test;
import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        // 需求：在当前目录下的 aaa 文件夹中创建一个 a.txt 文件
        File f1 = new File("aaa");
        f1.mkdir();
        File f2 = new File(f1, "a.txt");
        boolean b = f2.createNewFile();
        if (b) {
            System.out.println("创建成功");
        } else {
            System.out.println("创建失败");
        }
    }
}
