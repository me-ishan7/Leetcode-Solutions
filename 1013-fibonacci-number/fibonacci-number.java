class Solution {
    public int fib(int n) {
        if(n==0 || n==1) return n;

        // int[] dp = new int[n + 1];

        // Arrays.fill(dp, -1);

        // dp[0] = 0;
        // dp[1] = 1;

        // if(dp[n] != -1) return dp[n];

        int prev1 = 0;
        int prev2 = 1;
        int ans = -1;

        for(int i = 2; i <= n; i++) {
            ans = prev1 + prev2;
            prev1 = prev2;
            prev2 = ans;
        }

        return ans;
        
        // return dp[n] = fib(n - 1) + fib(n - 2);
       
        // return fib(n-1) + fib(n-2);
    }
}