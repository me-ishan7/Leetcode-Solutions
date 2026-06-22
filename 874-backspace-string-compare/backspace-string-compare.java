class Solution {
    public boolean backspaceCompare(String s, String t) {
        List<Character> list = new ArrayList<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '#' && !list.isEmpty()) list.remove(list.size() - 1);
            else if(s.charAt(i) != '#') list.add(s.charAt(i));
        }

        List<Character> list2 = new ArrayList<>();
        for(int i = 0; i < t.length(); i++) {
            if(t.charAt(i) == '#' && !list2.isEmpty()) list2.remove(list2.size() - 1);
            else if (t.charAt(i) != '#') list2.add(t.charAt(i));
        }
        
        if(list.size() != list2.size()) return false;

        
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) != list2.get(i)) return false;
        }

        return true;
    }
}