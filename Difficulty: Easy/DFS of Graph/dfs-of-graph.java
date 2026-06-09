class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean vis[] = new boolean[adj.size()];
        ArrayList<Integer>dfs = new ArrayList<>();
        vis[0] = true;
        dfs(vis , adj , dfs , 0);
        return dfs;
        
    }
    public void dfs(boolean[] vis , ArrayList<ArrayList<Integer>> adj , ArrayList<Integer> dfs , int node){
        vis[node] = true;
        dfs.add(node);
        for(int i : adj.get(node)){
            if(vis[i] == false){
                dfs(vis , adj , dfs , i);
            }
        }
    }
}