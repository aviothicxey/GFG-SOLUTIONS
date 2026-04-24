/*
Node class is as follows:

class Node {
    int data;
    Node next;

    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {

    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int n) {
        // write code here
        if(head == null ) return 0;
        Node temp = head;
        int l = length(head) - n;
        for(int i = 0 ; i < l ; i++ ){
            temp = temp.next;
        }
        int sum = 0;
        while(temp != null){
            sum += temp.data;
            temp = temp.next;
        }
        return sum;
    }
    public int length(Node head){
        int cnt = 0;
        while(head != null){
            head = head.next;
            cnt++;
        }
        return cnt;
    }
}