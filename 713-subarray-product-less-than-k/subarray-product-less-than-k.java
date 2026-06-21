class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int right = 0;
        int prod = 1;
        int count = 0;

        for(int left = 0; left < n; left++) {
            prod *= nums[left];
            right = left;

            while(prod < k && right < n){
                if(left == right && nums[right] < k) {
                    count++;
                    right++;
                }
                else {
                    prod *= nums[right];
                    if(prod < k) {
                        right++;
                        count++;
                    }
                }
            }
            prod = 1;
        }
        return count;
    }
}