package com.wtc.file.test;
import java.io.File;

public class DirectorySize {
    public static void main(String[] args) {
        File file = new File("./");
        long len = getLen(file);
        System.out.println(len);
    }

    public static long getLen(File src) {
        long len = 0;
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                len += file.length();
            } else {
                len += getLen(file);
            }
        }

        return len;
    }
}
