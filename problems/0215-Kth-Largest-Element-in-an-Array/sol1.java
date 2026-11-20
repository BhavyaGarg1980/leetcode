// ==========================================================
// 215. Kth Largest Element in an Array
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 66 ms (Beats 64%)
// Memory     : 73.9 MB (Beats 72%)
// Link       : https://leetcode.com/problems/kth-largest-element-in-an-array/
// ==========================================================

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++){
            pq.add(nums[i]);
            if(pq.size() > k) pq.poll();
        }
        return pq.peek();
    }
}