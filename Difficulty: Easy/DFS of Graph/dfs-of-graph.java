class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean[] vis = new boolean[adj.size()];
        ArrayList<Integer> ans = new ArrayList<>();
        dfss(vis , adj , 0 , ans);
        return ans;
    }
    public void dfss(boolean[]vis , ArrayList<ArrayList<Integer>> adj ,
    int node, ArrayList<Integer> ans){
        vis[node] = true;
        ans.add(node);
        for(int neigh : adj.get(node)){
            if(vis[neigh] == false){
                dfss(vis, adj , neigh , ans);
            }
        }
    }
}