//给你一个整数数组 nums 。请你创建一个满足以下条件的二维数组： 
//
// 
// 二维数组应该 只 包含数组 nums 中的元素。 
// 二维数组中的每一行都包含 不同 的整数。 
// 二维数组的行数应尽可能 少 。 
// 
//
// 返回结果数组。如果存在多种答案，则返回其中任何一种。 
//
// 请注意，二维数组的每一行上可以存在不同数量的元素。 
//
// 
//
// 示例 1： 
//
// 输入：nums = [1,3,4,1,2,3,1]
//输出：[[1,3,4,2],[1,3],[1]]
//解释：根据题目要求可以创建包含以下几行元素的二维数组：
//- 1,3,4,2
//- 1,3
//- 1
//nums 中的所有元素都有用到，并且每一行都由不同的整数组成，所以这是一个符合题目要求的答案。
//可以证明无法创建少于三行且符合题目要求的二维数组。 
//
// 示例 2： 
//
// 输入：nums = [1,2,3,4]
//输出：[[4,3,2,1]]
//解释：nums 中的所有元素都不同，所以我们可以将其全部保存在二维数组中的第一行。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 200 
// 1 <= nums[i] <= nums.length 
// 
//
// Related Topics 数组 哈希表 👍 11 👎 0


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        // 记录每个数字出现的次数
        // int[] hash = new int[nums.length];
        int[] hash = new int[nums.length + 1];
        // 出现次数最多的数字出现的次数
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            // if (++hash[nums[i] - 1] > max) {
            // max = hash[nums[i] - 1];
            // }
            if (++hash[nums[i]] > max) {
                max = hash[nums[i]];
            }
        }

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < max; i++) {
            List<Integer> grp = new ArrayList<>();
            for (int j = 0; j < hash.length; j++) {
                if (hash[j] > 0) {
                    // grp.add(j + 1);
                    grp.add(j);
                    hash[j]--;
                }
            }
            res.add(grp);
        }

        return res;
    }

    // 简洁的题解
    public List<List<Integer>> findMatrix0(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, Integer> cnts = new HashMap<>();
        for (int num : nums) {
            // num 第 idx + 1 次出现
            int idx = cnts.getOrDefault(num, 0);
            cnts.put(num, idx + 1);
            if (res.size() <= idx) {
                // 需要用新的列来装 num
                res.add(new ArrayList<>());
            }
            res.get(idx).add(num);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
