// ==========================================================
// 213. House Robber II
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 42.6 MB (Beats 77%)
// Link       : https://leetcode.com/problems/house-robber-ii/
// ==========================================================

// top down
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        int[] dp1 = new int[n - 1];
        Arrays.fill(dp1, -1);
        int case1 = f(n - 2, nums, dp1, 0);

        int[] dp2 = new int[n - 1];
        Arrays.fill(dp2, -1);
        int case2 = f(n - 2, nums, dp2, 1);

        return Math.max(case1, case2);
    }

    public int f(int idx, int[] nums, int[] dp, int start) {
        if (idx == 0) return nums[start];
        if (dp[idx] != -1) return dp[idx];
        int take = nums[start + idx] + (idx > 1 ? f(idx - 2, nums, dp, start) : 0);
        int nottake = f(idx - 1, nums, dp, start);
        dp[idx] = Math.max(take, nottake);
        return dp[idx];
    }
}
