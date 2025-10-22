class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] markRow = new boolean[m];
        boolean[] markCol = new boolean[n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0){
                    markRow[i] = true;
                    markCol[j] = true;
                }
            }
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(markRow[i] || markCol[j]){
                    matrix[i][j] = 0;
                }
            }
        }
       
    }

}