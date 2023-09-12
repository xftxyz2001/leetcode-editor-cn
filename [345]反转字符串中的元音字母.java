//给你一个字符串 s ，仅反转字符串中的所有元音字母，并返回结果字符串。 
//
// 元音字母包括 'a'、'e'、'i'、'o'、'u'，且可能以大小写两种形式出现不止一次。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "hello"
//输出："holle"
// 
//
// 示例 2： 
//
// 
//输入：s = "leetcode"
//输出："leotcede" 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 3 * 10⁵ 
// s 由 可打印的 ASCII 字符组成 
// 
//
// Related Topics 双指针 字符串 👍 326 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseVowels(String s) {
        char[] sArr = s.toCharArray();
        int left = 0, right = sArr.length - 1;
        while (left < right) {
            while (left < right && !isVowel(sArr[left])) {
                left++;
            }
            while (left < right && !isVowel(sArr[right])) {
                right--;
            }
            if (left < right) {
                char temp = sArr[left];
                sArr[left] = sArr[right];
                sArr[right] = temp;
                left++;
                right--;
            }
        }
        return String.valueOf(sArr);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'A' ||
                c == 'e' || c == 'E' ||
                c == 'i' || c == 'I' ||
                c == 'o' || c == 'O' ||
                c == 'u' || c == 'U';
        // return "aeiouAEIOU".indexOf(c) != -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
