class Solution {
    int countTriplets(int target, int arr[]) {
        // code here
        int count = 0;
        
        int n = arr.length;
        
        Arrays.sort(arr);
        
        for(int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            
            while(left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                
                if(sum < target) {
                    count += right - left;
                    left++;
                    
                }
                else right--;
            }
        }
        return count;
    }
}