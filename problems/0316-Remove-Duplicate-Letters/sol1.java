// ==========================================================
// 316. Remove Duplicate Letters
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 83%)
// Memory     : 43.5 MB (Beats 52%)
// Link       : https://leetcode.com/problems/remove-duplicate-letters/
// ==========================================================

class Solution {
    public String removeDuplicateLetters(String s) {
        int[] last = new int[26];
        boolean[] seen = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (seen[ch - 'a']) {
                continue;
            }
            while (!st.isEmpty() && st.peek() > ch && last[st.peek() - 'a'] > i) {
                seen[st.pop() - 'a'] = false;
            }
            st.push(ch);
            seen[ch - 'a'] = true;
        }
        StringBuilder ans = new StringBuilder();
        for (char c : st) {
            ans.append(c);
        }
        return ans.toString();
    }
}