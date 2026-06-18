class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        String[] sorted = new String[strs.length];

        int n = strs.length;
        
        for(int i = 0; i < strs.length; i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            sorted[i] = new String(ch);
        }

        boolean[] visited = new boolean[n];

        for(int i = 0; i < strs.length; i++) {

            if(visited[i]) continue;

            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = true;

            for(int j = i + 1; j < n; j++){
                if(!visited[j] && sorted[i].equals(sorted[j])){
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }
            ans.add(group);

        }
        return ans;
    }
}