//给你一棵二叉树的根节点 root ，请你返回 层数最深的叶子节点的和 。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
//输出：15
// 
//
// 示例 2： 
//
// 
//输入：root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
//输出：19
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数目在范围 [1, 10⁴] 之间。 
// 1 <= Node.val <= 100 
// 
//
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 173 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.LinkedHashMap;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {

    private final LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

    public int deepestLeavesSum(TreeNode root) {
        preOrder(root, 1);
        return map.lastEntry().getValue();
    }

    public void preOrder(TreeNode root, int level) {
        if (root != null) {
            map.put(level, map.getOrDefault(level, 0) + root.val);
            preOrder(root.left, level + 1);
            preOrder(root.right, level + 1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
