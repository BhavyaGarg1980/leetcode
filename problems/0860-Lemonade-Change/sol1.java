// ==========================================================
// 860. Lemonade Change
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 100%)
// Memory     : 72.5 MB (Beats 49%)
// Link       : https://leetcode.com/problems/lemonade-change/
// ==========================================================

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            }
            else if (bill == 10) {
                if (five == 0) {
                    return false;
                }
                five--;
                ten++;
            }
            else { // bill == 20
                if (ten > 0 && five > 0) { // $10 + $5
                    ten--;
                    five--;
                }
                else if (five >= 3) {  // three $5 bills
                    five -= 3;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}