class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        findPermutations(nums, 0, n, ans);
        return ans;
    }

    private static void findPermutations(int[] nums, int curr, int n, 
    List<List<Integer>> ans) {

        if(curr == n) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                list.add(nums[i]);
            }
            ans.add(new ArrayList<>(list));
            return;
        }
    
        for(int i = curr; i < n; i++) {
            swap(nums, curr, i);
            findPermutations(nums, curr +1, n, ans);
            swap(nums, curr, i);
        }   
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}