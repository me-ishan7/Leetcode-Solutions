class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int n = arr.length;
        int left = 0;
        int zeroCount = 0;
        int max = 0;
        
        for(int right = 0; right < n; right++) {
            if(arr[right] == 0) {
                zeroCount++;
            }
                
            if(zeroCount > k) {
                
                while(zeroCount > k){
        
                    if(arr[left] == 0){
                        zeroCount--;
                    }
                    left++;
                }
            }
                
            max = Math.max(max, right - left + 1);
           
        }
       
        return max;
    }
}