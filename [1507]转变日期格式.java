//给你一个字符串 date ，它的格式为 Day Month Year ，其中： 
//
// 
// Day 是集合 {"1st", "2nd", "3rd", "4th", ..., "30th", "31st"} 中的一个元素。 
// Month 是集合 {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", 
//"Oct", "Nov", "Dec"} 中的一个元素。 
// Year 的范围在 [1900, 2100] 之间。 
// 
//
// 请你将字符串转变为 YYYY-MM-DD 的格式，其中： 
//
// 
// YYYY 表示 4 位的年份。 
// MM 表示 2 位的月份。 
// DD 表示 2 位的天数。 
// 
//
// 
//
// 示例 1： 
//
// 输入：date = "20th Oct 2052"
//输出："2052-10-20"
// 
//
// 示例 2： 
//
// 输入：date = "6th Jun 1933"
//输出："1933-06-06"
// 
//
// 示例 3： 
//
// 输入：date = "26th May 1960"
//输出："1960-05-26"
// 
//
// 
//
// 提示： 
//
// 
// 给定日期保证是合法的，所以不需要处理异常输入。 
// 
//
// Related Topics 字符串 👍 20 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public String reformatDate(String date) {
        // String[] dayStrings = {"1st", "2nd", "3rd", "4th", "5th", "6th", "7th",
        //         "8th", "9th", "10th", "11th", "12th", "13th", "14th",
        //         "15th", "16th", "17th", "18th", "19th", "20th", "21st",
        //         "22nd", "23rd", "24th", "25th", "26th", "27th", "28th",
        //         "29th", "30th", "31st"};
        // String[] monthStrings = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
        //         "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        // String[] dateStrings = date.split(" ");
        // return dateStrings[2] + "-"
        //         + (Arrays.asList(monthStrings).indexOf(dateStrings[1]) + 1) + "-" +
        //         dayStrings[Arrays.asList(dayStrings).indexOf(dateStrings[0])];
        HashMap<String, String> dayMap = new HashMap<>() {
            {
                put("1st", "01");
                put("2nd", "02");
                put("3rd", "03");
                put("4th", "04");
                put("5th", "05");
                put("6th", "06");
                put("7th", "07");
                put("8th", "08");
                put("9th", "09");
                put("10th", "10");
                put("11th", "11");
                put("12th", "12");
                put("13th", "13");
                put("14th", "14");
                put("15th", "15");
                put("16th", "16");
                put("17th", "17");
                put("18th", "18");
                put("19th", "19");
                put("20th", "20");
                put("21st", "21");
                put("22nd", "22");
                put("23rd", "23");
                put("24th", "24");
                put("25th", "25");
                put("26th", "26");
                put("27th", "27");
                put("28th", "28");
                put("29th", "29");
                put("30th", "30");
                put("31st", "31");
            }
        };
        HashMap<String, String> monthMap = new HashMap<>() {
            {
                put("Jan", "01");
                put("Feb", "02");
                put("Mar", "03");
                put("Apr", "04");
                put("May", "05");
                put("Jun", "06");
                put("Jul", "07");
                put("Aug", "08");
                put("Sep", "09");
                put("Oct", "10");
                put("Nov", "11");
                put("Dec", "12");
            }
        };
        String[] dateStrings = date.split(" ");
        return dateStrings[2] + "-" + monthMap.get(dateStrings[1]) + "-" + dayMap.get(dateStrings[0]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
