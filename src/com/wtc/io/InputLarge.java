package com.wtc.io;

import java.io.FileReader;
import java.io.IOException;

public class InputLarge {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("large.txt");

        for(int i = 0; i < 8192; i ++) {
            fr.read();
        }

        // 8193
        // 超过 8192 个后，会覆盖缓冲区的内容
        fr.read();

        fr.close();
    }
}
