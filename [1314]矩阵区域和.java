//给你一个 m x n 的矩阵 mat 和一个整数 k ，请你返回一个矩阵 answer ，其中每个 answer[i][j] 是所有满足下述条件的元素 
//mat[r][c] 的和： 
//
// 
// i - k <= r <= i + k, 
// j - k <= c <= j + k 且 
// (r, c) 在矩阵内。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：mat = [[1,2,3],[4,5,6],[7,8,9]], k = 1
//输出：[[12,21,16],[27,45,33],[24,39,28]]
// 
//
// 示例 2： 
//
// 
//输入：mat = [[1,2,3],[4,5,6],[7,8,9]], k = 2
//输出：[[45,45,45],[45,45,45],[45,45,45]]
// 
//
// 
//
// 提示： 
//
// 
// m == mat.length 
// n == mat[i].length 
// 1 <= m, n, k <= 100 
// 1 <= mat[i][j] <= 100 
// 
//
// Related Topics 数组 矩阵 前缀和 👍 198 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int[][] ans = new int[mat.length][mat[0].length];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j] = getSum(mat, i - k, j - k, i + k, j + k);
            }
        }
        return ans;
    }

    private int getSum(int[][] mat, int r0, int c0, int r1, int c1) {
        int sum = 0;
        if (r0 < 0) {
            r0 = 0;
        }
        if (c0 < 0) {
            c0 = 0;
        }
        if (r1 >= mat.length) {
            r1 = mat.length - 1;
        }
        if (c1 >= mat[0].length) {
            c1 = mat[0].length - 1;
        }
        for (int i = r0; i <= r1; i++) {
            for (int j = c0; j <= c1; j++) {
                sum += mat[i][j];
            }
        }
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
