package SearchingAndSorting;

public class SortedAndRotatedArray {
    public static int sortedRotatedArray(int[] arr, int tar, int si, int ei){
        if(si > ei){
            return -1;
        }
        int mid = si + (ei-si)/2;

        // case FOUND
        if(arr[mid] == tar){
            return mid;
        }

        // mid on l1
        if(arr[si] <= arr[mid]){
            // case a: left
            if(arr[si] <= tar && tar <= arr[mid]){
                return sortedRotatedArray(arr, tar, si, mid-1);
            }
            // case b: right
            else{
                return sortedRotatedArray(arr, tar, mid+1, ei);
            }
        }
        // mid on l2
        else{
            // case c: right
            if(arr[mid] <= tar && tar <= arr[ei]){
                return sortedRotatedArray(arr, tar, mid+1, ei);
            }
            // case d: left
            else{
                return sortedRotatedArray(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(sortedRotatedArray(arr, 0, 0, arr.length-1));
    }
}
