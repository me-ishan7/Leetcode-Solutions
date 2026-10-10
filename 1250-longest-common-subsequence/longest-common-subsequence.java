class Solution {
    Integer[][] dp;
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        dp = new Integer[n + 1][m + 1];

        for(int i = 0; i <= n; i++) {
            dp[i][m] = 0;
        }

        for(int j = 0; j <= m; j++) {
            dp[n][j] = 0;
        }

        for(int i = n - 1; i >= 0; i--) {
            for(int j = m - 1; j >= 0; j--) {
                if(text1.charAt(i) == text2.charAt(j)) {
                    dp[i][j] = 1 + dp[i + 1][j + 1];
                }
                else {
                    int c1 = dp[i + 1][j];
                    int c2 = dp[i][j + 1];

                    dp[i][j] = Math.max(c1, c2);
                }
            }

        }
        return dp[0][0];

        // return solve(0, 0, text1, text2);
    }

    // int solve(int i, int j, String text1, String text2) {
    //     if(i == text1.length() || j == text2.length()) return 0;

    //     if(dp[i][j] != null) return dp[i][j];

    //     if(text1.charAt(i) == text2.charAt(j)) 
    //         return dp[i][j] = 1 + solve(i + 1, j + 1, text1, text2);

    //     int c1 = solve(i + 1, j, text1, text2);
    //     int c2 = solve(i, j + 1, text1, text2);

    //     return dp[i][j] = Math.max(c1, c2);
    // }
}