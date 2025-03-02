package com.wtc.io;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("c.txt");
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();

        FileReader fr2 = new FileReader("c.txt");
        char[] chars = new char[2];
        int len;
        while ((len = fr2.read(chars)) != -1) {
            System.out.print(new String(chars, 0, len));
        }
        fr2.close();
    }
}
