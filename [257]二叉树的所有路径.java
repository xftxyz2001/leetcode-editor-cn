//给你一个二叉树的根节点 root ，按 任意顺序 ，返回所有从根节点到叶子节点的路径。 
//
// 叶子节点 是指没有子节点的节点。 
//
// 示例 1： 
// 
// 
//输入：root = [1,2,3,null,5]
//输出：["1->2->5","1->3"]
// 
//
// 示例 2： 
//
// 
//输入：root = [1]
//输出：["1"]
// 
//
// 
//
// 提示： 
//
// 
// 树中节点的数目在范围 [1, 100] 内 
// -100 <= Node.val <= 100 
// 
//
// Related Topics 树 深度优先搜索 字符串 回溯 二叉树 👍 1049 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;

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

    ArrayList<String> ans = new ArrayList<>();
    LinkedList<Integer> list = new LinkedList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        preOrder(root);
        return ans;
    }

    private void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        list.addLast(root.val);
        if (root.left == null && root.right == null) {
            StringBuilder sb = new StringBuilder();
            for (Integer i : list) {
                // if (sb.length() > 0) {
                if (!sb.isEmpty()) {
                    sb.append("->");
                }
                sb.append(i);
            }
            ans.add(sb.toString());

        }
        preOrder(root.left);
        preOrder(root.right);
        list.removeLast();
        // if (root == null) {
        //     StringBuilder sb = new StringBuilder();
        //     for (Integer i : list) {
        //         // if (sb.length() > 0) {
        //         if (!sb.isEmpty()) {
        //             sb.append("->");
        //         }
        //         sb.append(i);
        //     }
        //     ans.add(sb.toString());
        //     return;
        // }
        // list.addLast(root.val);
        // preOrder(root.left);
        // preOrder(root.right);
        // list.removeLast();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
