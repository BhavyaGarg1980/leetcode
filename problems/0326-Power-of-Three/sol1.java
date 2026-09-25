// ==========================================================
// 326. Power of Three
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 8 ms (Beats 92%)
// Memory     : 46.2 MB (Beats 26%)
// Link       : https://leetcode.com/problems/power-of-three/
// ==========================================================

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0) return false;
        while(n % 3 == 0){
            n = n/3;
        }
        return n == 1;
    }
}