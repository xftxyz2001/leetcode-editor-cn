//请你编写一个程序来计算两个日期之间隔了多少天。 
//
// 日期以字符串形式给出，格式为 YYYY-MM-DD，如示例所示。 
//
// 
//
// 示例 1： 
//
// 输入：date1 = "2019-06-29", date2 = "2019-06-30"
//输出：1
// 
//
// 示例 2： 
//
// 输入：date1 = "2020-01-15", date2 = "2019-12-31"
//输出：15
// 
//
// 
//
// 提示： 
//
// 
// 给定的日期是 1971 年到 2100 年之间的有效日期。 
// 
//
// Related Topics 数学 字符串 👍 57 👎 0




//leetcode submit region begin(Prohibit modification and deletion)
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
class Solution {
    public int daysBetweenDates(String date1, String date2) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date start = null;
        Date end = null;
        try {
            start = df.parse(date1);
            end = df.parse(date2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        long num = Math.abs(start.getTime() - end.getTime());
        return (int) (num / 24 / 60 / 60 / 1000);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
