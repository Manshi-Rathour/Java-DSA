package Sorting;

public class MergeSort {

    public static void conquer(int[] arr, int si, int mid, int ei){
        int[] merged = new int[ei-si+1];
        int i1 = si;
        int i2 = mid+1;
        int x = 0;

        while(i1 <= mid && i2 <= ei){
            if(arr[i1] <= arr[i2]){
                merged[x++] = arr[i1++];
            }
            else{
                merged[x++] = arr[i2++];
            }
        }

        while(i1 <= mid){
            merged[x++] = arr[i1++];
        }
        while(i2 <= ei){
            merged[x++] = arr[i2++];
        }

        for (int i = 0; i < merged.length; i++) {
            arr[si + i] = merged[i];
        }
    }
    public static void divide(int[] arr, int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;

        divide(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
