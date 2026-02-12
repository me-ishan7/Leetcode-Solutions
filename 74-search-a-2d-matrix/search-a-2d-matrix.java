class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0, high = m * n - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            int midRow = mid / n;
            int midCol = mid % n;

            if(matrix[midRow][midCol] == target) return true;
            else if(matrix[midRow][midCol] > target) high = mid - 1;
            else low = mid + 1;
        }
        return false;
    }
}