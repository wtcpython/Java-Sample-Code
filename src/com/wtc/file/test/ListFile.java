package com.wtc.file.test;
import java.io.File;

public class ListFile {
    public static void main(String[] args) {
        File file = new File("./");
        boolean b = haveMovie(file);
        System.out.println(b);
    }

    public static boolean haveMovie(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile() && f.getName().endsWith(".mp4")) {
                return true;
            }
        }
        return false;
    }
}
 