package Backtracking;

public class GridWays {
    public static int gridWays(int i, int j, int n, int m){
        // base case
        if(i == n-1 && j == m-1){  // condition for last cell
            return 1;
        } else if (i == n || j == m) {   // boundary cross condition
            return 0;
        }

        int w1 = gridWays(i+1, j, n, m); // down move
        int w2 = gridWays(i, j+1, n, m); // right move

        return w1 + w2;
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println("Using Backtracking (TC: O(2^n+m): ");
        System.out.println(gridWays(0, 0, n, m));

        System.out.println("Using direct maths trick (TC: O(n+m): ");

//        total ways = (n-1 + m-1)! / ((n-1)!*(m-1)!);
        int numerator = factorial(n-1 + m-1);
        int denom1 = factorial(n-1);
        int denom2 = factorial(m-1);

        int ways = numerator / (denom1 * denom2);

        System.out.println(ways);
    }
}
