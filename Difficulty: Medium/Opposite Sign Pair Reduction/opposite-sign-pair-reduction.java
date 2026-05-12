class Solution {
    public ArrayList<Integer> reducePairs(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < arr.length ; i++){
            int curr = arr[i];
            boolean isAlive = true;
            
            while(isAlive && !st.isEmpty() && st.peek() * curr < 0){
                int top = st.peek();
                if(Math.abs(curr) > Math.abs(top)){
                    st.pop();
                    
                }else if(Math.abs(curr) == Math.abs(top)){
                    st.pop();
                    isAlive = false;
                }else{
                    isAlive = false;
                }
                
            }
            if(isAlive){
                    st.push(curr);
            }
        }
       ArrayList<Integer> res = new ArrayList<>();
       while(!st.isEmpty()){
       res.add(0,st.pop());
       }
       return res;
    }
}