class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int index1 = -1 , index2 = -1;

        index1 = leftOccurence(nums, low, high, target, index1);
        index2 = rightOccurence(nums, low, high, target, index2);

        return new int[]{index1, index2};
        
    }
    static int leftOccurence(int[] nums, int low, int high, int target, int index) {
        while(low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                index = mid;
                high = mid - 1;
            }

            else if(nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return index;
    }
    static int rightOccurence(int[] nums, int low, int high, int target, int index) {
        while(low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                index = mid;
                low = mid + 1;
            }

            else if(nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return index;
    }
}