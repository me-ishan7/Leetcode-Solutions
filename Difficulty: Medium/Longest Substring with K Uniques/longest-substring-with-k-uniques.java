class Solution {
    public int longestKSubstr(String s, int k) {
       
       int n = s.length();
       int left = 0;
       int longestSubstr = -1;
       
       HashMap<Character, Integer> map = new HashMap<>();
       
       for(int right = 0; right < n; right++) {
            //Include right
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            
            //process left
            while(map.size() > k){
               map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
               if(map.get(s.charAt(left)) == 0) map.remove(s.charAt(left));
               left++;
            }
            
            // Store Result
            if(map.size() == k){ 
                longestSubstr = Math.max(longestSubstr, right - left + 1);
            }
       }
       
       return longestSubstr;
        
    }
}