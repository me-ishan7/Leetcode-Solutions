class Solution {
    public int shipWithinDays(int[] arr, int days) {
        int max = -1, sum = 0;

        for(int i : arr) {
            max = Math.max(max, i);
            sum += i;
        }

        int low = max, high = sum;
        int capacity = sum;
        
        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(isValidDays(arr, mid) <= days) {
                capacity = mid;
                high = mid - 1;
            } 
            else low = mid + 1;
        }
        return capacity;
    }
    static int isValidDays(int[] arr, int capacity) {
        int days = 1;
        int load = 0;
       
        for(int weight : arr) {
            
            if(load + weight > capacity) {
                days++;
                load = weight;
            }
            else {
                load += weight;
            }
        }
        return days;   
    }
}