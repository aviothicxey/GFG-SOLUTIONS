/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next;
        }
        if(fast != null){
            slow = slow.next;
        }
        Node prev = null;
        Node next = null;
        Node curr = slow;
        while(curr != null){
            next = curr.next;
            curr.next = prev ;
            prev = curr;
            curr = next;
        }
        
        Node h1 = head;
        Node h2 = prev;
        
        while(h1 != null && h2 != null){
            if(h1.data != h2.data){
                return false;
            }
            h1 = h1.next;
            h2 = h2.next;
        }
        return true;
        
    }
}