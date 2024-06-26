//给你两个只包含 1 到 9 之间数字的数组 nums1 和 nums2 ，每个数组中的元素 互不相同 ，请你返回 最小 的数字，两个数组都 至少 包含这个数
//字的某个数位。
//
// 
//
// 示例 1： 
//
// 输入：nums1 = [4,1,3], nums2 = [5,7]
//输出：15
//解释：数字 15 的数位 1 在 nums1 中出现，数位 5 在 nums2 中出现。15 是我们能得到的最小数字。
// 
//
// 示例 2： 
//
// 输入：nums1 = [3,5,2,6], nums2 = [3,1,7]
//输出：3
//解释：数字 3 的数位 3 在两个数组中都出现了。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums1.length, nums2.length <= 9 
// 1 <= nums1[i], nums2[i] <= 9 
// 每个数组中，元素 互不相同 。 
// 
//
// Related Topics 数组 哈希表 枚举 👍 95 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int[] hash1 = new int[10];
        int[] hash2 = new int[10];
        for (int num : nums1) {
            hash1[num]++;
        }
        for (int num : nums2) {
            hash2[num]++;
        }
        // 存在相同的数字？
        for (int i = 1; i < 10; i++) {
            if (hash1[i] > 0 && hash2[i] > 0) {
                return i;
            }
        }
        int i = 0;
        while (hash1[i] == 0) {
            i++;
        }
        int j = 0;
        while (hash2[j] == 0) {
            j++;
        }
        return i < j ? i * 10 + j : j * 10 + i;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
