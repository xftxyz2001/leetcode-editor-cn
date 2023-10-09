//给你两个字符串数组 word1 和 word2 。如果两个数组表示的字符串相同，返回 true ；否则，返回 false 。 
//
// 数组表示的字符串 是由数组中的所有元素 按顺序 连接形成的字符串。 
//
// 
//
// 示例 1： 
//
// 
//输入：word1 = ["ab", "c"], word2 = ["a", "bc"]
//输出：true
//解释：
//word1 表示的字符串为 "ab" + "c" -> "abc"
//word2 表示的字符串为 "a" + "bc" -> "abc"
//两个字符串相同，返回 true 
//
// 示例 2： 
//
// 
//输入：word1 = ["a", "cb"], word2 = ["ab", "c"]
//输出：false
// 
//
// 示例 3： 
//
// 
//输入：word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
//输出：true
// 
//
// 
//
// 提示： 
//
// 
// 1 <= word1.length, word2.length <= 10³ 
// 1 <= word1[i].length, word2[i].length <= 10³ 
// 1 <= sum(word1[i].length), sum(word2[i].length) <= 10³ 
// word1[i] 和 word2[i] 由小写字母组成 
// 
//
// Related Topics 数组 字符串 👍 95 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean arrayStringsAreEqual1(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        for (String s : word1) {
            sb1.append(s);
        }
        StringBuilder sb2 = new StringBuilder();
        for (String s : word2) {
            sb2.append(s);
        }
        return sb1.toString().equals(sb2.toString());
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int w1i = 0, w1j = 0, w2i = 0, w2j = 0;
        while (w1i < word1.length && w2i < word2.length) {
            if (word1[w1i].charAt(w1j) != word2[w2i].charAt(w2j)) {
                return false;
            }
            w1j++;
            w2j++;
            if (w1j == word1[w1i].length()) {
                w1i++;
                w1j = 0;
            }
            if (w2j == word2[w2i].length()) {
                w2i++;
                w2j = 0;
            }
        }
        return w1i == word1.length && w2i == word2.length;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
