//给你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数。 
//
// 如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false。 
//
// 
//
// 示例 1： 
//
// 输入：arr = [1,2,2,1,1,3]
//输出：true
//解释：在该数组中，1 出现了 3 次，2 出现了 2 次，3 只出现了 1 次。没有两个数的出现次数相同。 
//
// 示例 2： 
//
// 输入：arr = [1,2]
//输出：false
// 
//
// 示例 3： 
//
// 输入：arr = [-3,0,1,-3,1,1,1,-3,10,0]
//输出：true
// 
//
// 
//
// 提示： 
//
// 
// 1 <= arr.length <= 1000 
// -1000 <= arr[i] <= 1000 
// 
//
// Related Topics 数组 哈希表 👍 201 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.Arrays;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // 计数
        int[] hash = new int[2001];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i] + 1000]++;
        }
        Arrays.sort(hash);
        int i = 0;
        for (; i < hash.length && hash[i] == 0; i++) {

        }
        for (; i < hash.length-1; i++) {
            if (hash[i] == hash[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
