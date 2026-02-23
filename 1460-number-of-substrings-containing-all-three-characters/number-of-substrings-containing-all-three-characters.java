class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int n = s.length();
        int[] hash = new int[3];
        int left = 0;

        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            hash[ch - 'a']++;

            while(hash[0] > 0 && hash[1] > 0 && hash[2] > 0){
                count += (n - i);
                char leftchar = s.charAt(left);
                hash[leftchar - 'a']--;
                left++;
            } 
        }
        return count;
    }
}