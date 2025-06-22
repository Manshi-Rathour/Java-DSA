package SearchingAndSorting;

public class QuickSort {
    static void quickSort(int arr[], int si, int ei)
    {
        if(si >= ei){
            return;
        }
        int pi = partition(arr, si, ei);
        quickSort(arr, si, pi-1);
        quickSort(arr, pi+1, ei);
    }
    static int partition(int arr[], int si, int ei)
    {
        int pivot = arr[ei];
        int i = si - 1;

        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;

    }
    public static void main(String[] args) {
        int[] arr = {9, 6, 5, 10, 7, 2, 3, 11};
        int si = 0;
        int ei = arr.length - 1;

        quickSort(arr, si, ei);

        for(int element : arr){
            System.out.print(element + " ");
        }

    }
}
