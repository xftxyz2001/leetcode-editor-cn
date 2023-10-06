//给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和并同样以字符串形式返回。 
//
// 你不能使用任何內建的用于处理大整数的库（比如 BigInteger）， 也不能直接将输入的字符串转换为整数形式。 
//
// 
//
// 示例 1： 
//
// 
//输入：num1 = "11", num2 = "123"
//输出："134"
// 
//
// 示例 2： 
//
// 
//输入：num1 = "456", num2 = "77"
//输出："533"
// 
//
// 示例 3： 
//
// 
//输入：num1 = "0", num2 = "0"
//输出："0"
// 
//
// 
//
// 
//
// 提示： 
//
// 
// 1 <= num1.length, num2.length <= 10⁴ 
// num1 和num2 都只包含数字 0-9 
// num1 和num2 都不包含任何前导零 
// 
//
// Related Topics 数学 字符串 模拟 👍 794 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addStrings(String num1, String num2) {
        char[] c1 = num1.toCharArray();
        char[] c2 = num2.toCharArray();
        int a = 0;
        int i1 = c1.length - 1, i2 = c2.length - 1;
        StringBuilder sb = new StringBuilder();
        while (i1 >= 0 && i2 >= 0) {
            int sum = (c1[i1] - '0') + (c2[i2] - '0') + a;
            a = sum / 10;
            sum %= 10;
            sb.append(sum);
            i1--;
            i2--;
        }
        while (i1 >= 0) {
            int sum = (c1[i1] - '0') + a;
            a = sum / 10;
            sum %= 10;
            sb.append(sum);
            i1--;
        }
        while (i2 >= 0) {
            int sum = (c2[i2] - '0') + a;
            a = sum / 10;
            sum %= 10;
            sb.append(sum);
            i2--;
        }
        if (a != 0) {
            sb.append(a);
        }
        return sb.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
