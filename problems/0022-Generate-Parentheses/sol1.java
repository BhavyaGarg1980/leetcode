// ==========================================================
// 22. Generate Parentheses
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 69%)
// Memory     : 44.9 MB (Beats 21%)
// Link       : https://leetcode.com/problems/generate-parentheses/
// ==========================================================

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(n, ans, "", 0, 0);
        return ans;
    }
    public void backtrack(int n, List<String> ans, String curr, int open, int close){
        if(curr.length() == n*2){
            ans.add(curr);
            return;
        }
        if(open < n){
            backtrack(n, ans, curr + "(", open + 1, close);
        }
        if(close < open){
            backtrack(n, ans, curr + ")", open, close + 1);
        }
    }
}