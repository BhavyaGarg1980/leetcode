// ==========================================================
// 64. Minimum Path Sum
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 100%)
// Memory     : 50.2 MB (Beats 73%)
// Link       : https://leetcode.com/problems/minimum-path-sum/
// ==========================================================

class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];

        for(int row[] : dp){
            Arrays.fill(row, -1);
        }
        return solve(m - 1, n - 1, dp, grid);
    }
    public int solve(int i, int j, int[][] dp, int[][] grid){
        if(i == 0 && j == 0) return grid[0][0];
        if(i < 0 || j < 0) return Integer.MAX_VALUE;
        if(dp[i][j] != -1) return dp[i][j];

        int up = solve(i - 1, j, dp, grid);
        int left = solve(i, j - 1, dp, grid);
        int minPath = Math.min(up, left);
        if(minPath == Integer.MAX_VALUE) return dp[i][j] = Integer.MAX_VALUE;
        return dp[i][j] = grid[i][j] + minPath;
    }
}