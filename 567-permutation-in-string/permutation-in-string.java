class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if(n > m)
            return false;

        int[] freq = new int[26];

        // Store frequency of s1
        for(char ch : s1.toCharArray()) {
            freq[ch - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < m; right++) {
            
            freq[s2.charAt(right) - 'a']--;

            if(right - left + 1 > n) {
                freq[s2.charAt(left) - 'a']++;
                left++;
            }

            if(right - left + 1 == n){
                boolean flag = true;

                for(int i = 0; i < 26; i++) {
                    if(freq[i] != 0){
                        flag = false;
                        break;
                    }
                }
                if(flag) return true;
            }

        }
        return false;
    }
}