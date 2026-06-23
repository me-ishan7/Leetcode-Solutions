class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int longestSubstr = 0;
        //HashMap<Character, Integer> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        for(int right = 0; right < n; right++) {
            /*
            //Include right
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);

            //Process left
            while(map.get(s.charAt(right)) > 1){
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }

            longestSubstr = Math.max(longestSubstr, right - left + 1);
            */

            //In HashSet we have Process left first because it will remove element on the process left step if we use this just after Include right at each element addition to the hashset.

            //Process left
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            //Include right
            set.add(s.charAt(right));
            
            //store result
            longestSubstr = Math.max(longestSubstr, right - left + 1);
        }
        return longestSubstr;
    }
}