//在一个大小为 n 且 n 为 偶数 的链表中，对于 0 <= i <= (n / 2) - 1 的 i ，第 i 个节点（下标从 0 开始）的孪生节点为第 
//(n-1-i) 个节点 。 
//
// 
// 比方说，n = 4 那么节点 0 是节点 3 的孪生节点，节点 1 是节点 2 的孪生节点。这是长度为 n = 4 的链表中所有的孪生节点。 
// 
//
// 孪生和 定义为一个节点和它孪生节点两者值之和。 
//
// 给你一个长度为偶数的链表的头节点 head ，请你返回链表的 最大孪生和 。 
//
// 
//
// 示例 1： 
//
// 
//
// 输入：head = [5,4,2,1]
//输出：6
//解释：
//节点 0 和节点 1 分别是节点 3 和 2 的孪生节点。孪生和都为 6 。
//链表中没有其他孪生节点。
//所以，链表的最大孪生和是 6 。
// 
//
// 示例 2： 
//
// 
//
// 输入：head = [4,2,2,3]
//输出：7
//解释：
//链表中的孪生节点为：
//- 节点 0 是节点 3 的孪生节点，孪生和为 4 + 3 = 7 。
//- 节点 1 是节点 2 的孪生节点，孪生和为 2 + 2 = 4 。
//所以，最大孪生和为 max(7, 4) = 7 。
// 
//
// 示例 3： 
//
// 
//
// 输入：head = [1,100000]
//输出：100001
//解释：
//链表中只有一对孪生节点，孪生和为 1 + 100000 = 100001 。
// 
//
// 
//
// 提示： 
//
// 
// 链表的节点数目是 [2, 10⁵] 中的 偶数 。 
// 1 <= Node.val <= 10⁵ 
// 
//
// Related Topics 栈 链表 双指针 👍 59 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.ArrayList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int n = list.size();
        int ans = 0;
        for (int i = 0; i < n / 2; i++) {
            ans = Math.max(ans, list.get(i) + list.get(n - 1 - i));
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
