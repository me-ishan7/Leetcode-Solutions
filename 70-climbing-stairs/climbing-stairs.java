class Solution {
    public int climbStairs(int n) {

        if(n == 1) return n;

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        Arrays.fill(dp, -1);
        return solve(n, dp);
        
    }

    int solve(int n, int[] dp) {
        if(n < 0) {
            return 0;
        }
        if(n == 0) return 1;

        if(dp[n] != -1) return dp[n];

        int oneStep = solve(n - 1, dp);
        int twoStep = solve(n - 2, dp);

        dp[n] = oneStep + twoStep;

        return oneStep + twoStep;
    }
}