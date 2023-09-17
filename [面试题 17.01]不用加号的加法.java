//设计一个函数把两个数字相加。不得使用 + 或者其他算术运算符。 
//
// 示例: 
//
// 输入: a = 1, b = 1
//输出: 2 
//
// 
//
// 提示： 
//
// 
// a, b 均可能是负数或 0 
// 结果不会溢出 32 位整数 
// 
//
// Related Topics 位运算 数学 👍 95 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int add(int a, int b) {
        int xor = a ^ b;
        int and = a & b;
        return and == 0 ? xor : add(xor, and << 1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
