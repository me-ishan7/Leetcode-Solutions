class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        
        while(left < right) {
            if(arr[left] == 0) left++;
            if(arr[left] == 1) {
                swap(arr, left, right);
                right--;
            }
        }
    }
    void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
