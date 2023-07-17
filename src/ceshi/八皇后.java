package ceshi;

public class 八皇后 {

    // 皇后个数
    private final static int num = 8;
    private static int nums = 0;



    // 皇后的队列
    private final static int[] queen = new int[num];

    private void placeQueen(int row) {
        if (row == num) {
            // TODO: 6/26/2023 打印
            System.out.println("nums = " + ++nums);
        } else {
            for (int col = 0; col < num; col++) {
                if (isVaild(row, col)) {
                    queen[row] = col;
                    placeQueen(row + 1);
                }
            }
        }
    }

    private boolean isVaild(int row, int col) {
        for (int i = 1; i < row; i++) {
            // 从第一行遍历, 有没有某一行的皇后和当前传值的皇后在同一行
            if (queen[i] == col || queen[i] - i == col - row || queen[i] + i == col + row) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        八皇后 八皇后 = new 八皇后();
        八皇后.placeQueen(0);
    }
}
