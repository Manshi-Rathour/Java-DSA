package SearchingAndSorting;

public class QuickSort {
    static void quickSort(int arr[], int low, int high)
    {
        if(low < high){
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = low - 1;

        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;

    }
    public static void main(String[] args) {
        int[] arr = {9, 6, 5, 10, 7, 2, 3, 11};
        int low = 0;
        int high = arr.length - 1;

        quickSort(arr, low, high);

        for(int element : arr){
            System.out.print(element + " ");
        }

    }
}
