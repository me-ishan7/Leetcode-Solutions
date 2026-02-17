class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int high = -1 , low = 1;
        for(int ele : nums) {
            high = Math.max(high, ele);
        }
        int ans = high;
        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(isPossible(nums, mid, threshold)){
                ans = mid;
                high = mid - 1;
            } 
            else low = mid + 1;
        }
        return ans;
    }
    static boolean isPossible(int[] nums, int mid, int threshold) {
        long sum = 0;
        for(int ele : nums){

            sum += (ele + mid - 1) / mid;

            if(sum > threshold) break;
        }
        return sum <= threshold;
    }
}