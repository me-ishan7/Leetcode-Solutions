class Solution {

    public String longestPalindrome(String s) {
        int n = s.length();
        String ans = s.substring(0,1);
        int maxLen = 1;

        // For odd length string
        for(int i = 0; i < n; i++) {
            int left = i, right = i;

            while(left >= 0 && 
                  right < n && 
                  s.charAt(left) == s.charAt(right)
                  ) {
                int len = right - left + 1;
                if(len > maxLen) {
                    maxLen = len;
                    ans = s.substring(left, right + 1);
                }
                left--;
                right++;
                }         
        }

        // For even length string
        for(int i = 0; i < n; i++) {
            int left = i, right = i + 1;

            while(left >= 0 && 
                  right < n &&
                  s.charAt(left) == s.charAt(right)
                ) {
                int len = right - left + 1;
                if(len > maxLen){
                    maxLen = len;
                    ans = s.substring(left, right + 1);
                }
                left--;
                right++;
            }
        }
    return ans;
    }
}