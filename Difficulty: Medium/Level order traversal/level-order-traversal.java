/* A binary tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    // Constructor
    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
};
*/

class Solution {
    ArrayList<Integer> ans = new ArrayList<>();
    public ArrayList<Integer> levelOrder(Node root) {
        // code here
        rec(root);
        return ans;
    }
    public void rec(Node root){
        if(root == null) return;
        Queue<Node> q= new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            Node node = q.poll();
            
            if(node.left != null) q.add(node.left);
            if(node.right != null) q.add(node.right);
            ans.add(node.data);
            
        }
    }
}