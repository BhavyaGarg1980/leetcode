// ==========================================================
// 714. Best Time to Buy and Sell Stock with Transaction Fee
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 5 ms (Beats 86%)
// Memory     : 64.7 MB (Beats 95%)
// Link       : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/
// ==========================================================

class Solution {
    public int maxProfit(int[] prices, int fee) {
        int cash = 0;
        int hold = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            int prevCash = cash;
            cash = Math.max(cash, hold + prices[i] - fee);
            hold = Math.max(hold, prevCash - prices[i]);
        }
        return cash;
    }
}