//给你一个正整数数组 nums 。 
//
// 
// 元素和 是 nums 中的所有元素相加求和。 
// 数字和 是 nums 中每一个元素的每一数位（重复数位需多次求和）相加求和。 
// 
//
// 返回 元素和 与 数字和 的绝对差。 
//
// 注意：两个整数 x 和 y 的绝对差定义为 |x - y| 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,15,6,3]
//输出：9
//解释：
//nums 的元素和是 1 + 15 + 6 + 3 = 25 。
//nums 的数字和是 1 + 1 + 5 + 6 + 3 = 16 。
//元素和与数字和的绝对差是 |25 - 16| = 9 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,2,3,4]
//输出：0
//解释：
//nums 的元素和是 1 + 2 + 3 + 4 = 10 。
//nums 的数字和是 1 + 2 + 3 + 4 = 10 。
//元素和与数字和的绝对差是 |10 - 10| = 0 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 2000 
// 1 <= nums[i] <= 2000 
// 
//
// Related Topics 数组 数学 👍 12 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    // 1 <= nums[i] <= 2000
    public int differenceOfSum(int[] nums) {
        int res = 0;
        for (int i : nums) {
            if (i < 10) {
                continue;
            }
            // res += i - sum(i);
            // res += i - (i % 10 + i / 10 % 10 + i / 100 % 10 + i / 1000 % 10);
            res += i - i % 10 - i / 10 % 10 - i / 100 % 10 - i / 1000 % 10;
        }
        // for (int i = 0; i < nums.length; i++) {
        // res += nums[i] - nums[i] % 10 - nums[i] / 10 % 10 - nums[i] / 100 % 10 -
        // nums[i] / 1000 % 10;
        // }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
