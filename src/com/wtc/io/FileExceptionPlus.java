package com.wtc.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExceptionPlus {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("./a.txt");
        FileOutputStream fos = new FileOutputStream("./b.txt");
        try (fis; fos) {
            byte[] bytes = new byte[2];
            int len;
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
