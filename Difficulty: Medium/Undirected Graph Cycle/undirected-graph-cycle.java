class Solution {
    
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n = edges.length;
        int m = edges[0].length;
        boolean[]vis = new boolean[V];
        for(int i = 0 ; i  < V ; i++){
            adj.add(new ArrayList<>());
        }
       for(int[] edge : edges){
           int u = edge[0];
           int v = edge[1];
           adj.get(u).add(v);
           adj.get(v).add(u);
       }
        for(int i = 0 ; i  <V ; i++)vis[i] = false;
        for(int i = 0 ; i < V ; i++){
            if(vis[i] == false){
                if(detect(i,V,adj,vis) == true)return true;
            }
        }
        return false;
        
    }
    boolean detect(int src ,int n , ArrayList<ArrayList<Integer>> adj , boolean vis[]){
        vis[src] = true;
        Queue<Pair>q = new LinkedList<>();
        q.add(new Pair(src , -1));
        while(!q.isEmpty()){
            int node = q.peek().first;
            int parent = q.peek().second;
            q.poll();
            for(int adjN : adj.get(node)){
                if(vis[adjN] == false){
                    vis[adjN] = true;
                    q.add(new Pair(adjN , node));
                }else if(parent != adjN){
                    return true;
                }
            }
        }
        return false;
    }
}
class Pair{
    int first ;
    int second;
    Pair(int first , int second){
        this.first = first;
        this.second = second;
    }
}