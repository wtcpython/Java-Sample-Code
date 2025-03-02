package com.wtc.file;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class ListFile {
    public static void main(String[] args) {
        File f = new File("./");
        File[] files = f.listFiles();
        for (File file : files) {
            // file 表示每一个文件或文件夹
            System.out.println(file);
        }

        System.out.println("=========================");

        // listRoots 获取系统中的所有盘符
        File[] arr = File.listRoots();
        System.out.println(Arrays.toString(arr));

        // list 获取所有内容（仅名称）
        File f1 = new File("./");
        String[] arr1 = f1.list();
        for (String s : arr1) {
            System.out.println(s);
        }

        System.out.println("=========================");

        File f2 = new File("./");
        String[] arr2 = f2.list(new FilenameFilter() {
            @Override
            // dir 父级路径
            // name 子级路径
            public boolean accept(File dir, String name) {
                File src = new File(dir, name);
                return (src.isFile() && name.endsWith(".txt"));
            }
        });
        System.out.println(Arrays.toString(arr2));

        System.out.println("=========================");

        File f3 = new File("./");
        File[] arr3 = f3.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile() && pathname.getName().endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(arr3));

        System.out.println("=========================");

        File f4 = new File("./");
        File[] arr4 = f4.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir, name);
                return (src.isFile() && name.endsWith(".txt"));
            }

        });
        System.out.println(Arrays.toString(arr4));
    }
}
