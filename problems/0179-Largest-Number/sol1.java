// ==========================================================
// 179. Largest Number
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 7 ms (Beats 49%)
// Memory     : 44.2 MB (Beats 93%)
// Link       : https://leetcode.com/problems/largest-number/
// ==========================================================

class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        if (arr[0].equals("0")) {
            return "0";
        }
        StringBuilder ans = new StringBuilder();
        for (String s : arr) {
            ans.append(s);
        }
        return ans.toString();
    }
}