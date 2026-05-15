class Solution {
    int majorityElement(int arr[]) {
        // code here
        int candidate = 0 ;
        int vote = 0;
        
        for(int x : arr ){
            if(vote == 0){
                 candidate = x;
            }
            if(x == candidate){
                vote++;
            }else{
                vote--;
            }
        }
        int cnt = 0 ; 
        for(int x : arr){
            if(x == candidate){
                cnt++;
            }
            
        }
        if(cnt > arr.length/2){
            return candidate;
        }
        return -1;
    }
}