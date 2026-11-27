// ==========================================================
// 547. Number of Provinces
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 3 ms (Beats 26%)
// Memory     : 49.1 MB (Beats 13%)
// Link       : https://leetcode.com/problems/number-of-provinces/
// ==========================================================

class Solution {
    public int findCircleNum(int[][] isConnected) {
        int v = isConnected.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < v; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < v; i++){
            for(int j = 0; j < v; j++){
                if(isConnected[i][j] == 1 && i != 0) adj.get(i).add(j);
            }
        }
        boolean visit[] = new boolean[v];
        int count = 0;
        for(int i = 0; i < v; i++){
            if(!visit[i]){
                count++;
                dfs(i, isConnected, visit);
            }
        }
        return count;
    }
    public void dfs(int node, int[][] adj, boolean visit[]) {
        visit[node] = true;
        for (int i = 0; i < adj.length; i++) {
            if (adj[node][i] == 1 && !visit[i]) {
                dfs(i, adj, visit);
            }
        }
    }
}