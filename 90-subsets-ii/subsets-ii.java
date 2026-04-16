class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        getSubsets(nums,0,nums.length, new ArrayList<Integer>(), ans);
        return ans;
    }

    private static void getSubsets(int[] arr, int curr, int n,
      ArrayList<Integer> subset, List<List<Integer>> ans) 
      {
       
        ans.add(new ArrayList<Integer>(subset));

        for(int i = curr; i < n; i++) {
            if(i > curr && arr[i] == arr[i - 1]) continue;
            subset.add(arr[i]);
            getSubsets(arr, i + 1, n, subset, ans);
            subset.remove(subset.size() - 1);
        }
        
      }
}