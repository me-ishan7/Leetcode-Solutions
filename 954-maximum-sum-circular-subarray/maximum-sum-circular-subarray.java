class Solution {

    public int maxSubarraySumCircular(int[] nums) {

        int maxNormalSum = kadaneMax(nums);

        // All elements are negative
        if (maxNormalSum < 0)
            return maxNormalSum;

        int minNormalSum = kadaneMin(nums);

        int totalSum = 0;
        for (int num : nums)
            totalSum += num;

        int maxCircularSum = totalSum - minNormalSum;

        return Math.max(maxNormalSum, maxCircularSum);
    }

    private int kadaneMax(int[] nums) {

        int currentMax = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSum = Math.max(maxSum, currentMax);
        }

        return maxSum;
    }

    private int kadaneMin(int[] nums) {

        int currentMin = nums[0];
        int minSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentMin = Math.min(nums[i], currentMin + nums[i]);
            minSum = Math.min(minSum, currentMin);
        }

        return minSum;
    }
}