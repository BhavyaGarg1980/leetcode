// ==========================================================
// 509. Fibonacci Number
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 42.3 MB (Beats 5%)
// Link       : https://leetcode.com/problems/fibonacci-number/
// ==========================================================

// class Solution {   // 2^n
//     public int fib(int n) {
//         if(n == 0) return 0;
//         if(n == 1) return 1;
//         return fib(n-1) + fib(n-2);
//     }
// }

// DP   //O(n)
class Solution {
    public int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i <= n; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
}