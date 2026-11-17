// ==========================================================
// 680. Valid Palindrome II
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 4 ms (Beats 99%)
// Memory     : 47.2 MB (Beats 86%)
// Link       : https://leetcode.com/problems/valid-palindrome-ii/
// ==========================================================

class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}