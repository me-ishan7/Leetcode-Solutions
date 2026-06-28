class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int[] freq = new int[26];
        int n = s.length();

        for(char ch : p.toCharArray()){
            freq[ch - 'a']++;
        }

        int left = 0;

        for(int right = 0; right < n; right++) {
            freq[s.charAt(right) - 'a']--;

            while(right - left + 1 > p.length()){
                freq[s.charAt(left) - 'a']++;
                left++;
            }

            if(right - left + 1 == p.length()){
                boolean flag = true;

                for(int i : freq){
                    if(i != 0) {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    list.add(left);
                }
            }
        }
        return list;
    }
}