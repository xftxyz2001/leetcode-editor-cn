//给你两个正整数 low 和 high 。 
//
// 对于一个由 2 * n 位数字组成的整数 x ，如果其前 n 位数字之和与后 n 位数字之和相等，则认为这个数字是一个对称整数。 
//
// 返回在 [low, high] 范围内的 对称整数的数目 。 
//
// 
//
// 示例 1： 
//
// 
//输入：low = 1, high = 100
//输出：9
//解释：在 1 到 100 范围内共有 9 个对称整数：11、22、33、44、55、66、77、88 和 99 。
// 
//
// 示例 2： 
//
// 
//输入：low = 1200, high = 1230
//输出：4
//解释：在 1200 到 1230 范围内共有 4 个对称整数：1203、1212、1221 和 1230 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= low <= high <= 10⁴ 
// 
//
// Related Topics 数学 枚举 👍 13 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int res = 0;
        if (low < 11) {
            low = 11;
        }
        while (low <= high) {
            String s = String.valueOf(low);
            int len = s.length();
            if (len % 2 != 0) {
                low *= 10;
                continue;
            }
            if (sumEquals(Integer.parseInt(s.substring(0, len / 2)),
                    Integer.parseInt(s.substring(len / 2)))) {
                res++;
            }
            low++;
        }
        return res;
    }

    private boolean sumEquals(int i1, int i2) {
        int sum1 = 0, sum2 = 0;
        while (i1 != 0) {
            sum1 += i1 % 10;
            i1 /= 10;
        }
        while (i2 != 0) {
            sum2 += i2 % 10;
            i2 /= 10;
        }
        return sum1 == sum2;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
