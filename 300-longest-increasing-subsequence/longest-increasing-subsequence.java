class Solution {
    Integer[][] dp;
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;

        dp = new Integer[n + 1][n + 1];
        return solve(0, -1, nums);
    }

    int solve(int i, int prev, int[] nums) {

        if(i >= nums.length) return 0;

        if(dp[i][prev + 1] != null) return dp[i][prev + 1];

        if(prev == -1 || nums[i] > nums[prev]) {
            int c1 = 1 + solve(i + 1, i, nums);
            int c2 = solve(i + 1, prev, nums);

            return dp[i][prev + 1] = Math.max(c1,c2);
        }

        return dp[i][prev + 1] = solve(i + 1, prev, nums);
    }
}