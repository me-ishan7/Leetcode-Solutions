class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] freq = new boolean[n];

        findPermutations(nums, 0, n, list, ans);
        return ans;
    }

    private static void findPermutations(int[] nums, int curr, int n, 
    ArrayList<Integer> list, List<List<Integer>> ans) {

        if(list.size() == n) {
            ans.add(new ArrayList<Integer>(list));
            return;
        }
    
        for(int i = 0; i < n; i++) {
            if(!list.contains(nums[i])) {
                list.add(nums[i]); 
                findPermutations(nums, i +1, n, list, ans);
                list.remove(list.size() - 1);
            }
            
        }   
    }
}