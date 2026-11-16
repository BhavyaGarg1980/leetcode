// ==========================================================
// 257. Binary Tree Paths
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 6 ms (Beats 24%)
// Memory     : 49.3 MB (Beats 47%)
// Link       : https://leetcode.com/problems/binary-tree-paths/
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        dfs(root, "", ans);
        return ans;
    }
    void dfs(TreeNode root, String path, List<String> ans) {
        if (root == null) return;
        path += root.val;
        if (root.left == null && root.right == null) {
            ans.add(path);
            return;
        }
        path += "->";
        dfs(root.left, path, ans);
        dfs(root.right, path, ans);
    }
}