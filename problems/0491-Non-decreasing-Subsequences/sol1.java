// ==========================================================
// 491. Non-decreasing Subsequences
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 6 ms (Beats 92%)
// Memory     : 52.6 MB (Beats 84%)
// Link       : https://leetcode.com/problems/non-decreasing-subsequences/
// ==========================================================

class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, 0, ans, new ArrayList<>());
        return ans;
    }
    public void backtrack(int[] nums, int start, List<List<Integer>> ans, List<Integer> curr){
        if(curr.size() >= 2){
            ans.add(new ArrayList<>(curr));
        }
        HashSet<Integer> set = new HashSet<>();

        for(int i = start; i < nums.length; i++){
            if(set.contains(nums[i])) continue;

            if(!curr.isEmpty() && nums[i] < curr.get(curr.size() - 1)) continue;

            set.add(nums[i]);
            curr.add(nums[i]);
            backtrack(nums, i + 1, ans, curr);
            curr.remove(curr.size() - 1);
        }
    }
}