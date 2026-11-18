// ==========================================================
// 236. Lowest Common Ancestor of a Binary Tree
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 17 ms (Beats 61%)
// Memory     : 70.1 MB (Beats 36%)
// Link       : https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
// ==========================================================

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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) return root;
        TreeNode l = lowestCommonAncestor(root.left, p, q);
        TreeNode r = lowestCommonAncestor(root.right, p, q);
        if(l == null) return r;
        else if(r == null) return l;
        else return root;
    }
}