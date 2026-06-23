class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        if(n == 1) return 0;
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            if(i == 0) {
                if(nums[i] > nums[i + 1]){
                    min = Math.min(min, nums[i]);
                    max = Math.max(max, nums[i]);
                }
            }

            else if(i == n - 1){
                if(nums[i] < nums[i - 1]){
                    min = Math.min(min, nums[i]);
                    max = Math.max(max, nums[i]);
                }
            }

            else if((nums[i] > nums[i + 1]) || (nums[i] < nums[i - 1])){
                min = Math.min(min, nums[i]);
                max = Math.max(max, nums[i]);
            }

        }
        if(min == Integer.MAX_VALUE || max == Integer.MIN_VALUE) return 0;
        int start = 0, end = 0;

        for(start = 0; start < n && nums[start] <= min; start++);
        for(end = n - 1; end >= 0 && nums[end] >= max; end--);

        return end - start + 1;
    }
}