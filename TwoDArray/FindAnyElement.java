package TwoDArray;

import java.util.Scanner;

public class FindAnyElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter no. of columns: ");
        int col = sc.nextInt();

        int[][] num = new int[row][col];

        System.out.println("Enter elements: ");
        for(int i=0; i<row; i++){
            for (int j = 0; j <col ; j++) {
                num[i][j] = sc.nextInt();
            }
        }

        int x = 11;

        for(int i=0; i<row; i++){
            for (int j = 0; j <col ; j++) {
                if(num[i][j]==x){
                    System.out.println("x found at location (" + i + ", " + j + ")");
                }
            }
        }
    }
}
