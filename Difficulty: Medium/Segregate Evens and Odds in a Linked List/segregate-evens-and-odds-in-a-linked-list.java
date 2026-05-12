// User function Template for Java

/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node divide(Node head) {
        // code here
        if(head == null || head.next == null)return head;
        Node oddHead = null , oddTail = null;
        Node evenHead = null , evenTail = null;
        
        Node curr = head;
        while(curr != null){
            if(curr.data % 2 == 0){
                if(evenHead == null){
                    evenHead = curr;
                    evenTail = curr;
                }else{
                    evenTail.next = curr;
                    evenTail = curr;
                }
            }else{
                if(oddHead == null){
                    oddHead = curr;
                    oddTail = curr;
                }else{
                    oddTail.next = curr;
                    oddTail =curr;
                }
            }
            curr = curr.next;
        }
        if(evenHead == null){
            oddTail.next = null;
            return oddHead;
        }
        if(oddHead != null){
            evenTail.next = oddHead;
            
        }
        if(oddTail != null){
            oddTail.next = null;
        }
        return evenHead;
    }
}