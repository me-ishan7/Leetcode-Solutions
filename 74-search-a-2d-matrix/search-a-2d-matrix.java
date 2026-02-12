class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] nums : matrix){
            int low = 0;
            int high = matrix[0].length - 1;

            if(nums[low] <= target && nums[high] >= target){

                while(low <= high) {
                    int mid = low + (high - low) / 2;

                    if(nums[mid] == target) return true;

                    else if(nums[mid] > target) high = mid - 1;
                    else low = mid + 1;      
                }  
            }
            
        }
        return false;
    }
}