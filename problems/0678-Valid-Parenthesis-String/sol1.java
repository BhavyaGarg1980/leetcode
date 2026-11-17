// ==========================================================
// 678. Valid Parenthesis String
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 42.2 MB (Beats 97%)
// Link       : https://leetcode.com/problems/valid-parenthesis-string/
// ==========================================================

class Solution {
    public boolean checkValidString(String s) {
        int min = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                min++;
                max++;
            }
            else if (ch == ')') {
                min--;
                max--;
            }
            else {
                min--;
                max++;
            }
            if (max < 0) {
                return false;
            }
            if (min < 0) {
                min = 0;
            }
        }
        return min == 0;
    }
}