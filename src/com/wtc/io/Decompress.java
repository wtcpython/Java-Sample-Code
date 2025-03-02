package com.wtc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Decompress {
    public static void main(String[] args) throws IOException {
        File src = new File("a.zip");
        File dest = new File("./");

        unzip(src, dest);
    }

    public static void unzip(File src, File dest) throws IOException {
        ZipInputStream zis = new ZipInputStream(new FileInputStream(src));

        ZipEntry entry;
        while ((entry = zis.getNextEntry()) != null) {
            System.out.println(entry);

            if (entry.isDirectory()) {
                File file = new File(dest, entry.toString());
                file.mkdirs();
            } else {
                FileOutputStream fos = new FileOutputStream(new File(dest, entry.toString()));
                int b;
                while ((b = zis.read()) != -1) {
                    fos.write(b);
                }
                fos.close();
                zis.closeEntry();
            }
        }
        zis.close();
    }
}
