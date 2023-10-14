//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 
//
// 示例 1： 
//
// 
//输入：strs = ["flower","flow","flight"]
//输出："fl"
// 
//
// 示例 2： 
//
// 
//输入：strs = ["dog","racecar","car"]
//输出：""
//解释：输入不存在公共前缀。 
//
// 
//
// 提示： 
//
// 
// 1 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] 仅由小写英文字母组成 
// 
//
// Related Topics 字典树 字符串 👍 2952 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        char[] charArray = strs[0].toCharArray();
        int len = 0;
        // int fin = 0;
        l:
        while (len < charArray.length) {
            // fin = 1;
            for (String str : strs) {
                if (len >= str.length() || str.charAt(len) != charArray[len]) {
                    break l;
                }
            }
            // fin = 0;
            len++;
        }
        // return String.valueOf(charArray, 0, len + fin);
        return String.valueOf(charArray, 0, len);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
