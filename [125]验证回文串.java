//如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，短语正着读和反着读都一样。则可以认为该短语是一个 回文串 。 
//
// 字母和数字都属于字母数字字符。 
//
// 给你一个字符串 s，如果它是 回文串 ，返回 true ；否则，返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//输入: s = "A man, a plan, a canal: Panama"
//输出：true
//解释："amanaplanacanalpanama" 是回文串。
// 
//
// 示例 2： 
//
// 
//输入：s = "race a car"
//输出：false
//解释："raceacar" 不是回文串。
// 
//
// 示例 3： 
//
// 
//输入：s = " "
//输出：true
//解释：在移除非字母数字字符之后，s 是一个空字符串 "" 。
//由于空字符串正着反着读都一样，所以是回文串。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 2 * 10⁵ 
// s 仅由可打印的 ASCII 字符组成 
// 
//
// Related Topics 双指针 字符串 👍 686 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    /*执行耗时:22 ms,击败了11.66% 的Java用户
    内存消耗:42.6 MB,击败了33.87% 的Java用户*/
     public boolean isPalindrome0(String s) {
         // 正则替换掉非字母数字字符
         String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
         // 反转后看是否相同
         return str.equals(new StringBuilder(str).reverse().toString());
     }
    /*执行耗时:2 ms,击败了95.65% 的Java用户
    内存消耗:41 MB,击败了66.41% 的Java用户*/
    public boolean isPalindrome(String s) {
        char[] charArray = s.toCharArray();
        int left = 0, right = charArray.length - 1;
        while (left < right) {
            // 左边找一个字母数字字符
            while (left < right && !Character.isLetterOrDigit(charArray[left])) {
                left++;
            }
            // 右边找一个字母数字字符
            while (left < right && !Character.isLetterOrDigit(charArray[right])) {
                right--;
            }
            // 不相等则返回false
            if (Character.toLowerCase(charArray[left]) != Character.toLowerCase(charArray[right])) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
