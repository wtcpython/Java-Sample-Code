package com.wtc.file;
import java.io.File;

public class GetInfo {
    public static void main(String[] args) {
        // length 返回字节数量
        File f1 = new File("a.txt");
        long len = f1.length();
        System.out.println(len);

        // length 对于文件夹返回 0
        File f2 = new File("SubDirectory");
        long len2 = f2.length();
        System.out.println(len2);

        System.out.println("=========================");

        // getAbsolutePath 获取绝对路径
        File f3 = new File("a.txt");
        String path1 = f3.getAbsolutePath();
        System.out.println(path1);

        // getPath 返回定义时的文件路径
        File f4 = new File("a.txt");
        String path2 = f4.getPath();
        System.out.println(path2);

        System.out.println("=========================");

        // getName 获取名称
        File f5 = new File("SubDirectory", "b.txt");
        String name1 = f5.getName();
        System.out.println(name1);

        File f6 = new File("SubDirectory");
        String name2 = f6.getName();
        System.out.println(name2);

        // lastModified 文件的最后修改时间（毫秒）
        File f7 = new File("a.txt");
        long time = f7.lastModified();
        System.out.println(time);
    }
}
