package com.wtc.io;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        int b;
        while ((b = fis.read()) != -1) {
            System.out.println((char)b);
        }
        fis.close();
    }
}
