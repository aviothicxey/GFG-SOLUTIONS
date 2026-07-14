class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0 ; i< V ; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
        }
        int indegree[] = new int[V];
        for(int i =0 ; i < V ; i++){
            for(int it : adj.get(i) ){
                indegree[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i < V ; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        int cnt = 0;
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            cnt++;
            for(int i : adj.get(node)){
                indegree[i]--;
                if(indegree[i] == 0)q.add(i);
            }
        }
        if(cnt == V)return false;
        return true;
    }
}