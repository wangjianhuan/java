package LeetCode.leetcode.editor.cn;//给定一个矩阵 A， 返回 A 的转置矩阵。
//
// 矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。 
//
// 
//
// 示例 1： 
//
// 输入：[[1,2,3],[4,5,6],[7,8,9]]
//输出：[[1,4,7],[2,5,8],[3,6,9]]
// 
//
// 示例 2： 
//
// 输入：[[1,2,3],[4,5,6]]
//输出：[[1,4],[2,5],[3,6]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= A.length <= 1000 
// 1 <= A[0].length <= 1000 
// 
// Related Topics 数组 
// 👍 125 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class fdsfsdSolution {
    public int[][] transpose(int[][] A) {
        int a = A.length;
        int b = A[0].length;
        int[][] B = new int[b][a];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                B[i][j]=A[j][i];
            }
        }
        return B;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
