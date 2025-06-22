package SearchingAndSorting;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] agrs){
        int[] arr = {1, 7, 23, 4, 50, 6};
        int target = 50;

        int idx = linearSearch(arr, target);

        if(idx == -1){
            System.out.println(target + " is not found");
        }
        else{
            System.out.println(target + " is found at index " + idx);
        }
    }
}
