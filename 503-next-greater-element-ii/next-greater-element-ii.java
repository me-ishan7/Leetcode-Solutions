class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        Deque<Integer> st = new ArrayDeque<>();

        // for(int i = 2 * n - 1; i >= 0; i--) {
        //     while(!st.isEmpty() && st.peek() <= nums[i % n]){
        //         st.pop();
        //     }
        //     if(st.isEmpty()) {
        //         ans[i % n] = -1;
        //     }
        //     else{
        //         ans[i % n] = st.peek();
        //     }
        //     st.push(nums[i % n]);
        // }
        // return ans;

        //har ek element ko equal chance milna chahie to stack me pehle hi sare elements store kara lo
        for(int i = n - 2; i >= 0; i--) {
            st.push(nums[i]);
        }

        // ab simple next greater element ka code likh do

        for(int i = n - 1; i >= 0; i--) {
            while(!st.isEmpty() && st.peek() <= nums[i]){
                st.pop();
            }
            if(st.isEmpty()) ans[i] = -1;
            else ans[i] = st.peek();
            st.push(nums[i]);
        }
        return ans;
    }
}