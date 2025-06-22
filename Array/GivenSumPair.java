package Array;

public class GivenSumPair {
    public static boolean pairInSortedRotated(int[] arr, int target ){
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {11, 15, 6, 8, 9, 10};
        System.out.println(pairInSortedRotated(arr, 6));
        System.out.println(pairInSortedRotated(arr, 16));
        System.out.println(pairInSortedRotated(arr, 15));
    }
}
