// ==========================================================
// 40. Combination Sum II
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 5 ms (Beats 99%)
// Memory     : 44.8 MB (Beats 93%)
// Link       : https://leetcode.com/problems/combination-sum-ii/
// ==========================================================

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, ans, new ArrayList<>());
        return ans;
    }
    public void backtrack(int[] candidates, int target, int start, List<List<Integer>> ans, List<Integer> curr){
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i = start; i < candidates.length; i++){
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (candidates[i] > target) {
                break;
            }
            curr.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i + 1, ans, curr);
            curr.remove(curr.size() - 1);
        }
    }
}