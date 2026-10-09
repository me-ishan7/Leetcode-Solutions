class Solution {
    Boolean[][] dp;

        public boolean isSubsetSum(int[] arr, int sum) {
            int n = arr.length;
            dp = new Boolean[n][sum + 1];

            return solve(0, sum, arr);
        }

        boolean solve(int i, int target, int[] arr) {

            if (target == 0) return true;

            if (i == arr.length || target < 0) return false;

            if (dp[i][target] != null) {
                return dp[i][target];
            }

            boolean take = solve(i + 1, target - arr[i], arr);
            boolean notTake = solve(i + 1, target, arr);

            return dp[i][target] = take || notTake;
        }
}