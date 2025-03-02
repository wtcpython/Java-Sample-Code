package com.wtc.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        // FileInputStream fis = new FileInputStream("./a.txt");
        // FileOutputStream fos = new FileOutputStream("./b.txt");
        // int b;
        // while ((b = fis.read()) != -1) {
        // fos.write(b);
        // }
        // fis.close();
        // fos.close();

        FileInputStream fis2 = new FileInputStream("./a.txt");
        FileOutputStream fos2 = new FileOutputStream("./b.txt");
        byte[] bytes = new byte[2];
        int len;
        while ((len = fis2.read(bytes)) != -1) {
            fos2.write(bytes, 0, len);
        }
        fis2.close();
        fos2.close();
    }
}
