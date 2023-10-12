//给你一个混合字符串 s ，请你返回 s 中 第二大 的数字，如果不存在第二大的数字，请你返回 -1 。 
//
// 混合字符串 由小写英文字母和数字组成。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "dfa12321afd"
//输出：2
//解释：出现在 s 中的数字包括 [1, 2, 3] 。第二大的数字是 2 。
// 
//
// 示例 2： 
//
// 
//输入：s = "abc1111"
//输出：-1
//解释：出现在 s 中的数字只包含 [1] 。没有第二大的数字。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 500 
// s 只包含小写英文字母和（或）数字。 
// 
//
// Related Topics 哈希表 字符串 👍 60 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int secondHighest(String s) {
        int top1 = -1, top2 = -1;
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                int d = c - '0';
                if (d == top1 || d == top2) {
                    continue;
                }
                if (d > top1) {
                    top2 = top1;
                    top1 = d;
                } else if (d > top2) {
                    top2 = d;
                }
            }
        }
        return top2;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
