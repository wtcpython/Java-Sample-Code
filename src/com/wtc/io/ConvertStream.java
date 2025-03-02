package com.wtc.io;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class ConvertStream {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("a.txt", Charset.forName("GBK"));

        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.println((char) ch);
        }

        fr.close();
    }
}
