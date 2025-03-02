package com.wtc.io.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.Map.Entry;

public class Property {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();

        prop.put("aaa", "111");
        prop.put("bbb", "222");
        prop.put("ccc", "333");
        prop.put("ddd", "444");

        System.out.println(prop);

        Set<Object> keys = prop.keySet();
        for (Object key : keys) {
            Object value = prop.get(key);
            System.out.println(key + " = " + value);
        }

        // 旧方法
        BufferedWriter bw = new BufferedWriter(new FileWriter("a.properties"));
        Set<Entry<Object, Object>> entries = prop.entrySet();
        for (Entry<Object, Object> entry : entries) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            bw.write(key + "=" + value);
            bw.newLine();
        }

        bw.close();

        // 特有方法
        FileOutputStream fos = new FileOutputStream("a.properties");
        prop.store(fos, "test");
        fos.close();
    }
}
