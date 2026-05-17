/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
*/

class Solution {
    public int minValue(Node root) {
        // code here
        return ans(root);
    }
    int ans(Node root){
         if(root == null){
            return -1; // BST empty
        }

        while(root.left != null){
            root = root.left;
        }

        return root.data;
    }
}