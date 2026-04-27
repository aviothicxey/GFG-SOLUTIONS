/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    ArrayList<Integer> ans = new ArrayList<>();
    
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        in(root);
        return ans;
    }
    public void in(Node root){
        if(root == null)return ;
        in(root.left);
        ans.add(root.data);
        in(root.right);
    }
}