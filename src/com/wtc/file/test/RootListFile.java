package com.wtc.file.test;
import java.io.File;

public class RootListFile {
    public static void main(String[] args) {
        searchAllMovie();
    }

    public static void searchAllMovie() {
        File[] arr = File.listRoots();
        for (File f : arr) {
            searchMovie(f);
        }
    }

    public static void searchMovie(File src) {
        File[] files = src.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    String name = file.getName();
                    if (name.endsWith(".mp4")) {
                        System.out.println(file);
                    }
                } else {
                    searchMovie(file);
                }
            }
        }
    }
}
