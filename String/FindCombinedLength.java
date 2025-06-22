package String;

import java.util.Scanner;

public class FindCombinedLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        String arr[] = new String[size];

        int toLength = 0;

        System.out.println("Enter string elements of the array: ");

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.next();
            toLength += arr[i].length();
        }

        System.out.println(toLength);
    }
}
