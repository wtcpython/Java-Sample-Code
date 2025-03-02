package com.wtc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Compress {
    public static void main(String[] args) throws IOException {
        File src = new File("b.txt");
        File dest = new File("b.zip");
        zip(src, dest);
    }

    public static void zip(File src, File dest) throws IOException {
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        ZipEntry entry = new ZipEntry(src.getName());
        zos.putNextEntry(entry);
        
        FileInputStream fis = new FileInputStream(src);
        int b;
        while ((b = fis.read()) != -1) {
            zos.write(b);
        }
        fis.close();
        zos.closeEntry();
        zos.close();
    }
}
