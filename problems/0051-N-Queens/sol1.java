// ==========================================================
// 51. N-Queens
// Difficulty : Hard
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 82%)
// Memory     : 46.5 MB (Beats 81%)
// Link       : https://leetcode.com/problems/n-queens/
// ==========================================================

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];

        for(int i = 0; i < n; i++){
            Arrays.fill(board[i], '.');
        }
        backtrack(board, n, 0, ans);
        return ans;
    }
    public void backtrack(char[][] board, int n, int row, List<List<String>> ans){
        if(row == n){
            List<String> temp = new ArrayList<>();
            for(int i = 0; i < n; i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }
        for(int col = 0; col < n; col++){
            if(isCorrect(board, row, col, n)){
                board[row][col] = 'Q';
                backtrack(board, n, row+1, ans);
                board[row][col] = '.';
            }
        }
    }
    public boolean isCorrect(char[][] board, int row, int col, int n){
        int dupRow = row;
        int dupCol = col;
        while(row >= 0){
            if(board[row][col] == 'Q') return false;
            row--;
        }
        row = dupRow;
        col = dupCol;
        while(row >= 0 && col >= 0){
            if(board[row][col] == 'Q') return false;
            row--;
            col--;
        }
        row = dupRow;
        col = dupCol;
        while(row >= 0 && col < n){
            if(board[row][col] == 'Q') return false;
            row--;
            col++;
        }
        return true;
    }
}