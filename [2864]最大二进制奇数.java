//给你一个 二进制 字符串 s ，其中至少包含一个 '1' 。 
//
// 你必须按某种方式 重新排列 字符串中的位，使得到的二进制数字是可以由该组合生成的 最大二进制奇数 。 
//
// 以字符串形式，表示并返回可以由给定组合生成的最大二进制奇数。 
//
// 注意 返回的结果字符串 可以 含前导零。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "010"
//输出："001"
//解释：因为字符串 s 中仅有一个 '1' ，其必须出现在最后一位上。所以答案是 "001" 。
// 
//
// 示例 2： 
//
// 
//输入：s = "0101"
//输出："1001"
//解释：其中一个 '1' 必须出现在最后一位上。而由剩下的数字可以生产的最大数字是 "100" 。所以答案是 "1001" 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 100 
// s 仅由 '0' 和 '1' 组成 
// s 中至少包含一个 '1' 
// 
//
// Related Topics 贪心 数学 字符串 👍 2 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String maximumOddBinaryNumber(String s) {
        int one = -1;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                one++;
            }
        }
        char[] chars = new char[s.length()];
        int i = 0;
        for (i = 0; i < one; i++) {
            chars[i] = '1';
        }
        for (; i < chars.length - 1; i++) {
            chars[i] = '0';
        }
        chars[chars.length - 1] = '1';
        return String.valueOf(chars);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
