package com.wtc.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteText {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("a.txt");
        // fos.write(97); // a
        // fos.write(98); // b
        byte[] bytes = { 97, 98, 99, 100, 101 };
        // fos.write(bytes);

        // void write(byte[] b, int off, int len)
        // off 起始索引，len 长度
        fos.write(bytes, 1, 2);

        fos.close();
    }
}
