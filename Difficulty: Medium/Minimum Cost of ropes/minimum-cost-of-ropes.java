class Solution {
    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0 ; i < arr.length ; i++){
            pq.offer(arr[i]);
        }
        int cost = 0;
        while(pq.size() > 1){
            int ist = pq.poll();
            int sec = pq.poll();
            int sum = ist + sec;
            cost += sum;
            pq.offer(sum);
        }
        return cost;
    }
}