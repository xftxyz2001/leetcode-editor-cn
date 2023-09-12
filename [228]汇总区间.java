//给定一个 无重复元素 的 有序 整数数组 nums 。 
//
// 返回 恰好覆盖数组中所有数字 的 最小有序 区间范围列表 。也就是说，nums 的每个元素都恰好被某个区间范围所覆盖，并且不存在属于某个范围但不属于 
//nums 的数字 x 。 
//
// 列表中的每个区间范围 [a,b] 应该按如下格式输出： 
//
// 
// "a->b" ，如果 a != b 
// "a" ，如果 a == b 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [0,1,2,4,5,7]
//输出：["0->2","4->5","7"]
//解释：区间范围是：
//[0,2] --> "0->2"
//[4,5] --> "4->5"
//[7,7] --> "7"
// 
//
// 示例 2： 
//
// 
//输入：nums = [0,2,3,4,6,8,9]
//输出：["0","2->4","6","8->9"]
//解释：区间范围是：
//[0,0] --> "0"
//[2,4] --> "2->4"
//[6,6] --> "6"
//[8,9] --> "8->9"
// 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 20 
// -2³¹ <= nums[i] <= 2³¹ - 1 
// nums 中的所有值都 互不相同 
// nums 按升序排列 
// 
//
// Related Topics 数组 👍 345 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        // 特殊情况
        if (nums.length == 0) {
            return List.of();
        }
        if (nums.length == 1) {
            return List.of(String.valueOf(nums[0]));
        }
        // 保存结果
        ArrayList<String> res = new ArrayList<>();
        // 保存区间
        int l = Integer.MIN_VALUE, r = Integer.MIN_VALUE;
        boolean flag = true;
        // 遍历数组
        for (int i = 0; i < nums.length; i++) {
            // 初始化区间边界
            if (flag) {
                r = l = nums[i];
                flag = false;
                continue;
            }
            // 更新区间右边界
            if (r + 1 == nums[i]) {
                r++;
                continue;
            }
            // 区间结束
            // 判断区间是否为单个元素
            if (l != r) {
                res.add(l + "->" + r);
            } else {
                res.add(String.valueOf(l));
            }
            // 重置区间
            r = l = nums[i];
        }
        // 最后一个区间
        if (l != r) {
            res.add(l + "->" + r);
        } else {
            res.add(String.valueOf(l));
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
