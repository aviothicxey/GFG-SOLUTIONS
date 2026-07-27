class Solution {
    double power(double b, int e) {
        // code here
        if(e == 0)return 1;
        if(e < 0){
            return 1 / power(b,-e);
        }
        double result = 0;
        double half = power(b,e/2);
        
        if(e % 2 == 0){
            result = half * half;
        }
        else{
             result = half*half * b; 
        }
        return result;
    }
}