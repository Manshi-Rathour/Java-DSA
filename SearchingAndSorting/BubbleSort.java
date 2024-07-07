package SearchingAndSorting;

public class BubbleSort {
    public static void printArray(int[] arr){
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 3, 2};
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        printArray(arr);
    }
}
