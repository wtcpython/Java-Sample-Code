package com.wtc.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintByte {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream(new FileOutputStream("out.txt"), true);

        ps.println(97);
        ps.print(true);
        ps.println();
        ps.printf("%s, World", "Hello");

        ps.close();
    }
}
