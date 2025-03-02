package com.wtc.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputInfo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("large.txt");
        fr.read(); // 这句话会将文件的前 8192 个字节放在缓冲区中

        // 创建 FileWriter 时，会清空文件中的所有内容
        FileWriter fw = new FileWriter("large.txt");

        // 此时只能读取缓冲区的内容，一共 8192 - 1 个
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.println((char) ch);
        }

        fw.close();
        fr.close();
    }
}
