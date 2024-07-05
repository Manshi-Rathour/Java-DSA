package Array;

import java.util.Scanner;

public class Search_an_element_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element that you want to search: ");
        int n = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == n){
                System.out.println("Element " + n + " is found at index " + i);
            }
        }

    }
}
