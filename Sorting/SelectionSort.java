package Sorting;

public class SelectionSort {
    public static void printArray(int[] arr){
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 3, 2};

        for(int i=0; i<arr.length; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[smallest]){
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        printArray(arr);
    }
}
