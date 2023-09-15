//给你一个整数数组 arr，请你检查是否存在两个整数 N 和 M，满足 N 是 M 的两倍（即，N = 2 * M）。 
//
// 更正式地，检查是否存在两个下标 i 和 j 满足： 
//
// 
// i != j 
// 0 <= i, j < arr.length 
// arr[i] == 2 * arr[j] 
// 
//
// 
//
// 示例 1： 
//
// 输入：arr = [10,2,5,3]
//输出：true
//解释：N = 10 是 M = 5 的两倍，即 10 = 2 * 5 。
// 
//
// 示例 2： 
//
// 输入：arr = [7,1,14,11]
//输出：true
//解释：N = 14 是 M = 7 的两倍，即 14 = 2 * 7 。
// 
//
// 示例 3： 
//
// 输入：arr = [3,1,7,11]
//输出：false
//解释：在该情况下不存在 N 和 M 满足 N = 2 * M 。
// 
//
// 
//
// 提示： 
//
// 
// 2 <= arr.length <= 500 
// -10^3 <= arr[i] <= 10^3 
// 
//
// Related Topics 数组 哈希表 双指针 二分查找 排序 👍 102 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.Arrays;

class Solution {
    public boolean checkIfExist(int[] arr) {
        // 排序
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        // for (int i : arr) {
        //     if (Arrays.binarySearch(arr, i * 2) >= 0) {
        //         System.out.println(i);
        //         return true;
        //     }
        // }
        for (int i = 0; i < arr.length; i++) {
            // 两倍
            int doubleNum = arr[i] * 2;
            // 如果两倍的数比最大的数还大，那么就不用再找了
            if (doubleNum > arr[arr.length - 1]) {
                break;
            }
            // 二分查找
            int index = Arrays.binarySearch(arr, doubleNum);
            // 如果找到了，而且不是自己
            if (index >= 0 && index != i) {
                return true;
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
