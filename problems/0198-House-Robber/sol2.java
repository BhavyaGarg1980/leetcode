// ==========================================================
// 198. House Robber
// Difficulty : Medium
// Language   : Java
// Solution   : #2
// Runtime    : 0 ms (Beats 100%)
// Memory     : 42.7 MB (Beats 74%)
// Link       : https://leetcode.com/problems/house-robber/
// ==========================================================

// // top - down
// class Solution {
//     public int rob(int[] nums) {
//         int n = nums.length;
//         int[] dp = new int[n];
//         Arrays.fill(dp, -1);
//         return f(n - 1, dp, nums);
//     }
//     public int f(int idx, int[] dp, int[] nums){
//         if(idx == 0) return nums[0];
//         if(idx < 0) return 0;
//         if(dp[idx] != -1) return dp[idx];
//         int take = nums[idx] + f(idx - 2, dp, nums);
//         int nottake = 0 + f(idx - 1, dp, nums);
//         dp[idx] = Math.max(take, nottake);
//         return dp[idx];
//     }
// }

// tabulation (bottom up)


class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];

        for (int i = 1; i < n; i++){
            int take = nums[i];
            if (i > 1){
                take = nums[i] + dp[i - 2];
            }
            int nottake = 0 + dp[i - 1];
            dp[i] = Math.max(take, nottake);
        }
        return dp[n - 1];
    }
}
