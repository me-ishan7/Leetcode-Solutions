class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int size = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        solve(nums, ans, curr, 0);
        return ans;
    }

    static void solve(int[] nums, List<List<Integer>> ans, List<Integer> curr, int index) {
        // base case
        if (index >= nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        solve(nums, ans, curr, index + 1);
        curr.remove(curr.size() - 1);
        solve(nums, ans, curr, index + 1);
    }
}
