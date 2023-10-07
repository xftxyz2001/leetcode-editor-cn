//统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。 
//
// 请注意，你可以假定字符串里不包括任何不可打印的字符。 
//
// 示例: 
//
// 输入: "Hello, my name is John"
//输出: 5
//解释: 这里的单词是指连续的不是空格的字符，所以 "Hello," 算作 1 个单词。
// 
//
// Related Topics 字符串 👍 217 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countSegments(String s) {
        if (s.length() == 0) {
            return 0;
        }
        boolean flag = false;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                if (flag) { // 之前是个字母
                    count++;
                }
                flag = false;
            } else {
                flag = true;
            }
        }
        return count + (s.charAt(s.length() - 1) != ' ' ? 1 : 0);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
