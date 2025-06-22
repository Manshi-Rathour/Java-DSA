package Array;

public class FindMinNumOfMergeOperationsToMakeArrayPalindrome {
    public static int findMinOpe(int[] arr){
        int ans = 0;
        int n = arr.length;

        // start from two corners
        for(int i=0, j=n-1; i<=j;){
            // if corner elements are same then problem reduces
             if(arr[i]==arr[j]){
                 i++;
                 j--;
             }
             // If left element is greater, then we merge right two elements
             else if(arr[i] > arr[j]){
                 // need to merge from tail
                 j--;
                 arr[j] = arr[j] + arr[j+1];
                 ans++;
             }
             // else merge left two elements
             else{
                 i++;
                 arr[i] = arr[i] + arr[i-1];
                 ans++;
             }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 9, 1};
        System.out.println(findMinOpe(arr));
    }
}
