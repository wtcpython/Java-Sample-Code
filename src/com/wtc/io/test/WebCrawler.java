package com.wtc.io.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {
    public static void main(String[] args) throws IOException, URISyntaxException {
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        String familyNameStr = getWebData(familyNameNet);
        String boyNameStr = getWebData(boyNameNet);
        String girlNameStr = getWebData(girlNameNet);

        ArrayList<String> familyNameTempList = selectData(familyNameStr, "(\\W{4})(，|。)", 1);
        ArrayList<String> boyNameTempList = selectData(boyNameStr, "([\\u4E00-\\u9FA5]{2})(、|。)", 1);
        ArrayList<String> girlNameTempList = selectData(girlNameStr, "(.. ){4}..", 0);

        // 处理数据
        ArrayList<String> familyNameList = new ArrayList<>();
        for (String str : familyNameTempList) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                familyNameList.add(c + "");
            }
        }

        ArrayList<String> boyNameList = new ArrayList<>();
        for (String str : boyNameTempList) {
            if (!boyNameList.contains(str)) {
                boyNameList.add(str);
            }
        }

        ArrayList<String> girlNameList = new ArrayList<>();
        for (String str : girlNameTempList) {
            String[] arr = str.split(" ");
            for (String item : arr) {
                girlNameList.add(item);
            }
        }

        ArrayList<String> list = getInfos(familyNameList, boyNameList, girlNameList, 70, 50);
        Collections.shuffle(list);
        
        // 写入文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("names.txt"));
        for (String str : list) {
            bw.write(str);
            bw.newLine();
        }
        bw.close();
    }

    public static ArrayList<String> getInfos(ArrayList<String> familyNameList, ArrayList<String> boyNameList,
            ArrayList<String> girlNameList, int boyCount, int girlCount) {
        HashSet<String> boyhs = new HashSet<>();
        while (true) {
            if (boyhs.size() == boyCount) {
                break;
            }
            Collections.shuffle(familyNameList);
            Collections.shuffle(boyNameList);

            boyhs.add(familyNameList.get(0) + boyNameList.get(0));
        }

        HashSet<String> girlhs = new HashSet<>();
        while (true) {
            if (girlhs.size() == girlCount) {
                break;
            }
            Collections.shuffle(familyNameList);
            Collections.shuffle(girlNameList);

            girlhs.add(familyNameList.get(0) + girlNameList.get(0));
        }

        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();

        for (String boyName : boyhs) {
            // 18 ~ 27
            int age = r.nextInt(18, 28);
            list.add(boyName + "-男-" + age);
        }

        for (String girlName : girlhs) {
            // 18 ~ 25
            int age = r.nextInt(18, 26);
            list.add(girlName + "-女-" + age);
        }

        return list;
    }

    public static ArrayList<String> selectData(String str, String regex, int index) {
        ArrayList<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            list.add(matcher.group(index));
        }

        return list;
    }

    public static String getWebData(String net) throws IOException, URISyntaxException {
        StringBuilder sb = new StringBuilder();
        URL url = new URI(net).toURL();
        URLConnection connection = url.openConnection();

        InputStreamReader isr = new InputStreamReader(connection.getInputStream());

        int ch;
        while ((ch = isr.read()) != -1) {
            sb.append((char) ch);
        }
        isr.close();
        return sb.toString();
    }
}
