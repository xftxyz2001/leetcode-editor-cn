//如果数组是单调递增或单调递减的，那么它是 单调 的。 
//
// 如果对于所有 i <= j，nums[i] <= nums[j]，那么数组 nums 是单调递增的。 如果对于所有 i <= j，nums[i]> = 
//nums[j]，那么数组 nums 是单调递减的。 
//
// 当给定的数组 nums 是单调数组时返回 true，否则返回 false。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,2,3]
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：nums = [6,5,4,4]
//输出：true
// 
//
// 示例 3： 
//
// 
//输入：nums = [1,3,2]
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁵ 
// -10⁵ <= nums[i] <= 10⁵ 
// 
//
// Related Topics 数组 👍 198 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums.length < 3) {
            return true;
        }
        int flag = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                if (flag < 0) {
                    return false;
                }
                flag = 1;
            } else if (nums[i] < nums[i - 1]) {
                if (flag > 0) {
                    return false;
                }
                flag = -1;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
