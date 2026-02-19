class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch , map.getOrDefault(ch, 0) + 1);
        }
        // list contains all unique characters(key of map)
        ArrayList<Character> list = new ArrayList<>(map.keySet());

        // Sorting using comparator -> sort in descending order
        Collections.sort(list, (a,b) -> map.get(b) - map.get(a));

        StringBuilder result = new StringBuilder();

        for(char c : list) {
            int freq = map.get(c);
            while(freq-- > 0) {
                result.append(c);
            }
        }
        return result.toString();
    }
}