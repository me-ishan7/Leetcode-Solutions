class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int maxSum = kadaneMax(nums, n);
        int minSum = kadaneMin(nums, n);

        return Math.max(maxSum, Math.abs(minSum));
    }
    private int kadaneMax(int[] arr, int n) {
        int maxSum = arr[0];
        int bestEnding = arr[0];

        for(int i = 1; i < n; i++) {
            int v1 = arr[i];
            int v2 = bestEnding + arr[i];

            bestEnding = Math.max(v1, v2);
            maxSum = Math.max(bestEnding, maxSum);
        }
        return maxSum;
    } 

    private int kadaneMin(int[] arr, int n) {
        int minSum = arr[0];
        int bestEnding = arr[0];

        for(int i = 1; i < n; i++) {
            int v1 = arr[i];
            int v2 = bestEnding + arr[i];

            bestEnding = Math.min(v1, v2);
            minSum = Math.min(minSum, bestEnding);
        }
        return minSum;
    }
}