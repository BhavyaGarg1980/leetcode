// ==========================================================
// 213. House Robber II
// Difficulty : Medium
// Language   : Java
// Solution   : #2
// Runtime    : 0 ms (Beats 100%)
// Memory     : 42.5 MB (Beats 94%)
// Link       : https://leetcode.com/problems/house-robber-ii/
// ==========================================================

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        
        int[] temp1 = new int[n - 1];
        int[] temp2 = new int[n - 1];

        for(int i = 1; i < n; i++){
            temp1[i - 1] = nums[i];
        }
        for(int i = 0; i < n-1; i++){
            temp2[i] = nums[i];
        }

        int[] dp1 = new int[n - 1];
        int[] dp2 = new int[n - 1];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);
        return Math.max(
            solve(temp1.length - 1, temp1, dp1),
            solve(temp2.length - 1, temp2, dp2)
        );
    }
    public int solve(int idx, int[] nums, int[] dp) {
        if (idx == 0) return nums[0];
        if (idx < 0) return 0;
        if (dp[idx] != -1) return dp[idx];
        int pick = nums[idx] + solve(idx - 2, nums, dp);
        int notPick = solve(idx - 1, nums, dp);
        return dp[idx] = Math.max(pick, notPick);
    }
}