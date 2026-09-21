// ==========================================================
// 216. Combination Sum III
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 42.4 MB (Beats 48%)
// Link       : https://leetcode.com/problems/combination-sum-iii/
// ==========================================================

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(k, n, 1, ans, new ArrayList<>());
        return ans;
    }
    public void backtrack(int k, int n, int start, List<List<Integer>> ans, List<Integer> curr){
        if(curr.size() == k){
            if(n == 0){
                ans.add(new ArrayList<>(curr));
            }
            return;
        }
        for(int i = start; i <= 9; i++){
            if(i > n){
                break;
            }
            curr.add(i);
            backtrack(k, n - i, i + 1, ans, curr);
            curr.remove(curr.size() - 1);
        }
    }
}