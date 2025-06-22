package SearchingAndSorting;

public class MergeSort {
    public static void mergeSort(int[] arr, int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }
    public static void merge(int[] arr, int si, int mid, int ei){
        int[] temp = new int[ei-si+1];
        int i = si; // idx for 1st sorted part
        int j = mid+1; // idx for 2nd sorted part
        int k = 0; // idx for temp arr

        while(i <= mid && j<= ei){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // for leftover element of 1st sorted part
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        // for leftover element of 2st sorted part
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        // copying temp to original arr
        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;

        mergeSort(arr, 0, 5);

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
