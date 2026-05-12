/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int n) {
        // Your code here
        if(head == null)return 0;
        
        
        int l = length(head);
        if(n > l) return -1;
        int k = l - n ;
        
        Node temp = head;
        for(int i = 0 ; i < k ; i++){
            temp = temp.next;
        }
        return temp.data;
        
    }
    int length(Node head){
        if(head == null)return 0;
        int cnt = 0;
        while(head != null){
            cnt++;
            head = head.next;
        }
        return cnt;
    }
}