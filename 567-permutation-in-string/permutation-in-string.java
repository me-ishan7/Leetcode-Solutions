class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length())
            return false;

        int n = s1.length();
        int m = s2.length();

        char[] chars = s1.toCharArray();
        Arrays.sort((chars));
        s1 = new String(chars);

        for (int i = 0; i <= m - n; i++) {
            String temp = s2.substring(i, n + i);
            char[] sortedS2 = temp.toCharArray();
            Arrays.sort(sortedS2);
            temp = new String(sortedS2);

            if (s1.equals(temp))
                return true;

        }
        return false;
    }
}