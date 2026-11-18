// ==========================================================
// 113. Path Sum II
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 100%)
// Memory     : 45.1 MB (Beats 67%)
// Link       : https://leetcode.com/problems/path-sum-ii/
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(root, targetSum, path, result);
        return result;
    }
    public void dfs(TreeNode root, int targetSum, List<Integer> path, List<List<Integer>> result) {
        if (root == null) {
            return;
        }

        path.add(root.val);
        if (root.left == null && root.right == null
                && targetSum == root.val) {
            result.add(new ArrayList<>(path));
        } 
        else {
            dfs(root.left, targetSum - root.val, path, result);
            dfs(root.right, targetSum - root.val, path, result);
        }
        path.remove(path.size() - 1);
    }
}