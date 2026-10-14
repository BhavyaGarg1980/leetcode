// ==========================================================
// 64. Minimum Path Sum
// Difficulty : Medium
// Language   : Java
// Solution   : #2
// Runtime    : 7 ms (Beats 9%)
// Memory     : 49.8 MB (Beats 96%)
// Link       : https://leetcode.com/problems/minimum-path-sum/
// ==========================================================

// class Solution {
//     public int minPathSum(int[][] grid) {
//         int m = grid.length;
//         int n = grid[0].length;
//         int[][] dp = new int[m][n];

//         for(int row[] : dp){
//             Arrays.fill(row, -1);
//         }
//         return solve(m - 1, n - 1, dp, grid);
//     }
//     public int solve(int i, int j, int[][] dp, int[][] grid){
//         if(i == 0 && j == 0) return grid[0][0];
//         if(i < 0 || j < 0) return Integer.MAX_VALUE;
//         if(dp[i][j] != -1) return dp[i][j];

//         int up = solve(i - 1, j, dp, grid);
//         int left = solve(i, j - 1, dp, grid);
//         int minPath = Math.min(up, left);
//         if(minPath == Integer.MAX_VALUE) return dp[i][j] = Integer.MAX_VALUE;
//         return dp[i][j] = grid[i][j] + minPath;
//     }
// }


class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 && j == 0)continue;

                int up = Integer.MAX_VALUE;
                int left = Integer.MAX_VALUE;
                
                if(i > 0) up = grid[i][j] + dp[i - 1][j];
                if(j > 0) left = grid[i][j] + dp[i][j - 1];
                dp[i][j] = Math.min(up, left);
            }
        }
        return dp[m - 1][n - 1];
    }
}