// ==========================================================
// 1971. Find if Path Exists in Graph
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 64 ms (Beats 78%)
// Memory     : 257.8 MB (Beats 88%)
// Link       : https://leetcode.com/problems/find-if-path-exists-in-graph/
// ==========================================================

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int[] visit = new int[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visit[source] = 1;
        while(!q.isEmpty()){
            int node = q.poll();
            if(node == destination) return true;
            for(int it : adj.get(node)){
                if(visit[it] == 0){
                    q.add(it);
                    visit[it] = 1;
                }
            }
        }
        return false;
    }
}