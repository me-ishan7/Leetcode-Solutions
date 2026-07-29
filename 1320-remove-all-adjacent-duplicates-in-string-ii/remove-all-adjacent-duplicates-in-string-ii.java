class Solution {
    public String removeDuplicates(String s, int k) {
        int n = s.length();

        ArrayDeque<int[]> st = new ArrayDeque<>();
        // stack -> ek array hai 2 size ka -> [char, freq];

        for(char ch : s.toCharArray()) {

            if(!st.isEmpty() && st.peek()[0] == ch){

                st.peek()[1]++;

                if(st.peek()[1] == k){
                    st.pop();
                }
            }
            else{
                st.push(new int[]{ch, 1});
            }    
        }
        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            int[] pair = st.pop();
            char ch = (char) pair[0];
            int freq = pair[1];

            while (freq-- > 0) {
                sb.append(ch);
            }
        }

        return sb.reverse().toString();
    }
}