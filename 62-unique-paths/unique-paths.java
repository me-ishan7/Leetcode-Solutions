class Solution {
    Integer[][] dp;
    public int uniquePaths(int m, int n) {
        dp = new Integer[m + 1][n + 1];
        for(int i = 0; i <= n; i++) {
            dp[m][i] = 0;
        }
        for(int j = 0; j <= m; j++) {
            dp[j][n] = 0;
        }

        dp[m - 1][n - 1] = 1;

        for(int i = m - 1; i >= 0; i--) {
            for(int j = n - 1; j >= 0; j--) {

                if (i == m - 1 && j == n - 1) {
                    continue;
                }
                
                dp[i][j] = dp[i + 1][j] + dp[i][j + 1];
            }
        }

        return dp[0][0];
        // return solve(0, 0, m, n);
    }

    // int solve(int i, int j, int m, int n) {
    //     if(i >= m || j >= n) return 0;
    //     if(i == m - 1 && j == n - 1) return 1;

    //     if(dp[i][j] != null) return dp[i][j];

    //     int down = solve(i + 1, j, m, n);
    //     int right = solve(i, j + 1, m, n);

    //     return dp[i][j] = down + right;
    // }
}