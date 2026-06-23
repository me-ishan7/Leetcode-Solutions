class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int n = nums.length;
      int minLength = Integer.MAX_VALUE;

      int left = 0, right = 0;
      int sum = 0;

      while(right < n) {
        sum += nums[right];

        while(sum >= target){
            int length = right - left + 1;
            minLength = Math.min(minLength, length);
            sum -= nums[left];
            left++;
        }
        
       right++;
        
      }
      
      return minLength == Integer.MAX_VALUE ? 0 : minLength;  
    }
}