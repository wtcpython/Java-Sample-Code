package com.wtc.exercises;

import java.util.Random;
import java.util.Scanner;

public class DoubleBallLottery {
    private static int[] createNumber() {
        int[] arr = new int[7];

        Random r = new Random();
        for (int i = 0; i < 6;) {
            int redNumber = r.nextInt(1, 34);
            boolean flag = contains(arr, redNumber);
            if (!flag) {
                arr[i] = redNumber;
                i++;
            }
        }

        int blueNumber = r.nextInt(1, 17);
        arr[arr.length - 1] = blueNumber;
        return arr;
    }

    private static int[] userInputNumber() {
        int[] arr = new int[7];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6;) {
            System.out.println("请输入第" + (i + 1) + "个红球号码：");
            int redNumber = sc.nextInt();
            if (redNumber >= 1 && redNumber <= 33) {
                boolean flag = contains(arr, redNumber);
                if (!flag) {
                    // 有效
                    arr[i] = redNumber;
                    i++;
                } else {
                    System.out.println("输入内容已存在！");
                }
            } else {
                System.out.println("输入非法！");
            }
        }

        System.out.println("请输入篮球号码：");
        while (true) {
            int blueNumber = sc.nextInt();
            if (blueNumber >= 1 && blueNumber <= 16) {
                arr[arr.length - 1] = blueNumber;
                break;
            } else {
                System.out.println("输入非法！");
            }
        }
        sc.close();

        return arr;
    }

    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = createNumber();

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }

        int[] userInputArr = userInputNumber();

        int redCount = 0;
        int blueCount = 0;

        for (int i = 0; i < userInputArr.length - 1; i++) {
            int redNumber = userInputArr[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if (redNumber == arr[j]) {
                    redCount++;
                    break;
                }
            }
        }

        int blueNumber = userInputArr[userInputArr.length - 1];
        if (blueNumber == arr[arr.length - 1]) {
            blueCount++;
        }

        if (redCount == 6 && blueCount == 1) {
            System.out.println("中奖 1000 万元");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("中奖 500 万元");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("中奖 3000 元");
        } else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
            System.out.println("中奖 200 元");
        } else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)) {
            System.out.println("中奖 10 元");
        } else if ((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1)
                || (redCount == 0 && blueCount == 1)) {
            System.out.println("中奖 5元");
        } else {
            System.out.println("参与奖");
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
