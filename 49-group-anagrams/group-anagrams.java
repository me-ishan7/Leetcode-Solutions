class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        int n = strs.length;

        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){

           int[] freq = new int[26];
           Arrays.fill(freq, 0);
           
           for(char ch : s.toCharArray()){
                freq[ch - 'a']++;
           }

           StringBuilder sb = new StringBuilder("");

           for(int c : freq){
            sb.append(c).append(",");
           }

           String key = sb.toString();

           if(!map.containsKey(key)){
            map.put(key, new ArrayList<>());
           }

           map.get(key).add(s); 
        }

        return new ArrayList<>(map.values());
    }
}