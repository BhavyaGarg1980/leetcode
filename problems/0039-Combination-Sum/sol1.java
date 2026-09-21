// ==========================================================
// 39. Combination Sum
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 94%)
// Memory     : 45.7 MB (Beats 67%)
// Link       : https://leetcode.com/problems/combination-sum/
// ==========================================================

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(candidates, target, 0, ans, new ArrayList<>());
        return ans;
    }

    public void backtrack(int[] candidates, int target, int index, List<List<Integer>> ans, List<Integer> curr){
        if(target == 0){
            ans.add(new ArrayList<>(curr));
        }
        if(target < 0) return;
        for(int i = index; i < candidates.length; i++){
            curr.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i, ans, curr);
            curr.remove(curr.size() - 1);
        }
    }
}