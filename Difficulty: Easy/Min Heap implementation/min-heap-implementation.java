class minHeap {

    // Constructor
    ArrayList<Integer> heap ;
    
    public minHeap() {
        // Initialize your data members
        heap = new ArrayList<>();
    }

    public void push(int x) {
        // Insert x into the heap
        heap.add(x);
        int index = heap.size() -1 ;
        while(index > 0){
            int parent = (index - 1)/2;
            if(heap.get(parent) > heap.get(index)){
                int temp = heap.get(parent);
                heap.set(parent , heap.get(index));
                heap.set(index , temp);
                
                index = parent;
            }else{
                break;
            }
        }
    }

    public void pop() {
        // Remove the top (minimum) element
        if(heap.size() == 0)return;
        int lastIndex = heap.size() -1;
        heap.set(0,heap.get(lastIndex));
        heap.remove(lastIndex);
        
        int index = 0 ; 
        int size = heap.size();
        
        while(true){
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int smallest  = index;
            
            if(left < size && heap.get(left) < heap.get(smallest)){
                smallest = left;
            }
            if(right < size && heap.get(right) < heap.get(smallest)){
                smallest = right;
            }
            if(smallest != index){
                int temp = heap.get(index);
                heap.set(index , heap.get(smallest));
                heap.set(smallest , temp);
                
                index = smallest;
            }else{
                break;
            }
        }
    }

    public int peek() {
        // Return the top element or -1 if empty
        if(heap.size() == 0)return -1;
        return heap.get(0);
    }

    public int size() {
        // Return the number of elements in the heap
        return heap.size();
    }
}