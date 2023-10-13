//某种外星语也使用英文小写字母，但可能顺序 order 不同。字母表的顺序（order）是一些小写字母的排列。 
//
// 给定一组用外星语书写的单词 words，以及其字母表的顺序 order，只有当给定的单词在这种外星语中按字典序排列时，返回 true；否则，返回 
//false。 
//
// 
//
// 示例 1： 
//
// 
//输入：words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
//输出：true
//解释：在该语言的字母表中，'h' 位于 'l' 之前，所以单词序列是按字典序排列的。 
//
// 示例 2： 
//
// 
//输入：words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
//输出：false
//解释：在该语言的字母表中，'d' 位于 'l' 之后，那么 words[0] > words[1]，因此单词序列不是按字典序排列的。 
//
// 示例 3： 
//
// 
//输入：words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
//输出：false
//解释：当前三个字符 "app" 匹配时，第二个字符串相对短一些，然后根据词典编纂规则 "apple" > "app"，因为 'l' > '∅'，其中 '∅
//' 是空白字符，定义为比任何其他字符都小（更多信息）。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= words.length <= 100 
// 1 <= words[i].length <= 20 
// order.length == 26 
// 在 words[i] 和 order 中的所有字符都是英文小写字母。 
// 
//
// Related Topics 数组 哈希表 字符串 👍 251 👎 0


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        char[] orderCharArray = order.toCharArray();
        int[] orderArr = new int[26];
        for (int i = 0; i < orderCharArray.length; i++) {
            orderArr[orderCharArray[i] - 'a'] = i + 1;
        }
        // System.out.println(Arrays.toString(orderArr));
        int[] last = new int[20]; // 1 <= words[i].length <= 20
        for (String word : words) { // 遍历所有单词
            char[] wordCharArray = word.toCharArray(); // 单词的字母数组
            int i = 0;
            // System.out.println(Arrays.toString(last));
            boolean isLarge = false; // 不能认为比上一个大
            while (i < wordCharArray.length) {
                int charOrder = orderArr[wordCharArray[i] - 'a']; // 获得这个单词下一个字母的位次
                if (charOrder != last[i]) { // 如果和上一个单词的该位置的字母位次不同
                    if (!isLarge) { // 新的字母不能确定比上一个单词的该位次的字母大
                        if (charOrder < last[i]) { // 如果小
                            return false;
                        } else { // 如果大
                            isLarge = true; // 标注该单词大
                        }
                    }
                    last[i] = charOrder; // 记录新的单词的对应位次
                }
                i++; // 取下一个字母
            }
            if (!isLarge && i < last.length && last[i] > 0) { // 如果后面的单词更短，且不必前面的大
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
