// ==========================================================
// 283. Move Zeroes
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 93%)
// Memory     : 47.3 MB (Beats 86%)
// Link       : https://leetcode.com/problems/move-zeroes/
// ==========================================================

class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}