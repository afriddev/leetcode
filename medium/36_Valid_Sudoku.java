
/**
 * Time Complexity - O(1)
 * Run Time - 4md
 * Beats - 40%
 * 
 */
class Solution {
    public static boolean checkCube(int row, int col, char[][] board) {
        for (int i = (row - row % 3); i <= ((row - row % 3) + 2); i++) {
            for (int j = (col - col % 3); j <= ((col - col % 3) + 2); j++) {
                if (i == row && j == col) {
                    continue;
                }
                if (board[row][col] != '.' && board[row][col] == board[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isValidSudoku(char[][] board) {
        for (int index = 0; index < 9; index++) {
            for (int i = 0; i < 9; i++) {
                char ch1 = board[index][i];
                char ch2 = board[i][index];
                for (int j = 0; j < 9; j++) {
                    if (i != j && ((ch1 != '.' && ch1 == board[index][j]) || (ch2 != '.' && ch2 == board[j][index]))) {
                        return false;
                    }
                }
                if (checkCube(index, i, board) || checkCube(i, index, board))
                    return false;
            }
        }
        return true;
    }
}
