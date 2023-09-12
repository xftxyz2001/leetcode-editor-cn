//给定一种规律 pattern 和一个字符串 s ，判断 s 是否遵循相同的规律。 
//
// 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 s 中的每个非空单词之间存在着双向连接的对应规律。 
//
// 
//
// 示例1: 
//
// 
//输入: pattern = "abba", s = "dog cat cat dog"
//输出: true 
//
// 示例 2: 
//
// 
//输入:pattern = "abba", s = "dog cat cat fish"
//输出: false 
//
// 示例 3: 
//
// 
//输入: pattern = "aaaa", s = "dog cat cat dog"
//输出: false 
//
// 
//
// 提示: 
//
// 
// 1 <= pattern.length <= 300 
// pattern 只包含小写英文字母 
// 1 <= s.length <= 3000 
// s 只包含小写英文字母和 ' ' 
// s 不包含 任何前导或尾随对空格 
// s 中每个单词都被 单个空格 分隔 
// 
//
// Related Topics 哈希表 字符串 👍 600 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        // 分词
        String[] splited = s.split(" ");
        // 如果长度不一致，直接返回false
        if (pattern.length() != splited.length) {
            return false;
        }
        // 映射
        HashMap<Character, String> map = new HashMap<>();
        char[] patternArr = pattern.toCharArray();
        for (int i = 0; i < patternArr.length; i++) {
            // 映射关系不存在
            if (!map.containsKey(patternArr[i])) {
                // 值已存在
                if (map.containsValue(splited[i])) {
                    return false;
                }
                map.put(patternArr[i], splited[i]);
            }
            // 映射错误
            if (!map.get(patternArr[i]).equals(splited[i])) {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
