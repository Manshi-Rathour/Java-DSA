package Backtracking;
import java.util.*;

public class NQueens {
    public static void saveBoard(char[][] board, List<List<String>> allBoards){

        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 'Q') {
                    row.append('Q');
                } else {
                    row.append('.');
                }
            }
            newBoard.add(row.toString());
        }
        allBoards.add(newBoard);
    }
    public static boolean isSafe(char[][] board, int row, int col){
        // horizontal
        for(int j=0; j< board.length; j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }

        //vertical
        for(int i=0; i< board.length; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // upper left
        int r = row;
        for(int c=col; c>=0 && r>=0; c--, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        // upper right
        r = row;
        for(int c=col; c< board.length && r>=0; c++, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        // lower left
        r = row;
        for(int c=col; c>=0 && r< board.length; c--, r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        // lower right
        r = row;
        for(int c=col; c< board.length && r< board.length; c++, r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        return true;
    }

    public static void helper(char[][] board, List<List<String>> allBoards, int col){
        if(col == board.length){
            saveBoard(board, allBoards);
            return;
        }
        for(int row=0; row<board.length; row++){
            if(isSafe(board, row, col)){
                board[row][col] = 'Q';

                helper(board, allBoards, col+1);

                board[row][col] = '.';
            }
        }
    }
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(board, allBoards, 0);

        return allBoards;
    }

    public static void main(String[] args) {
        List<List<String>> allBoards = solveNQueens(4);

        for (int b = 0; b < allBoards.size(); b++) {
            System.out.println("Board " + (b + 1) + ":");
            for (String row : allBoards.get(b)) {
                System.out.println(row);
            }
            System.out.println();
        }

    }
}
