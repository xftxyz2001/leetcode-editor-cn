//给定一个整数 num，将其转化为 7 进制，并以字符串形式输出。 
//
// 
//
// 示例 1: 
//
// 
//输入: num = 100
//输出: "202"
// 
//
// 示例 2: 
//
// 
//输入: num = -7
//输出: "-10"
// 
//
// 
//
// 提示： 
//
// 
// -10⁷ <= num <= 10⁷ 
// 
//
// Related Topics 数学 👍 209 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String convertToBase7(int num) {
        return Integer.toString(num, 7);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
