class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] m1 = new int[256];
        int[] m2 = new int[256];

        int n = s.length();

       for(int i = 0; i < n; i++) {
        char ch1 = s.charAt(i);
        char ch2 = t.charAt(i);

        if(m1[ch1] != m2[ch2]) return false;

        m1[ch1] = i + 1;
        m2[ch2] = i + 1;
       }
    return true;
    }
}