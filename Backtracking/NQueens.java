package Backtracking;
import java.util.*;

public class NQueens {

    public static void helper(char[][] board, List<List<String>> allBoards, int col){

    }
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(board, allBoards, 0);

        return allBoards;
    }

    public static void main(String[] args) {

    }
}
