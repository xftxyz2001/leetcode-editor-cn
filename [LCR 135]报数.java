//实现一个十进制数字报数程序，请按照数字从小到大的顺序返回一个证书数列，该数列从数字 1 开始，到最大的正整数 cnt 位数字结束。 
//
// 
//
// 示例 1: 
//
// 
//输入：cnt = 2
//输出：[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28
//,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,5
//5,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,
//82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99] 
//
// Related Topics 数组 数学 👍 310 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] countNumbers(int cnt) {
        int c = (int) Math.pow(10, cnt);
        int[] ans = new int[c - 1];
        for (int i = 1; i < c; i++) {
            ans[i - 1] = i;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
