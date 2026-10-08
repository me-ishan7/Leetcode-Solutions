class Solution {
    public int rob(int[] nums) {
        // int[] dp = new int[nums.length + 1];

        // Arrays.fill(dp, -1);

        int prev1 = nums[0];
        int prev2 = 0;

        if(nums.length == 1) return prev1;

        int ans = 0;

        for(int i = 1; i < nums.length; i++) {
           int take = nums[i] + prev2;
           int notTake = prev1;

           ans = Math.max(take, notTake);
           prev2 = prev1; 
           prev1 = ans;
        }

        return prev1;
        // return solve(0, nums, dp);
    }

    // int solve(int i, int[] nums, int[] dp) {
    //     if(i >= nums.length) return 0;

    //     if(dp[i] != -1) return dp[i];

    //     int rob = nums[i] + solve(i + 2, nums, dp);
    //     int notRob = solve(i + 1, nums, dp);

    //     dp[i] = Math.max(rob, notRob);

    //     return Math.max(rob, notRob);
    // }
}