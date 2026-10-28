// ==========================================================
// 518. Coin Change II
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 31 ms (Beats 14%)
// Memory     : 57.2 MB (Beats 24%)
// Link       : https://leetcode.com/problems/coin-change-ii/
// ==========================================================

class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];
        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i], -1);
        }
        return solve(0, amount, coins, dp);
    }
    public int solve(int idx, int amount, int[] coins, int[][] dp){
        if(amount == 0)return 1;
        if(idx == coins.length) return 0;
        if(dp[idx][amount] != -1) return dp[idx][amount];
        int take = 0;
        if(coins[idx] <= amount){
            take = solve(idx, amount - coins[idx], coins, dp);
        }
        int notTake = solve(idx + 1, amount, coins, dp);
        return dp[idx][amount] = take + notTake;
    }
}