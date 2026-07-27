class Solution {
    public ArrayList<String> binstr(int n) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
        generate(n,"",ans);
        return ans;
    }
    public void generate(int n , String str , ArrayList<String> ans){
        if(str.length() == n){
            ans.add(str);
            return;
        }
        generate(n, str+"0" , ans);
        generate(n , str+ "1" , ans);
    }
}
