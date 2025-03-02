package com.wtc.io;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CodecFile {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "你好";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));

        byte[] bytes2 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));

        // 解码
        String str2 = new String(bytes);
        System.out.println(str2);

        String str3 = new String(bytes2, "GBK");
        System.out.println(str3);
    }
}
