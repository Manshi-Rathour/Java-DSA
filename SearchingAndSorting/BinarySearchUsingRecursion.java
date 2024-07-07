package SearchingAndSorting;

public class BinarySearchUsingRecursion {
    public static int binarySearch(int[] arr, int start, int end, int target){
        int mid = (start + end)/2;
        if(start > end){
            return -1;
        }
        if(target == arr[mid]){
            return mid;
        } else if (target < arr[mid]) {
            return binarySearch(arr, start, mid-1, target);
        }
        else{
            return binarySearch(arr, mid+1, end, target);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 15, 20, 24, 45, 50, 77};
        int target = 24;

        System.out.println(target + " is found at index " + binarySearch(arr, 0 , arr.length-1,target));
    }
}
