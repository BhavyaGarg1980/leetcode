// ==========================================================
// 31. Next Permutation
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 44.6 MB (Beats 69%)
// Link       : https://leetcode.com/problems/next-permutation/
// ==========================================================

class Solution {
    public void nextPermutation(int[] nums) {  // next greater element
        int n = nums.length;
        int pivot = -1;
        for(int i = n - 1; i > 0; i--){
            if(nums[i - 1] < nums[i]){
                pivot = i - 1;
                break;
            }
        }
        if(pivot == -1){
            reverse(nums, 0, n - 1);
            return;
        }
        for(int i = n - 1; i > pivot; i--){
            if(nums[i] > nums[pivot]){
                swap(i, pivot, nums);
                break;
            }
        }
        reverse(nums, pivot + 1, n - 1);
    }
    public void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void reverse(int[] nums, int left, int right){
        while(left < right){
            swap(left, right, nums);
            left++;
            right--;
        }
    }
}