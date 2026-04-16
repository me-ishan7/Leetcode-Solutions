class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] freq = new boolean[n];

        findPermutations(nums, 0, n, list, freq, ans);
        return ans;
    }

    private static void findPermutations(int[] nums, int curr, int n, 
    ArrayList<Integer> list, boolean[] freq, List<List<Integer>> ans) {

        if(list.size() == n) {
            ans.add(new ArrayList<Integer>(list));
            return;
        }
    
        for(int i = 0; i < n; i++) {
            if(!freq[i]) {
                list.add(nums[i]); 
                freq[i] = true;
                findPermutations(nums, i +1, n, list, freq, ans);
                list.remove(list.size() - 1);
                freq[i] = false;
            }
            
        }   
    }
}