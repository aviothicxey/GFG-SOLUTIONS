class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int can1 = 0 , can2 =0;
        int cnt1 = 0 , cnt2 = 0;
        for(int num : arr){
            if(cnt1 == 0 && num != can2){
                can1 = num;
                cnt1++;
            }
            else if(cnt2 == 0 && num != can1){
                can2 = num;
                cnt2++;
            }
            else if(num == can1)cnt1++;
            else if (num == can2) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        for(int num : arr){
            if(num == can1) cnt1++;
            else if(num == can2) cnt2++;
        }
        if(cnt1 > arr.length/3) ans.add(can1);
        if(cnt2 > arr.length/3) ans.add(can2);
        Collections.sort(ans);
        return ans;
    }
}