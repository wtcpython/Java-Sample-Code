package com.wtc.io.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperty {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("a.properties");
        prop.load(fis);
        fis.close();

        System.out.println(prop);
    }
}
