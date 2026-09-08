class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        
        int arr[][] = new int[start.length][2];
        int n = arr.length;
        
        for(int i = 0 ; i<n ;i++){
            arr[i][0] = start[i];
            arr[i][1] = finish[i];
        }
        Arrays.sort(arr,(a,b)-> a[1]-b[1]);
        int cnt = 1;
        int end = arr[0][1];
        for(int i = 0 ; i < n; i++){
            if(arr[i][0] > end){
                cnt++;
                end = arr[i][1];
            }
        }
        return cnt;
    }
}

