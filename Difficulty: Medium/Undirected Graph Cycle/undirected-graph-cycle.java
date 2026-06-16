class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n = edges.length;
        int m = edges[0].length;
        int[] vis = new int[V];
        for(int i = 0 ; i < V ; i++){
            adj.add(new ArrayList<>());
        }
        // for(int i = 0 ; i < n ; i++){
        //     for(int j = 0 ; j < m ; j++ ){
        //         if(edges[i][j] == 1 && i != j){
        //             adj.get(i).add(j);
        //             adj.get(j).add(i);
        //         }
        //     }
        // }
        for(int[] edge : edges){
            int v = edge[0];
            int u = edge[1];
            adj.get(v).add(u);
            adj.get(u).add(v);
        }
        for(int i = 0 ; i < V ; i++){
            if(vis[i] == 0){
                if(dfs(i,-1,vis,adj) == true)return true;
            }
        }
        return false;
        
    }
    boolean dfs(int node , int parent , int vis[] , ArrayList<ArrayList<Integer>>adj){
        vis[node] = 1;
        for(int i : adj.get(node)){
            if(vis[i] == 0){
                if(dfs(i,node,vis,adj) == true)
                return true;
            }
            else if(i != parent) return true;
        }
        return false;
    }
}