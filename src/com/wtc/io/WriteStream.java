package com.wtc.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteStream {
    public static void main(String[] args) throws IOException {
        // 参数可以是 String，也可以是 File 对象
        // 文件可以不存在，会创建一个新的文件
        // 默认是覆盖模式写入文件
        FileOutputStream fos = new FileOutputStream("a.txt");
        // 文件写入的是 byte，输入 int 实际上为 ASCII 值，会转换为对应的值
        fos.write(97);
        fos.write(57);
        fos.write(55);
        fos.close();
    }
}
