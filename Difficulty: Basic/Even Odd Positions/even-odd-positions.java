class Solution {

    public long totalFine(int date, int car[], int fine[]) {
        // code here
        long finee = 0;
        if(checkEven(date)){
            for(int i = 0 ; i < car.length;i++){
                if(checkOdd(car[i])){
                    finee += fine[i]; 
                }
            }
        }
        if(checkOdd(date)){
            for(int i = 0 ; i < car.length;i++){
                if(checkEven(car[i])){
                    finee += fine[i]; 
                }
            }
        }
        return finee;
        
    }
    public boolean checkEven(int n){
        if(n % 2 == 0){
            return true;
        }
        return false;
    }
    public boolean checkOdd(int n){
        if(n % 2 != 0){
            return true;
        }
        return false;
    }
}