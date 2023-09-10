//给你一个整数数组 nums ，其中总是存在 唯一的 一个最大整数 。 
//
// 请你找出数组中的最大元素并检查它是否 至少是数组中每个其他数字的两倍 。如果是，则返回 最大元素的下标 ，否则返回 -1 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [3,6,1,0]
//输出：1
//解释：6 是最大的整数，对于数组中的其他整数，6 至少是数组中其他元素的两倍。6 的下标是 1 ，所以返回 1 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,2,3,4]
//输出：-1
//解释：4 没有超过 3 的两倍大，所以返回 -1 。 
//
// 示例 3： 
//
// 
//输入：nums = [1]
//输出：0
//解释：因为不存在其他数字，所以认为现有数字 1 至少是其他数字的两倍。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 50 
// 0 <= nums[i] <= 100 
// nums 中的最大元素是唯一的 
// 
//
// Related Topics 数组 排序 👍 200 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.Arrays;

class Solution {
    public int dominantIndex(int[] nums) {
        // 唯一的数字一定是最大的
        if (nums.length == 1) {
            return 0;
        }
        // 排序
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);
        // 如果最大的数字大于等于第二大的数字的两倍
        if (copy[copy.length - 1] >= copy[copy.length - 2] * 2) {
            int max = copy[copy.length - 1];
            // 返回最大数字的下标
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == max) {
                    return i;
                }
            }
        }
        // 否则返回-1
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
