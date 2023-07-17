package ceshi;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class EightQueens {

    private static final int N = 8; // 棋盘大小

    private static int[] queens = new int[N]; // 存储每一行皇后所在的列索引
    private static int nums = 0;

    public static void solveQueens() {
        placeQueen(0); // 从第一行开始放置皇后
    }

    private static void placeQueen(int row) {
        if (row == N) {
            printQueens(); // 打印解法
            System.out.println("nums = " + ++nums);
    } else {
        for (int col = 0; col < N; col++) {
            if (isValidPosition(row, col)) {
                queens[row] = col; // 在当前行的合法位置放置皇后
                placeQueen(row + 1); // 递归放置下一行的皇后
            }
        }
    }
}

    private static boolean isValidPosition(int row, int col) {
        for (int i = 0; i < row; i++) {
            // 检查是否和前面的皇后在同一列或同一斜线上
            if (queens[i] == col || queens[i] - i == col - row || queens[i] + i == col + row) {
                return false;
            }
        }
        return true;
    }

    private static void printQueens() {
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                if (queens[row] == col) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        solveQueens();
    }
}