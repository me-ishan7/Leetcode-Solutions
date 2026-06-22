class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = nums[i];
        }

        Arrays.sort(nums);

        int start = -1, end = -1;

        for(int i = 0; i < n; i++) {
            if(arr[i] != nums[i] && start == -1){
                start = i;
                end = i;
            }
            if(arr[i] != nums[i]){
                end = i;
            }

        }
        if(start == -1) return 0;
        return end - start + 1;
    }
}