class Solution {
    public void reverseArray(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        
        reverse(arr, left, right);

    }
    static int[] reverse(int[] arr,int left,int right) {
        if(left >= right) {
            return arr;
        }
        swap(arr, left, right);
        left++;
        right--;
        return reverse(arr, left, right);
    } 
    
    static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}