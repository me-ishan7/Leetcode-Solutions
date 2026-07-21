class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProd = nums[0];
        int bestMax = nums[0], bestMin = nums[0];

        for(int i = 1; i < n; i++) {
           int v1 = bestMax * nums[i];
           int v2 = bestMin * nums[i];
           int v3 = nums[i];
           bestMax = Math.max(v1, Math.max(v2, v3));
           bestMin = Math.min(v1, Math.min(v2, v3));

           maxProd = Math.max(maxProd, bestMax);
        }
        return maxProd;
    }
}