// ==========================================================
// 322. Coin Change
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 36 ms (Beats 12%)
// Memory     : 48 MB (Beats 5%)
// Link       : https://leetcode.com/problems/coin-change/
// ==========================================================

class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];
        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i], -1);
        }
        int ans = solve(0, coins, amount, dp);
        if(ans >= (int)1e9) return -1;
        return ans;
    }
    int solve(int idx, int[] coins, int amount, int[][] dp){
        if(amount == 0) return 0;
        if(idx == coins.length) return (int)1e9;
        if(dp[idx][amount] != -1) return dp[idx][amount];
        int take = (int) 1e9;
        if (coins[idx] <= amount) {
            take = 1 + solve(idx, coins, amount - coins[idx], dp);
        }
        int notTake = solve(idx + 1, coins, amount, dp);
        return dp[idx][amount] = Math.min(take, notTake);
    }
}