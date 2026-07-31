class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        rec(n,0,ans,new ArrayList(),arr);
        return ans;
    }
    void rec(int n , int idx ,ArrayList<ArrayList<Integer>> ans ,
    ArrayList<Integer>ds,int[] arr){
        if(idx >= n){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[idx]);
        rec(n,idx + 1 , ans , ds , arr);
        ds.remove(ds.size()-1);
        rec(n,idx + 1 , ans , ds , arr);
    }
}