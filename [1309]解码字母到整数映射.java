//给你一个字符串 s，它由数字（'0' - '9'）和 '#' 组成。我们希望按下述规则将 s 映射为一些小写英文字符： 
//
// 
// 字符（'a' - 'i'）分别用（'1' - '9'）表示。 
// 字符（'j' - 'z'）分别用（'10#' - '26#'）表示。 
// 
//
// 返回映射之后形成的新字符串。 
//
// 题目数据保证映射始终唯一。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "10#11#12"
//输出："jkab"
//解释："j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
// 
//
// 示例 2： 
//
// 
//输入：s = "1326#"
//输出："acz"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s[i] 只包含数字（'0'-'9'）和 '#' 字符。 
// s 是映射始终存在的有效字符串。 
// 
//
// Related Topics 字符串 👍 85 👎 0


import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    HashMap<String, String> map = new HashMap<>(){
        {
            put("1", "a");
            put("2", "b");
            put("3", "c");
            put("4", "d");
            put("5", "e");
            put("6", "f");
            put("7", "g");
            put("8", "h");
            put("9", "i");
            put("10#", "j");
            put("11#", "k");
            put("12#", "l");
            put("13#", "m");
            put("14#", "n");
            put("15#", "o");
            put("16#", "p");
            put("17#", "q");
            put("18#", "r");
            put("19#", "s");
            put("20#", "t");
            put("21#", "u");
            put("22#", "v");
            put("23#", "w");
            put("24#", "x");
            put("25#", "y");
            put("26#", "z");
        }
    };

    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int index = s.length() - 1;
        while (index >= 0) {
            if (s.charAt(index) == '#') {
                sb.append(map.get(s.substring(index - 2, index + 1)));
                index -= 3;
            } else {
                sb.append(map.get(s.substring(index, index + 1)));
                index--;
            }
        }
        return sb.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
