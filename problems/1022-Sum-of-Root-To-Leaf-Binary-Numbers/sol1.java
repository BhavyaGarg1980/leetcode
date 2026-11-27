// ==========================================================
// 1022. Sum of Root To Leaf Binary Numbers
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 43.1 MB (Beats 89%)
// Link       : https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
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
    int sum = 0;
    public int sumRootToLeaf(TreeNode root) {
        dfs(root, 0);
        return sum;
    }
    public void dfs(TreeNode root, int curr) {
        if (root == null) {
            return;
        }
        curr = curr * 2 + root.val;
        if (root.left == null && root.right == null) {
            sum += curr;
            return;
        }
        dfs(root.left, curr);
        dfs(root.right, curr);
    }
}
