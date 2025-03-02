package com.wtc.io.tools;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class CommonsioDemo {
    public static void main(String[] args) throws IOException {
        File src = new File("a.txt");
        File dest = new File("copy.txt");

        FileUtils.copyFile(src, dest);
        
        File src2 = new File("aaa");
        File dest2 = new File("bbb");
        FileUtils.copyDirectoryToDirectory(src2, dest2);

        File src3 = new File("bbb");
        FileUtils.cleanDirectory(src3);
    }
}
