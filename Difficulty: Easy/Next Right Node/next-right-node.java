class Solution {
    Node nextRight(Node root, int key) {
        // Write your code here
        if(root == null) return new Node(-1);
        Queue<Node> q= new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0 ; i < size ; i++){
                Node curr = q.poll();
                
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
                
                if(curr.data == key){
                    if(i == size - 1){
                        return new Node(-1);
                    }
                    else{
                        return q.peek();
                    }
                }
            }
        }
        return new Node(-1);
    }
}