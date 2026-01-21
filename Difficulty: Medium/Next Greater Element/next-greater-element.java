class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> s = new Stack<>();
        
        int n = arr.length;
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = n - 1; i >= 0; i--) {
            
            if(s.isEmpty()) {
                ans.add(-1);
            }
            
            else if(s.peek() > arr[i]){
                ans.add(s.peek());
            }
            
            else {
               while (!s.isEmpty() && s.peek() <= arr[i]) {
                    s.pop();
                }
                if (s.isEmpty()) {
                    ans.add(-1);
                } else {
                    ans.add(s.peek());
                }
            }
            s.push(arr[i]);

        }
        Collections.reverse(ans);
        return ans;
    }
}