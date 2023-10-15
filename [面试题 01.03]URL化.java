//URL化。编写一种方法，将字符串中的空格全部替换为%20。假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的“真实”长度。（注：用Java实现的话，
//请使用字符数组实现，以便直接在数组上操作。） 
//
// 
//
// 示例 1： 
//
// 
//输入："Mr John Smith    ", 13
//输出："Mr%20John%20Smith"
// 
//
// 示例 2： 
//
// 
//输入："               ", 5
//输出："%20%20%20%20%20"
// 
//
// 
//
// 提示： 
//
// 
// 字符串长度在 [0, 500000] 范围内。 
// 
//
// Related Topics 字符串 👍 112 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String replaceSpaces(String S, int length) {
        char[] charArray = S.toCharArray();

        // int i = charArray.length - 1;
        // 测试用例:"ds sdfs afs sdfa dfssf asdf             "
        // 27
        // 测试结果:"ds ds%20sdfs%20afs%20sdfa%20dfssf%20asdf"
        // 期望结果:"ds%20sdfs%20afs%20sdfa%20dfssf%20asdf"
        int count = 0;
        for (int j = 0; j < length; j++) {
            if (charArray[j] == ' ') {
                count += 3;
            } else {
                count++;
            }
        }
        int i = count - 1;

        while (--length >= 0) {
            if (charArray[length] == ' ') {
                charArray[i--] = '0';
                charArray[i--] = '2';
                charArray[i--] = '%';
            } else {
                charArray[i--] = charArray[length];
            }
        }

        return String.valueOf(charArray, 0, count);

    }
}
//leetcode submit region end(Prohibit modification and deletion)
