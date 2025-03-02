package com.wtc.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("d.txt");
        fw.write(25105);
        fw.close();
    }
}
