class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : arr){
            pq.add(x);
            
            if(k < pq.size()){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
