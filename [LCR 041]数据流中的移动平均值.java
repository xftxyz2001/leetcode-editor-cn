//给定一个窗口大小和一个整数数据流，根据该滑动窗口的大小，计算滑动窗口里所有数字的平均值。 
//
// 实现 MovingAverage 类： 
//
// 
// MovingAverage(int size) 用窗口大小 size 初始化对象。 
// double next(int val) 成员函数 next 每次调用的时候都会往滑动窗口增加一个整数，请计算并返回数据流中最后 size 个值的移动平均
//值，即滑动窗口里所有数字的平均值。 
// 
//
// 
//
// 示例： 
//
// 
//输入：
//inputs = ["MovingAverage", "next", "next", "next", "next"]
//inputs = [[3], [1], [10], [3], [5]]
//输出：
//[null, 1.0, 5.5, 4.66667, 6.0]
//
//解释：
//MovingAverage movingAverage = new MovingAverage(3);
//movingAverage.next(1); // 返回 1.0 = 1 / 1
//movingAverage.next(10); // 返回 5.5 = (1 + 10) / 2
//movingAverage.next(3); // 返回 4.66667 = (1 + 10 + 3) / 3
//movingAverage.next(5); // 返回 6.0 = (10 + 3 + 5) / 3
// 
//
// 
//
// 提示： 
//
// 
// 1 <= size <= 1000 
// -10⁵ <= val <= 10⁵ 
// 最多调用 next 方法 10⁴ 次 
// 
//
// 
//
// 
// 注意：本题与主站 346 题相同： https://leetcode-cn.com/problems/moving-average-from-data-
//stream/ 
//
// Related Topics 设计 队列 数组 数据流 👍 103 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class MovingAverage {

    /**
     * Initialize your data structure here.
     */
    int[] arr;
    int size; // 当前元素个数
    int sum; // 当前元素总和
    int next; // 下一个元素存放位置

    public MovingAverage(int size) {
        arr = new int[size]; // 初始化滑动窗口
    }

    public double next(int val) {
        if (size < arr.length) {
            // 没满
            size++;
        } else {
            // 满了
            sum -= arr[next]; // 删除旧值
        }
        arr[next] = val; // 保存新值

        sum += arr[next]; // 更新和
        next = (next + 1) % arr.length; // 更新下一次的插入位置
        return (double) sum / size; // 返回平均值
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
//leetcode submit region end(Prohibit modification and deletion)
