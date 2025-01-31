class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
         /**
     * 
     * Time Comlexity - O(N)
     * Beats - 100%
     * Run time - 0ms
     */
        int row = 0;
        int col = 0;
        while (row < matrix.length) {
            if (matrix[row][col] == target ) {
                return true;
            }
            if (matrix[row][col] > target) {
                return false;
            }
            col++;
            if(col == matrix[row].length){
                row++;
                col = 0;
            }
        }
        return false;
    }
}
