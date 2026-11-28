// ==========================================================
// 14. Longest Common Prefix
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 43.1 MB (Beats 36%)
// Link       : https://leetcode.com/problems/longest-common-prefix/
// ==========================================================

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = strs[0];
        for(int i = 1; i < strs.length; i++) {
            while(!strs[i].startsWith(ans)) {
                ans = ans.substring(0, ans.length() - 1);
                if(ans.length() == 0) {
                    return "";
                }
            }
        }
        return ans;
    }
}
