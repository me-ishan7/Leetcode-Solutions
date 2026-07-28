class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> st = new ArrayDeque<>();

        int i = 0, n = s.length();

        while(i < n){
            if(!st.isEmpty() && s.charAt(i) == st.peek()){
                st.pop();
            }
            else {
                st.push(s.charAt(i));
            }
            i++;
        }

        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}