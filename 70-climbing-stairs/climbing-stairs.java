class Solution {
    public int climbStairs(int n) {

        if(n == 1) return n;

        // int[] dp = new int[n + 1];
        // dp[0] = 1;
        // dp[1] = 1;

        int prev1 = 1; 
        int prev2 = 1;
        int ans  = 0;

        for(int i = 2; i <= n; i++) {
            // dp[i] = dp[i - 1] + dp[i - 2];
            ans = prev1 + prev2;
            prev1 = prev2;
            prev2 = ans;
        }
        return ans;
        
    }

    // int solve(int n, int[] dp) {
    //     if(n < 0) {
    //         return 0;
    //     }
    //     if(n == 0) return 1;

    //     if(dp[n] != -1) return dp[n];

    //     int oneStep = solve(n - 1, dp);
    //     int twoStep = solve(n - 2, dp);

    //     dp[n] = oneStep + twoStep;

    //     return oneStep + twoStep;
    // }
}