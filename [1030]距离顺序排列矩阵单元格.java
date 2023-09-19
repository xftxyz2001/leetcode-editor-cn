//给定四个整数 rows , cols , rCenter 和 cCenter 。有一个 rows x cols 的矩阵，你在单元格上的坐标是 (
//rCenter, cCenter) 。 
//
// 返回矩阵中的所有单元格的坐标，并按与 (rCenter, cCenter) 的 距离 从最小到最大的顺序排。你可以按 任何 满足此条件的顺序返回答案。 
//
// 单元格(r1, c1) 和 (r2, c2) 之间的距离为|r1 - r2| + |c1 - c2|。 
//
// 
//
// 示例 1： 
//
// 
//输入：rows = 1, cols = 2, rCenter = 0, cCenter = 0
//输出：[[0,0],[0,1]]
//解释：从 (r0, c0) 到其他单元格的距离为：[0,1]
// 
//
// 示例 2： 
//
// 
//输入：rows = 2, cols = 2, rCenter = 0, cCenter = 1
//输出：[[0,1],[0,0],[1,1],[1,0]]
//解释：从 (r0, c0) 到其他单元格的距离为：[0,1,1,2]
//[[0,1],[1,1],[0,0],[1,0]] 也会被视作正确答案。
// 
//
// 示例 3： 
//
// 
//输入：rows = 2, cols = 3, rCenter = 1, cCenter = 2
//输出：[[1,2],[0,2],[1,1],[0,1],[1,0],[0,0]]
//解释：从 (r0, c0) 到其他单元格的距离为：[0,1,1,2,2,3]
//其他满足题目要求的答案也会被视为正确，例如 [[1,2],[1,1],[0,2],[1,0],[0,1],[0,0]]。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= rows, cols <= 100 
// 0 <= rCenter < rows 
// 0 <= cCenter < cols 
// 
//
// Related Topics 几何 数组 数学 矩阵 排序 👍 148 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.Arrays;

class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] arr = new int[rows * cols][2];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[index][0] = i;
                arr[index][1] = j;
                index++;
            }
        }
        Arrays.sort(arr, (o1, o2) -> {
            int d1 = Math.abs(o1[0] - rCenter) + Math.abs(o1[1] - cCenter);
            int d2 = Math.abs(o2[0] - rCenter) + Math.abs(o2[1] - cCenter);
            return d1 - d2;
        });
        return arr;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
