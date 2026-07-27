class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty())return;
        int temp = st.pop();
        sortStack(st);
        insert(st,temp);

        
    }
    void insert(Stack<Integer> st , int x){
        if(st.isEmpty() || st.peek() <=x ){
            st.push(x);
            return;
        }
        int temp = st.pop();
        insert(st,x);
        st.push(temp);
    }
}