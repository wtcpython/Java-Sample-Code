package com.wtc.string.test;

public class StringReplace {
    public static void main(String[] args) {
        // 敏感词替换

        String talk = "你玩的真好，TMD，CNM";
        String[] arr = {"TMD", "CNM", "SB"};

        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "****");
        }

        System.out.println(talk);
    }
}
