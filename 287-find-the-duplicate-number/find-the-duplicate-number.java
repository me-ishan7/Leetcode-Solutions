class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n + 1];

        for(int i : nums){
            if(arr[i] == 0){
                arr[i] = 1;
            }
            else return i;
        }
        return -1;
    }
}