//给定一棵二叉树的根节点 root，请左右翻转这棵二叉树，并返回其根节点。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：root = [5,7,9,8,3,2,4]
//输出：[5,9,7,4,2,3,8]
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数目范围在 [0, 100] 内 
// -100 <= Node.val <= 100 
// 
//
// 
//
// 注意：本题与主站 226 题相同：https://leetcode-cn.com/problems/invert-binary-tree/ 
//
// 
//
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 387 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            mirrorTree(root.left);
            mirrorTree(root.right);
        }
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
