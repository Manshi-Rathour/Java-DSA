package Array;

public class PairInSortedRotated {
    static boolean pairInSortedRotated(int[] arr, int x){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=1; j<n; j++){
                if(arr[i] + arr[j] == x){
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {11, 15, 6, 8, 9, 10};
        int sum = 16;
        System.out.println(pairInSortedRotated(arr, sum));

        int[] arr1 = {11, 15, 26, 38, 9, 10};
        int sum1 = 45;
        System.out.println(pairInSortedRotated(arr1, sum1));
    }
}
