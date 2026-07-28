class Solution {
    public String removeDuplicates(String s) {
        // Deque<Character> st = new ArrayDeque<>();

        // int i = 0, n = s.length();

        // while(i < n){
        //     if(!st.isEmpty() && s.charAt(i) == st.peek()){
        //         st.pop();
        //     }
        //     else {
        //         st.push(s.charAt(i));
        //     }
        //     i++;
        // }

        // StringBuilder sb = new StringBuilder();

        // while(!st.isEmpty()){
        //     sb.append(st.pop());
        // }
        // return sb.reverse().toString();

        StringBuilder sb = new StringBuilder();
        int n = s.length();

        for(char ch : s.toCharArray()) {
            int len = sb.length();

            if(len > 0 && ch == sb.charAt(len - 1)){
                sb.deleteCharAt(len - 1);
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}