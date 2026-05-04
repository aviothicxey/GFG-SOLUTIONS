// Node class
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Queue class
class myQueue {
    Node front , rear;
    int length;
    public myQueue() {
        front = null;
        rear = null;
        length = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int x) {
        Node newNode = new Node(x);
        if(rear == null){
            front = rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
        length++;
    }

    public void dequeue() {
        if(isEmpty()) return;
        front = front.next;
        if(front == null) rear = null;
        length--;
    }

    public int getFront() {
        if(isEmpty())return -1;
        return front.data;
    }

    public int size() {
        // Returns the current size of the queue.
        return length;
    }
}
