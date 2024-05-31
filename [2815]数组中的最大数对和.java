//给你一个下标从 0 开始的整数数组 nums 。请你从 nums 中找出和 最大 的一对数，且这两个数数位上最大的数字相等。 
//
// 返回最大和，如果不存在满足题意的数字对，返回 -1 。 
//
// 
//
// 示例 1： 
//
// 输入：nums = [51,71,17,24,42]
//输出：88
//解释：
//i = 1 和 j = 2 ，nums[i] 和 nums[j] 数位上最大的数字相等，且这一对的总和 71 + 17 = 88 。 
//i = 3 和 j = 4 ，nums[i] 和 nums[j] 数位上最大的数字相等，且这一对的总和 24 + 42 = 66 。
//可以证明不存在其他数对满足数位上最大的数字相等，所以答案是 88 。 
//
// 示例 2： 
//
// 输入：nums = [1,2,3,4]
//输出：-1
//解释：不存在数对满足数位上最大的数字相等。
// 
//
// 
//
// 提示： 
//
// 
// 2 <= nums.length <= 100 
// 1 <= nums[i] <= 10⁴ 
// 
//
// Related Topics 数组 哈希表 👍 15 👎 0


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxSum(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int num : nums) {
            int k = getMax(num);
            if (!map.containsKey(k)) {
                map.put(k, new ArrayList<>());
            }
            map.get(k).add(num);
        }
        int max = -1;
        for (List<Integer> value : map.values()) {
            if (value.size() < 2) {
                continue;
            }
            value.sort((o1, o2) -> o2 - o1);
            int tmp = value.get(0) + value.get(1);
            if (tmp > max) {
                max = tmp;
            }
        }
        return max;
    }

    public int getMax(int i) {
        int max = 0;
        while (i != 0) {
            int d = i % 10;
            if (d > max) {
                max = d;
            }
            i /= 10;
        }
        return max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
