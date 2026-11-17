// ==========================================================
// 409. Longest Palindrome
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 76%)
// Memory     : 42.5 MB (Beats 91%)
// Link       : https://leetcode.com/problems/longest-palindrome/
// ==========================================================

class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];
        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }
        int count = 0;
        boolean odd = false;
        for (int f : freq) {
            count += (f / 2) * 2;
            if (f % 2 == 1) {
                odd = true;
            }
        }
        if (odd) {
            count++;
        }
        return count;
    }
}