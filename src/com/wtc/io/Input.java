package com.wtc.io;

import java.io.FileReader;
import java.io.IOException;

public class Input {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("d.txt");

        // 在第一次读取的时候，会加载 8192 个字节到缓冲区
        int b1 = fr.read();
        System.out.println(b1);

        int b2 = fr.read();
        System.out.println(b2);

        int b3 = fr.read();
        System.out.println(b3);
        System.out.println((char) b3);

        int b4 = fr.read();
        System.out.println(b4);

        fr.close();
    }
}
