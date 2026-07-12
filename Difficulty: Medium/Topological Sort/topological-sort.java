class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0 ; i < V ; i++){
            adj.add(new ArrayList<>());
        }
        for(int edge[] : edges){
            adj.get(edge[0]).add(edge[1]);
        }
        boolean[] vis = new boolean[V];
        Stack<Integer> st = new Stack<>();
        for(int i =0 ;i < V ;i++){
            if(!vis[i]){
                dfs(i,vis,adj,st);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
        return ans;
    }
    private void dfs(int node , boolean[] vis ,ArrayList<ArrayList<Integer>> adj , Stack<Integer> st ){
        vis[node] = true;
        for(int i : adj.get(node)){
            if(!vis[i]){
                dfs(i,vis,adj,st);
            }
        }
        st.push(node);
    }
}