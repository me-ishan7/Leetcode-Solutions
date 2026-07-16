class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = 0 , max = nums[0];

        // for(int i = 0; i < n; i++){
        //     sum += nums[i];
        //     max = Math.max(max , sum);
        //     if(sum < 0) sum = 0;
        // }
        int bestEnding = nums[0];

        for(int i = 1; i < n; i++) {
            int v1 = nums[i];
            int v2 = bestEnding + nums[i];
            bestEnding = Math.max(v1, v2);
            max = Math.max(bestEnding, max);
        }
    return max;
    }  
}
