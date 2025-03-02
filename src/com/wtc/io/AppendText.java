package com.wtc.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class AppendText {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("a.txt", true);
        String str = "abcdefg";
        fos.write(str.getBytes());

        fos.write(System.lineSeparator().getBytes());

        String str2 = "666";
        fos.write(str2.getBytes());
        fos.close();
    }
}
