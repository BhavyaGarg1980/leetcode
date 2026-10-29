// ==========================================================
// 70. Climbing Stairs
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 41.6 MB (Beats 91%)
// Link       : https://leetcode.com/problems/climbing-stairs/
// ==========================================================

class Solution {
    public int climbStairs(int n) {
        if(n <= 2) return n;
        int prev1 = 2;
        int prev2 = 1;
        for(int i = 3; i <= n; i++){
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
            
        }
        return prev1;
    }
}