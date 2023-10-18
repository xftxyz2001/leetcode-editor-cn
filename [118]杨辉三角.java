//给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。 
//
// 在「杨辉三角」中，每个数是它左上方和右上方的数的和。 
//
// 
//
// 
//
// 示例 1: 
//
// 
//输入: numRows = 5
//输出: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// 
//
// 示例 2: 
//
// 
//输入: numRows = 1
//输出: [[1]]
// 
//
// 
//
// 提示: 
//
// 
// 1 <= numRows <= 30 
// 
//
// Related Topics 数组 动态规划 👍 1060 👎 0


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(1));
        for (int i = 1; i < numRows; i++) {
            List<Integer> lastRow = list.get(i - 1);
            ArrayList<Integer> newRow = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                System.out.println("i = " + i + " ,j = " + j);
                if (j == 0 || j == i) {
                    newRow.add(1);
                } else {
                    newRow.add(lastRow.get(j - 1) + lastRow.get(j));
                }
            }
            list.add(newRow);
        }
        return list;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
