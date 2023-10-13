//给定两个字符串, s 和 goal。如果在若干次旋转操作之后，s 能变成 goal ，那么返回 true 。 
//
// s 的 旋转操作 就是将 s 最左边的字符移动到最右边。 
//
// 
// 例如, 若 s = 'abcde'，在旋转一次之后结果就是'bcdea' 。 
// 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "abcde", goal = "cdeab"
//输出: true
// 
//
// 示例 2: 
//
// 
//输入: s = "abcde", goal = "abced"
//输出: false
// 
//
// 
//
// 提示: 
//
// 
// 1 <= s.length, goal.length <= 100 
// s 和 goal 由小写英文字母组成 
// 
//
// Related Topics 字符串 字符串匹配 👍 299 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        char[] sArr = s.toCharArray();
        char[] gArr = goal.toCharArray();
        int index = 0;
        while (index < sArr.length) {
            if (sArr[index] == gArr[0]) { // s的第index个字母匹配goal的首字母
                boolean flag = true;
                int idx = index;
                for (int i = 0; i < gArr.length; i++) {
                    if (sArr[idx] != gArr[i]) {
                        flag = false;
                        break;
                    }
                    idx = (idx + 1) % sArr.length;
                }
                if (flag) {
                    return true;
                }
            }
            index++;
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
