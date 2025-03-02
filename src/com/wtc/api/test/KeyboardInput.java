package com.wtc.api.test;

import java.util.ArrayList;
import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sum < 200) {
            System.out.println("输入一个整数：");
            String s = sc.nextLine();
            int num = Integer.parseInt(s);
            if (num >= 1 && num <= 100) {
                sum += num;
                list.add(num);
            } else {
                System.out.println("输入非法");
                continue;
            }
        }
        sc.close();

        for (Integer num : list) {
            System.out.println(num);
        }

    }
}
