class Solution {
    public int findFloor(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= x) {
                low = mid + 1;   // possible floor, move right
            } else {
                high = mid - 1;
            }
        }
        return high;  // floor index
    }
}
