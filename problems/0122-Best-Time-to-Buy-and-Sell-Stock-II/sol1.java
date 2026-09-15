// ==========================================================
// 122. Best Time to Buy and Sell Stock II
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 46.1 MB (Beats 92%)
// Link       : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
// ==========================================================

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i - 1]){
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}