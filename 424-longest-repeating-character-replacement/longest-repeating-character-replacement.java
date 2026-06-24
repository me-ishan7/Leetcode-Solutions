class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            // Include right
            char ch = s.charAt(right);
            freq[ch - 'A']++;

            // Calculate max freq : (window length - maxFreq <= k) -> valid string
            maxFreq = Math.max(maxFreq, freq[ch - 'A']);

/*Process left : condition fails when 
            (window length - maxFreq > k) 
            eg - AABABBA
            Window: AABAB
            Frequency: A = 3, B = 2
            windowLength = 5
            maxFreq = 3

            replacementsNeeded = 5 - 3 = 2

            If(k = 1)
            then: 2 > 1
            Window invalid → move left.
*/    
            while ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

        //Store result
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}