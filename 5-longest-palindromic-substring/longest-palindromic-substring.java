class Solution {

    public String longestPalindrome(String s) {
        int n = s.length();
        String ans = "";
        int max = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++){
                if(isPalindrome(s,i,j)) {
                    if((j-i+1) > max){
                        ans = s.substring(i, j+1);
                        max = j - i + 1;
                    }
                }
            }
        }
        return ans;
    }
    static boolean isPalindrome(String s, int left, int right) {
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}