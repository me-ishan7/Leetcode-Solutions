class Solution {
    public int knapsack(int W, int val[], int wt[]) {
       
       int n = val.length;
       
       int[][] dp = new int[n + 1][W + 1];
       
       for(int i = n - 1; i >= 0; i--) {
           for(int j = 0; j <= W; j++) {
               
               int notTake = dp[i + 1][j];
               
               int take = 0;
               
               if(wt[i] <= j) {
                   take = val[i] + dp[i + 1][j - wt[i]];
               }
               
               dp[i][j] = Math.max(take, notTake);
               
           }
       }
       
    return dp[0][W];
        
    }
}
