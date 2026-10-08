// ==========================================================
// 509. Fibonacci Number
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 0 ms (Beats 100%)
// Memory     : 42.4 MB (Beats 5%)
// Link       : https://leetcode.com/problems/fibonacci-number/
// ==========================================================

class Solution {
    public int fib(int n) {
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        return solve(n, dp);
    }
    public int solve(int n, int[] dp){
        if(n <= 1) return n;
        if(dp[n] != -1) return dp[n];
        dp[n] = solve(n-1, dp) + solve(n-2, dp);
        return dp[n];
    }
}