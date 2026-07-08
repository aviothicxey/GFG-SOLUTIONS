class Solution {
    int majorityElement(int arr[]) {
        // code here
        int candidate = 0;
        int cnt = 0;
        for(int num : arr){
            if(cnt == 0)candidate = num;
            if(num == candidate) cnt++;
            else cnt--;
        }
        cnt = 0;
        for(int num : arr){
            if(num == candidate) cnt++;
        }
        if(cnt > arr.length/2) return candidate;
        return -1;
    }
}