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
        // vertical up
        for(int i = row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // diagonal left
        for(int i = row-1, j = col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        // diagonal right
        for(int i = row-1, j = col+1; i>=0 && j< board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static void helper(char[][] board, List<List<String>> allBoards, int row){
        if(row == board.length){
            count++;
            saveBoard(board, allBoards);
            return;
        }
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';

                helper(board, allBoards, row+1);

                board[row][j] = '.';
            }
        }
    }
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(board, allBoards, 0);

        return allBoards;
    }

    static int count = 0;

    public static void main(String[] args) {
        List<List<String>> allBoards = solveNQueens(4);

        for (int b = 0; b < allBoards.size(); b++) {
            System.out.println("Board " + (b + 1) + ":");
            for (String row : allBoards.get(b)) {
                System.out.println(row);
            }
            System.out.println();
        }

        System.out.println("Total no. of ways: " + count);
    }
}
