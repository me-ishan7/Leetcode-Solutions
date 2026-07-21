class Solution {
    static int smallestSumSubarray(int arr[], int size) {
       
        int minSum = arr[0];
        int minEnding = arr[0];
        
        for(int i = 1; i < size; i++) {
            int v1 = arr[i];
            int v2 = minEnding + arr[i];
            minEnding = Math.min(v1, v2);
            minSum = Math.min(minSum, minEnding);
        }
        return minSum;
    }
}