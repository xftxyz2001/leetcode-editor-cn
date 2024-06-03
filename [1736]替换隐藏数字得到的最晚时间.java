//给你一个字符串 time ，格式为 hh:mm（小时：分钟），其中某几位数字被隐藏（用 ? 表示）。 
//
// 有效的时间为 00:00 到 23:59 之间的所有时间，包括 00:00 和 23:59 。 
//
// 替换 time 中隐藏的数字，返回你可以得到的最晚有效时间。 
//
// 
//
// 示例 1： 
//
// 
//输入：time = "2?:?0"
//输出："23:50"
//解释：以数字 '2' 开头的最晚一小时是 23 ，以 '0' 结尾的最晚一分钟是 50 。
// 
//
// 示例 2： 
//
// 
//输入：time = "0?:3?"
//输出："09:39"
// 
//
// 示例 3： 
//
// 
//输入：time = "1?:22"
//输出："19:22"
// 
//
// 
//
// 提示： 
//
// 
// time 的格式为 hh:mm 
// 题目数据保证你可以由输入的字符串生成有效的时间 
// 
//
// Related Topics 贪心 字符串 👍 77 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String maximumTime(String time) {
        int h1 = time.charAt(0) == '?' ? -1 : time.charAt(0) - '0';
        int h2 = time.charAt(1) == '?' ? -1 : time.charAt(1) - '0';
        int m1 = time.charAt(3) == '?' ? -1 : time.charAt(3) - '0';
        int m2 = time.charAt(4) == '?' ? -1 : time.charAt(4) - '0';

        if (h1 == -1) {
            if (h2 <= 3) { // 20 21 22 23
                h1 = 2;
            } else {
                h1 = 1;
            }
        }
        if (h2 == -1) {
            if (h1 == 2) { // 23
                h2 = 3;
            } else {
                h2 = 9;
            }
        }

        if (m1 == -1) {
            m1 = 5;
        }
        if (m2 == -1) {
            m2 = 9;
        }
        return String.format("%d%d:%d%d", h1, h2, m1, m2);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
