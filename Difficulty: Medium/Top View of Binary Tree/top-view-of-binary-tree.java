/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Pair{
    Node node;
    int d;
    Pair(Node node , int d){
        this.node = node;
        this.d = d;
    }
}
class Solution {
    
    public ArrayList<Integer> topView(Node root) {
        // code here
         ArrayList<Integer> ans = new ArrayList<>();
         rec(root , ans);
         return ans;
    }
    public void rec(Node root , ArrayList<Integer> ans){
        if(root == null)return;
        TreeMap<Integer , Integer> map = new TreeMap<>();
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root , 0));
        while(!q.isEmpty()){
            Pair pair = q.remove();
            Node node = pair.node;
            int d = pair.d;
            if(!map.containsKey(d)){
                map.put(d , node.data);
            }
            if(node.left != null){
                q.add(new Pair(node.left , (d -1)));
            }
            if(node.right != null){
                q.add(new Pair(node.right , (d + 1)));
            }
            
        }
        for(int x : map.values()){
            ans.add(x);
        }
    }
}