class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0 ; i < arr.length ;i++){
            set.add(arr[i]);
        }
        for(int x : set){
            ans.add(x);
        }
        return ans;
    }
}
