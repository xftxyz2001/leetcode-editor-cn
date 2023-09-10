//给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否
//则返回 -1。 
//
// 示例 1: 
//
// 输入: nums = [-1,0,3,5,9,12], target = 9
//输出: 4
//解释: 9 出现在 nums 中并且下标为 4
// 
//
// 示例 2: 
//
// 输入: nums = [-1,0,3,5,9,12], target = 2
//输出: -1
//解释: 2 不存在 nums 中因此返回 -1
// 
//
// 
//
// 提示： 
//
// 
// 你可以假设 nums 中的所有元素是不重复的。 
// n 将在 [1, 10000]之间。 
// nums 的每个元素都将在 [-9999, 9999]之间。 
// 
//
// Related Topics 数组 二分查找 👍 1436 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.Arrays;

class Solution {
            
    // 我直接进行一个库函数的调
    public int search0(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
        return index < 0 ? -1 : index;
    }

    // 我直接将库函数复制过来
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = nums[mid];
            if (midVal < target)
                low = mid + 1;
            else if (midVal > target)
                high = mid - 1;
            else
                return mid;
        }
        // return -(low + 1);
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
