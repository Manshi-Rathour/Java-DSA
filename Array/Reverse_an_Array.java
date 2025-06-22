package Array;

public class Reverse_an_Array {
    public static void main(String[] args) {
        int arr[] = {4, 5, 1, 2};
         int reversedArray[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - i -1];
        }
        System.out.println("Reversed Array: ");
        for(int i : reversedArray){
            System.out.print(i + " ");
        }
    }
}
