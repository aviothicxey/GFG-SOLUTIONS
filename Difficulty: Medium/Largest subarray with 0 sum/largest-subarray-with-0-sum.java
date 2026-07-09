class Solution {
    int maxLength(int arr[]) {
        // code here
       HashMap<Integer,Integer> map = new HashMap();
       int sum = 0 ;
       int maxlen = 0 ;
       for(int i = 0 ; i < arr.length ; i++){
           sum += arr[i];
           if(sum == 0){    //is prefix sum is 0
               maxlen = i + 1;
           }
           if(map.containsKey(sum)){   //if summ already exist
               maxlen = Math.max(maxlen , i - map.get(sum));
           } else{
               map.put(sum , i) ;// save istt occurence
           }
       }
       return maxlen;
    }
}