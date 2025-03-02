package com.wtc.api.search;

public class BlockSearch {
    public static void main(String[] args) {
        // 分块查找
        int[] arr = { 16, 5, 9, 12, 21, 18, 32, 23, 37, 26, 45, 34, 50, 48, 61, 52, 73, 66 };

        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);

        Block[] blockArr = { b1, b2, b3 };

        int number = 37;

        int index = getIndex(blockArr, arr, number);

        System.out.println(index);
    }

    private static int getIndex(Block[] blockArr, int[] arr, int number) {
        int indexBlock = findIndex(blockArr, number);

        if (indexBlock == -1) {
            return -1;
        }

        int startIndex = blockArr[indexBlock].startIndex;
        int endIndex = blockArr[indexBlock].endIndex;

        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == number) {
                return i;
            }
        }

        return -1;
    }

    private static int findIndex(Block[] blockArr, int number) {
        for (int i = 0; i < blockArr.length; i++) {
            if (number <= blockArr[i].max) {
                return i;
            }
        }

        return -1;
    }
}

class Block {
    int max;
    int startIndex;
    int endIndex;

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

}