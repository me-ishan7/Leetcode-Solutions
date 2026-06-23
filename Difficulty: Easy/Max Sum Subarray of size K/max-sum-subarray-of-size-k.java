class Solution {
    public int maxSubarraySum(int[] arr, int k) {
       int n = arr.length;
       int sum = 0;
       
       for(int i = 0; i < k; i++) {
           sum += arr[i]; 
       }
       int maxSum = sum;
       
       for(int i = 0; i < n - k; i++) {
           sum -= arr[i];
           sum += arr[i + k];
           maxSum = Math.max(maxSum, sum);
       }
       return maxSum;
        
    }
}