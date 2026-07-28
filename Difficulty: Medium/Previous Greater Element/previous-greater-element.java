class Solution {
    public ArrayList<Integer> preGreaterEle(int[] arr) {
        
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(-1);
        
        Deque<Integer> st = new ArrayDeque<>();
        
        st.push(arr[0]);
        
        for(int i = 1; i < n; i++) {
            
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            if(!st.isEmpty() && st.peek() > arr[i]) {
                ans.add(st.peek());
            }else{
                ans.add(-1);
            }
            st.push(arr[i]);
        }
        
        return ans;
    }
}