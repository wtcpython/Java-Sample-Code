package com.wtc.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintText {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("out.txt"), true);

        pw.println(97);
        pw.print(true);
        pw.println();
        pw.printf("%s, World", "Hello");

        pw.close();
    }
}
