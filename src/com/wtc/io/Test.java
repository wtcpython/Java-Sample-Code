package com.wtc.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("f.txt");
        StringBuilder sb = new StringBuilder();
        int ch;
        while ((ch = fr.read()) != -1) {
            sb.append((char) ch);
        }

        fr.close();

        /*
         * 方法一
         * String str = sb.toString();
         * String[] split = str.split("-");
         * 
         * ArrayList<Integer> list = new ArrayList<>();
         * for (String s : split) {
         * int i = Integer.parseInt(s);
         * list.add(i);
         * }
         * 
         * Collections.sort(list);
         * 
         * FileWriter fw = new FileWriter("f.txt");
         * StringJoiner sj = new StringJoiner("-");
         * for (Integer num : list) {
         * sj.add(num.toString());
         * }
         * fw.write(sj.toString());
         * fw.close();
         */

        // 方法二
        Integer[] arr = Arrays.stream(sb.toString().split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);
        FileWriter fw = new FileWriter("f.txt");
        String s = Arrays.toString(arr).replaceAll(", ", "-");
        String res = s.substring(1, s.length() - 1);
        fw.write(res);
        fw.close();
    }
}
