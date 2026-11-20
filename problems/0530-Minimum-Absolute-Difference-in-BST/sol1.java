// ==========================================================
// 530. Minimum Absolute Difference in BST
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 53%)
// Memory     : 45.6 MB (Beats 100%)
// Link       : https://leetcode.com/problems/minimum-absolute-difference-in-bst/
// ==========================================================

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
    int min = Integer.MAX_VALUE;
        Integer prev = null;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return min;
    }
    void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        if (prev != null) {
            min = Math.min(min, root.val - prev);
        }
        prev = root.val;
        inorder(root.right);
    }
}