package com.wtc.io;

import java.io.FileWriter;
import java.io.IOException;

public class Output {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("e.txt");

        // write 将数据放入缓冲区中
        fw.write(97);

        for (int i = 0; i < 8192; i++) {
            fw.write(97);
        }

        // 缓冲满的时候，会直接写入文件
        // flush 刷新
        // close 关闭
        fw.write(98);

        fw.flush();

        fw.write(97);

        fw.close();
    }
}
