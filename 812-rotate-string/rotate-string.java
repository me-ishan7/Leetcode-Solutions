class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;

        int n = s.length();

        for(int k = 0; k < n; k++) {

            int i = 0;

            while(i < n && s.charAt((i + k) % n) == goal.charAt(i)){
                i++;
            }

            if(i == n) return true;
            
        }
        return false;
    }
}