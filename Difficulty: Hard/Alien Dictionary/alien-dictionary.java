class Solution {
    public String findOrder(String[] words) {
        // code here
        int K = 26;
        
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i = 0 ; i < K ; i++){
            adj.add(new ArrayList<>());
        }
        
        boolean[] present = new boolean[K];
        
        for(String word : words){
            for(char ch : word.toCharArray()){
                present[ch - 'a'] = true;
            }
        }
        int[] indegree = new int[K];
        
        for(int i = 0; i< words.length - 1 ;i++){
            String s1 = words[i];
            String s2 = words[i+1];
            
            int len = Math.min(s1.length(),s2.length());
            boolean foundDifference= false;
            
            for(int j = 0 ; j < len ; j++){
                if(s1.charAt(j) != s2.charAt(j)){
                    int u = s1.charAt(j)-'a';
                    int v = s2.charAt(j) - 'a';
                    
                    adj.get(u).add(v);
                    indegree[v]++;
                    
                    foundDifference = true;
                    break;
                }
            }
            if(!foundDifference && s1.length() > s2.length()){
                return "";
            }
        }
         Queue<Integer> q = new LinkedList<>();
         for (int i = 0; i < K; i++) {
            if (present[i] && indegree[i] == 0) {
                q.add(i);
            }
        }

        StringBuilder ans = new StringBuilder();

        while (!q.isEmpty()) {

            int node = q.remove();

            ans.append((char) (node + 'a'));

            for (int next : adj.get(node)) {

                indegree[next]--;

                if (indegree[next] == 0) {
                    q.add(next);
                }
            }
        }
         int totalCharacters = 0;

        for (boolean x : present) {
            if (x) {
                totalCharacters++;
            }
        }

        if (ans.length() != totalCharacters) {
            return "";
        }

        return ans.toString();
    }
}