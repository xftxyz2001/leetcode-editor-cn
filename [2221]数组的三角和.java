//给你一个下标从 0 开始的整数数组 nums ，其中 nums[i] 是 0 到 9 之间（两者都包含）的一个数字。 
//
// nums 的 三角和 是执行以下操作以后最后剩下元素的值： 
//
// 
// nums 初始包含 n 个元素。如果 n == 1 ，终止 操作。否则，创建 一个新的下标从 0 开始的长度为 n - 1 的整数数组 newNums 。
// 
// 对于满足 0 <= i < n - 1 的下标 i ，newNums[i] 赋值 为 (nums[i] + nums[i+1]) % 10 ，% 表示取余
//运算。 
// 将 newNums 替换 数组 nums 。 
// 从步骤 1 开始 重复 整个过程。 
// 
//
// 请你返回 nums 的三角和。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：nums = [1,2,3,4,5]
//输出：8
//解释：
//上图展示了得到数组三角和的过程。 
//
// 示例 2： 
//
// 
//输入：nums = [5]
//输出：5
//解释：
//由于 nums 中只有一个元素，数组的三角和为这个元素自己。 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 1000 
// 0 <= nums[i] <= 9 
// 
//
// Related Topics 数组 数学 组合数学 模拟 👍 18 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        while (n > 1) {
            for (int i = 1; i < n; i++) {
                nums[i - 1] = (nums[i - 1] + nums[i]) % 10;
            }
            n--;
        }
        return nums[0];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
