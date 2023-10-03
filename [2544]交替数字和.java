//给你一个正整数 n 。n 中的每一位数字都会按下述规则分配一个符号： 
//
// 
// 最高有效位 上的数字分配到 正 号。 
// 剩余每位上数字的符号都与其相邻数字相反。 
// 
//
// 返回所有数字及其对应符号的和。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 521
//输出：4
//解释：(+5) + (-2) + (+1) = 4 
//
// 示例 2： 
//
// 
//输入：n = 111
//输出：1
//解释：(+1) + (-1) + (+1) = 1
// 
//
// 示例 3： 
//
// 
//输入：n = 886996
//输出：0
//解释：(+8) + (-8) + (+6) + (-9) + (+9) + (-6) = 0
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 10⁹ 
// 
//
// 
//
// Related Topics 数学 👍 51 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int alternateDigitSum(int n) {
        String s = Integer.toString(n);
        int sum = 0;
        int flag = 1;
        for (char c : s.toCharArray()) {
            sum += (c - '0') * flag;
//            flag *= -1;
            flag = -flag;
        }
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
