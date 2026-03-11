class Solution {
    public int pivotIndex(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        int leftSum = 0;
        for(int i = 0; i < n; i++) {
            if(leftSum == sum - leftSum - arr[i]){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
}