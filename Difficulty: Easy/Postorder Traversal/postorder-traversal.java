/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    
        // code here
ArrayList<Integer> ans = new ArrayList<>();

    public ArrayList<Integer> postOrder(Node root) {
        //  code here
        ans.clear();
        rec(root);
        return ans;
    }
    public void rec(Node root){
        if(root == null)return ;
        
        rec(root.left);
        rec(root.right);
        ans.add(root.data);
    }
}