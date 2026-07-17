class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> st = new ArrayDeque<>();

        for(String token : tokens) {
            switch(token){
                case "+" : st.push(st.pop() + st.pop());
                            break;
                case "*" : st.push(st.pop() * st.pop());
                            break;
                case "/" : int b = st.pop();
                            int a = st.pop();
                            st.push(a / b);
                            break;
                case "-" :  b = st.pop();
                             a = st.pop();
                            st.push(a - b);
                            break;
                default :   st.push(Integer.parseInt(token));
            }
            
        }
        return st.pop();
    }
}