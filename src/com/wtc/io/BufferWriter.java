package com.wtc.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("g.txt", true));

        bw.write("abcdefg");
        bw.newLine();

        bw.close();
    }
}
