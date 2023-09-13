//我们定义，在以下情况时，单词的大写用法是正确的： 
//
// 
// 全部字母都是大写，比如 "USA" 。 
// 单词中所有字母都不是大写，比如 "leetcode" 。 
// 如果单词不只含有一个字母，只有首字母大写， 比如 "Google" 。 
// 
//
// 给你一个字符串 word 。如果大写用法正确，返回 true ；否则，返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//输入：word = "USA"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：word = "FlaG"
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= word.length <= 100 
// word 由小写和大写英文字母组成 
// 
//
// Related Topics 字符串 👍 250 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean detectCapitalUse(String word) {
        // 只有一个字母，怎么都对
        if (word.length() == 1) {
            return true;
        }
        boolean upperCase = Character.isUpperCase(word.charAt(0));

        if (upperCase) {
            // 首字母大写
            boolean upperCase1 = Character.isUpperCase(word.charAt(1));
            String substring = word.substring(2);
            if (upperCase1) {
                // 全大写
                return substring.toUpperCase().equals(substring);
            } else {
                // 仅首字母大写
                return substring.toLowerCase().equals(substring);
            }
        } else {
            // 全小写
            return word.toLowerCase().equals(word);
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)
