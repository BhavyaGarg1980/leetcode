// ==========================================================
// 62. Unique Paths
// Difficulty : Medium
// Language   : Java
// Solution   : #3
// Runtime    : 0 ms (Beats 100%)
// Memory     : 42.2 MB (Beats 47%)
// Link       : https://leetcode.com/problems/unique-paths/
// ==========================================================

// class Solution {
//     public int uniquePaths(int m, int n) {
//         int[][] dp = new int[m][n];
//         for (int[] row : dp) {
//             Arrays.fill(row, -1);
//         }
//         return solve(m - 1, n - 1, dp);
//     }
//     public int solve(int i, int j, int[][] dp) {
//         if (i == 0 && j == 0) return 1;
//         if (i < 0 || j < 0) return 0;
//         if (dp[i][j] != -1) return dp[i][j];

//         int up = solve(i - 1, j, dp);
//         int left = solve(i, j - 1, dp);
//         return dp[i][j] = up + left;
//     }
// }

// tabulation

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) continue;
                int up = 0, left = 0;
                if(i > 0) up = dp[i - 1][j];
                if(j > 0) left = dp[i][j - 1];
                dp[i][j] = up + left;
            }
        }
        return dp[m - 1][n - 1];
    }
}
