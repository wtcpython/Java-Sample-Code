package com.wtc.file.test;
import java.io.File;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class FileCount {
    public static void main(String[] args) {
        File file = new File("./");
        HashMap<String, Integer> hm = getCount(file);
        System.out.println(hm);

    }

    public static HashMap<String, Integer> getCount(File src) {
        HashMap<String, Integer> hm = new HashMap<>();
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                String name = file.getName();
                String[] arr = name.split("\\.");
                if (arr.length >= 2) {
                    String endName = arr[arr.length - 1];
                    if (hm.containsKey(endName)) {
                        int count = hm.get(endName);
                        count++;
                        hm.put(endName, count);
                    } else {
                        hm.put(endName, 1);
                    }
                }
            } else {
                HashMap<String, Integer> shm = getCount(file);
                Set<Entry<String, Integer>> entries = shm.entrySet();
                for (Entry<String, Integer> entry : entries) {
                    String key = entry.getKey();
                    int value = entry.getValue();
                    if (hm.containsKey(key)) {
                        int count = hm.get(key);
                        count += value;
                        hm.put(key, count);
                    } else {
                        hm.put(key, value);
                    }
                }
            }
        }

        return hm;
    }
}
