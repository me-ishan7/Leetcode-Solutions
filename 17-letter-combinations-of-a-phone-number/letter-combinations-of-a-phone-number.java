class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0) return ans;

        String[] map = 
            {
                "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
            };
        getCombinations(digits, 0, new StringBuilder(), map, ans);
        return ans;
    }

    static void getCombinations(String digits, int idx, StringBuilder curr, String[]
     map, List<String> ans) 
     {
        if(idx == digits.length())
        {
            ans.add(curr.toString());
            return;

        }
        String letters = map[digits.charAt(idx) - '0'];

        for(char ch : letters.toCharArray())
        {
            curr.append(ch);
            getCombinations(digits, idx + 1, curr, map, ans);
            curr.deleteCharAt(curr.length() - 1);
        }
     }
}