package SearchingAndSorting;

public class InsertionSort {
    public static void printArray(int[] arr){
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
    public static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;

            while(prev >= 0 && arr[prev] > curr){
                // finding out thr correct position to insert
                arr[prev+1] = arr[prev];
                prev--;
            }
            // inserting
            arr[prev+1] = curr;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};

        insertionSort(arr);
        printArray(arr);
    }
}
