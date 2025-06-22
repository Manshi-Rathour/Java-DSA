package SearchingAndSorting;

import java.util.ArrayList;

public class FindCommonElementsInThreeSortedArray {
    public static void findIntersection(int[] arr1, int[] arr2, int[] arr3){
        ArrayList<Integer> result = new ArrayList<>();

        int i=0, j=0, k=0;

        while(i < arr1.length && j < arr2.length && k < arr3.length){
            if(arr1[i] == arr2[j] && arr2[j] == arr3[k]){
                result.add(arr1[i]);
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            }
            else {
                k++;
            }
        }

        Integer[] commonElements = result.toArray(new Integer[0]);
        for(int element : commonElements){
            System.out.print(element + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 10, 20, 40, 80};
        int[] arr2 = {6, 7, 20, 80, 100};
        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};

        System.out.print("Common elements are: ");
        findIntersection(arr1, arr2, arr3);
    }
}
