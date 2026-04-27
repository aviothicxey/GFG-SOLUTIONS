/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> ans = new ArrayList<>();

    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        ans.clear();
        rec(root);
        return ans;
    }
    public void rec(Node root){
        if(root == null)return ;
        ans.add(root.data);
        rec(root.left);
        rec(root.right);
    }
}