//给你一个二维整数数组 nums ，其中 nums[i] 是由 不同 正整数组成的一个非空数组，按 升序排列 返回一个数组，数组中的每个元素在 nums 所有
//数组 中都出现过。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [[3,1,2,4,5],[1,2,3,4],[3,4,5,6]]
//输出：[3,4]
//解释：
//nums[0] = [3,1,2,4,5]，nums[1] = [1,2,3,4]，nums[2] = [3,4,5,6]，在 nums 中每个数组中都出现
//的数字是 3 和 4 ，所以返回 [3,4] 。 
//
// 示例 2： 
//
// 
//输入：nums = [[1,2,3],[4,5,6]]
//输出：[]
//解释：
//不存在同时出现在 nums[0] 和 nums[1] 的整数，所以返回一个空列表 [] 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 1000 
// 1 <= sum(nums[i].length) <= 1000 
// 1 <= nums[i][j] <= 1000 
// nums[i] 中的所有值 互不相同 
// 
//
// Related Topics 数组 哈希表 计数 👍 31 👎 0


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> intersection(int[][] nums) {
        int[] hash = new int[1001];
        for (int[] arr : nums) {
            for (int num : arr) {
                hash[num]++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < hash.length; i++) {
            if (hash[i] == nums.length) {
                list.add(i);
            }
        }
        return list;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
