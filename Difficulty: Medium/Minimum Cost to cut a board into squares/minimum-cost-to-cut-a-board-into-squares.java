class Solution {
    public int minCost(int n, int m, int[] x, int[] y) {
        // code here
        Arrays.sort(x);
        Arrays.sort(y);
        int i = x.length-1; int j = y.length-1;
        int vp = 1 ; int hp = 1;
        int total = 0;
        
        while(i >= 0 && j >=0){
            if(y[j] >= x[i]){
                total += vp * y[j];
                j--;
                hp++;
            }else if(y[j] <= x[i]){
                total += hp*x[i];
                i--;
                vp++;
            }
        }
        while(i>=0){
            total += hp*x[i];
            i--;
            vp++;
        }
        while(j >=0){
            total += vp * y[j];
            j--;
            hp++;
        }
        
        return total;
    }
}
