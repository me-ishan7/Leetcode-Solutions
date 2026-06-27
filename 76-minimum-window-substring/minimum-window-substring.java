class Solution {
    public String minWindow(String s, String t) {

        if(s.length() < t.length())
            return "";

        //store t in hashmap      
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int required = t.length();

        int minLen = Integer.MAX_VALUE;
        int start = left;
        String res = "";


        for (int right = 0; right < s.length(); right++) {
            //Include Right
            char ch = s.charAt(right);
            if (map.containsKey(ch)) {

                // decrement required only when value of ch > 0(prevents to decrement when duplicates occurs)
                if (map.get(ch) > 0)
                    required--;

                map.put(ch, map.get(ch) - 1);
            }

            // if window is valid precess left but first store answer bcz - minWindow question;
            while (required == 0) {
                if(right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                if(map.containsKey(leftChar)) {

                    map.put(leftChar, map.get(leftChar) + 1);

                    if(map.get(leftChar) > 0)
                        required++;
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : 
                            s.substring(start, start + minLen);
    }
}