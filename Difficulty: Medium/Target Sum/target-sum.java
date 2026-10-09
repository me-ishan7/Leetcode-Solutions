class Solution {
    Integer[][] dp;
    public int totalWays(int[] arr, int target) {
        // code here
        int sum = 0;
        
        for(int num : arr) {
            sum += num;
        }
        
        if (Math.abs(target) > sum) return 0;
        if ((sum + target) % 2 != 0) return 0;
        
        int K = (sum + target) / 2;
        
        dp = new Integer[arr.length][K + 1];
        
        return solve(0, arr, K);
    }
    
    int solve(int i, int[] arr, int K) {
        
       if (i == arr.length) {
            return K == 0 ? 1 : 0;
        }
        
        if(dp[i][K] != null) return dp[i][K];
        
        int notTake = solve(i + 1, arr, K);
        
        int take = 0;
        if (arr[i] <= K) {
            take = solve(i + 1, arr, K - arr[i]);
        }
        
        return dp[i][K] = take + notTake;
    }
}