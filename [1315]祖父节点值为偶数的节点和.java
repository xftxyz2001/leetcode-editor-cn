//给你一棵二叉树，请你返回满足以下条件的所有节点的值之和： 
//
// 
// 该节点的祖父节点的值为偶数。（一个节点的祖父节点是指该节点的父节点的父节点。） 
// 
//
// 如果不存在祖父节点值为偶数的节点，那么返回 0 。 
//
// 
//
// 示例： 
//
// 
//
// 输入：root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
//输出：18
//解释：图中红色节点的祖父节点的值为偶数，蓝色节点为这些红色节点的祖父节点。
// 
//
// 
//
// 提示： 
//
// 
// 树中节点的数目在 1 到 10^4 之间。 
// 每个节点的值在 1 到 100 之间。 
// 
//
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 91 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumEvenGrandparent(TreeNode root) {
        // 空节点
        if (root == null) {
            return 0;
        }
        int ans = 0;
        // 偶数节点
        if (root.val % 2 == 0) {
            ans += sum(root.left) + sum(root.right);
        }
        // 递归处理左右子树
        ans += sumEvenGrandparent(root.left) + sumEvenGrandparent(root.right);
        return ans;

    }

    private int sum(TreeNode root) {
        // 空节点
        if (root == null) {
            return 0;
        }
        int ans = 0;
        if (root.left != null) {
            ans += root.left.val;
        }
        if (root.right != null) {
            ans += root.right.val;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
