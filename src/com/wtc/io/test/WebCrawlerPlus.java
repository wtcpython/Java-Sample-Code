package com.wtc.io.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

public class WebCrawlerPlus {
    public static void main(String[] args) {
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        String familyNameStr = HttpUtil.get(familyNameNet);
        String boyNameStr = HttpUtil.get(boyNameNet);
        String girlNameStr = HttpUtil.get(girlNameNet);

        ArrayList<String> familyNameTempList = (ArrayList<String>) ReUtil.findAll("(\\W{4})(，|。)", familyNameStr, 1);
        ArrayList<String> boyNameTempList = (ArrayList<String>) ReUtil.findAll("([\\u4E00-\\u9FA5]{2})(、|。)",
                boyNameStr, 1);
        ArrayList<String> girlNameTempList = (ArrayList<String>) ReUtil.findAll("(.. ){4}..", girlNameStr, 0);

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
        FileUtil.writeLines(list, "names.txt", "UTF-8");
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

}
