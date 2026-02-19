class Solution {
    public int myAtoi(String s) {
        int i = 0, sign = 1;
        int n = s.length();
        int res = 0;

        while(i < n && s.charAt(i) == ' ') i++;
        
        if(i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            if(s.charAt(i) == '-') sign = -1;
            i++;
        }
            
        while(i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int curr = s.charAt(i) - '0';

            if(res > Integer.MAX_VALUE / 10 || 
                res == Integer.MAX_VALUE / 10 && curr > 7) 
                {
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

            res = res * 10 + curr;
            i++;
            }
        return res * sign;
    }
         
}