package com.wtc.io.tools;

import java.io.File;

import cn.hutool.core.io.FileUtil;

public class HutoolDemo {
    public static void main(String[] args) {
        File file = FileUtil.file("aaa", "a.txt");
        System.out.println(file);

        File touch = FileUtil.touch(file);
        System.out.println(touch);
    }
}
