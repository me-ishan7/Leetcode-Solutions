class Solution {
    public int maxDepth(String s) {
        int max = 0, count = 0;
        int n = s.length();

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);

            if(ch == '(') {
                count++;
            }
            else if(ch == ')'){
                max = Math.max(max, count);
                count--;
            }
        }
        return max;
    }
}