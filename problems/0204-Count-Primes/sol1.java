// ==========================================================
// 204. Count Primes
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 130 ms (Beats 51%)
// Memory     : 71.6 MB (Beats 39%)
// Link       : https://leetcode.com/problems/count-primes/
// ==========================================================

class Solution {
    public int countPrimes(int n) {
        if(n <= 2) return 0;
        int[] prime = new int[n];
        Arrays.fill(prime, 1); //all prime
        prime[0] = 0;
        prime[1] = 0;
        for(int i = 2; i*i < n; i++){
            if(prime[i] == 1){
                for(int j = i*i; j < n; j += i){
                    prime[j] = 0;
                }
            }
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            if(prime[i] == 1) count++;
        }
        return count;
    }
}