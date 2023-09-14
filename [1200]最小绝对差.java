//给你个整数数组 arr，其中每个元素都 不相同。 
//
// 请你找到所有具有最小绝对差的元素对，并且按升序的顺序返回。 
//
// 每对元素对 [a,b] 如下： 
//
// 
// a , b 均为数组 arr 中的元素 
// a < b 
// b - a 等于 arr 中任意两个元素的最小绝对差 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：arr = [4,2,1,3]
//输出：[[1,2],[2,3],[3,4]]
// 
//
// 示例 2： 
//
// 
//输入：arr = [1,3,6,10,15]
//输出：[[1,3]]
// 
//
// 示例 3： 
//
// 
//输入：arr = [3,8,-10,23,19,-4,-14,27]
//输出：[[-14,-10],[19,23],[23,27]]
// 
//
// 
//
// 提示： 
//
// 
// 2 <= arr.length <= 10^5 
// -10^6 <= arr[i] <= 10^6 
// 
//
// Related Topics 数组 排序 👍 146 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        // 排序
        Arrays.sort(arr);
        // int[] diff = new int[arr.length - 1];
        int minDiff = Integer.MAX_VALUE;
        // 存储结果
        LinkedList<List<Integer>> list = new LinkedList<>();
        // 遍历数组
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i] - arr[i - 1];
            // 出现新的绝对值差
            // 更小
            if (temp < minDiff) {
                minDiff = temp;
                // 清空之前存储的更大的
                list.clear();
            }
            // 相等，将本组加入
            if (temp == minDiff) {
                list.add(List.of(arr[i - 1], arr[i]));
            }
        }
        return list;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
