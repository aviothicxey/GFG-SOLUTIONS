class maxHeap {

    // Constructor
    ArrayList<Integer> heap ;
    public maxHeap() {
        // Initialize your data members
        heap = new ArrayList<>();
    }

     public void push(int x) {
        heap.add(x);

        int index = heap.size() - 1;

        while (index > 0) {
            int parent = (index - 1) / 2;

            if (heap.get(parent) < heap.get(index)) {
                int temp = heap.get(parent);
                heap.set(parent, heap.get(index));
                heap.set(index, temp);

                index = parent;
            } else {
                break;
            }
        }
    }

    public void pop() {
        if (heap.size() == 0) return;

        int lastIndex = heap.size() - 1;
        heap.set(0, heap.get(lastIndex));
        heap.remove(lastIndex);

        int index = 0;
        int size = heap.size();

        while (true) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int largest = index;

            if (left < size && heap.get(left) > heap.get(largest)) {
                largest = left;
            }

            if (right < size && heap.get(right) > heap.get(largest)) {
                largest = right;
            }

            if (largest != index) {
                int temp = heap.get(index);
                heap.set(index, heap.get(largest));
                heap.set(largest, temp);

                index = largest;
            } else {
                break;
            }
        }
    }

    public int peek() {
        if (heap.size() == 0) return -1;
        return heap.get(0);
    }

    public int size() {
        return heap.size();
    }
}