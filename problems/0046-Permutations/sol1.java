// ==========================================================
// 46. Permutations
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 36%)
// Memory     : 45.6 MB (Beats 30%)
// Link       : https://leetcode.com/problems/permutations/
// ==========================================================

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, ans, new ArrayList<>());
        return ans;
    }
    public void backtrack(int[] nums, List<List<Integer>> ans, List<Integer> curr){
        if(curr.size() == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(curr.contains(nums[i])){
                continue;
            }
            curr.add(nums[i]);
            backtrack(nums, ans, curr);
            curr.remove(curr.size() - 1);
        }
    }
}