// ==========================================================
// 671. Second Minimum Node In a Binary Tree
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 41.6 MB (Beats 99%)
// Link       : https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/
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
    public int findSecondMinimumValue(TreeNode root) {
        int min = root.val;
        return find(root, min);
    }
    public int find(TreeNode root, int min) {
        if (root == null) {
            return -1;
        }
        if (root.val > min) {
            return root.val;
        }
        int left = find(root.left, min);
        int right = find(root.right, min);

        if (left == -1) {
            return right;
        }
        if (right == -1) {
            return left;
        }
        return Math.min(left, right);
    }
}
