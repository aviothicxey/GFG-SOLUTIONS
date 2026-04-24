/*
class Node
{
    int data ;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public void deleteNode(Node n1) {
        // code here
        n1.data = n1.next.data;
        n1.next = n1.next.next;
    }
}