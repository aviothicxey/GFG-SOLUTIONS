class Solution {
    static ArrayList<Integer> nextGreatest(int arr[]) {
        // code here
        int max = -1;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = arr.length -1 ; i >=0 ; i--){
            ans.add(max);
            if(arr[i] > max){
                max = arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}