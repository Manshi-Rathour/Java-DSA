package Backtracking;

public class SudokuSolver {

    public static boolean isSafe(char[][] board, int row, int col, int num){
        // check column
        for(int i=0; i<board.length; i++){
            if(board[i][col] == (char)(num + '0')){
                return false;
            }
        }

        // check row
        for(int j=0; j< board.length; j++){
            if(board[row][j] == (char)(num + '0')){
                return false;
            }
        }

        // check in grid
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;

        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(board[i][j] == (char)(num + '0')){
                    return false;
                }
            }
        }

        return true;
    }
    public static boolean helper(char[][] board, int row, int col){
        if(row == board.length){
            return true;
        }
        int nrow = 0;
        int ncol = 0;

        // check if it is last column of that row
        if(col == board.length - 1){
            nrow = row + 1;
            ncol = 0;
        }
        else{
            nrow = row;
            ncol = col + 1;
        }

        // if board is not empty
        if(board[row][col] != '.'){
            if(helper(board, nrow, ncol)){
                return true;
            }
        }

        // fill the board
        else{
            for(int i=1; i<=9; i++){
                // check position is safe or not to fill no.
                if(isSafe(board, row, col, i)){
                    board[row][col] = (char)(i + '0');

                    if(helper(board, nrow, ncol)){
                        return true;
                    }
                    else{
                        board[row][col] = '.';
                    }
                }
            }
        }
        return false;

    }
    public static void sudokuSolver(char[][] board){
        helper(board, 0, 0);
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        sudokuSolver(board);

        // Print the solved board in array format
        System.out.println("[");
        for (int i = 0; i < board.length; i++) {
            System.out.print("  [");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print("'" + board[i][j] + "'");
                if (j < board[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]" + (i < board.length - 1 ? "," : ""));
        }
        System.out.println("]");
    }
}
