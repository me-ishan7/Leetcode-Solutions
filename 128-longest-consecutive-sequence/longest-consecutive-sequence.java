class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int max = 1;
        if(n == 0) return 0;

        else{
            Arrays.sort(nums);
            int count = 1;
            for(int i = 1; i < n; i++) {
                if(nums[i] == nums[i - 1]){

                }
                else if(nums[i] == nums[i - 1] + 1)
                {
                    count += 1;
                    max = Math.max(max , count);

                }
                else{
                    count = 1;
                }
        }
        }
    return max;
    }
}