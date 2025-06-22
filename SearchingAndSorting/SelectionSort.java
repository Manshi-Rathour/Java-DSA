package SearchingAndSorting;

public class SelectionSort {
    public static void printArray(int[] arr){
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minPos]){
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 3, 2};

        selectionSort(arr);
        printArray(arr);
    }
}
