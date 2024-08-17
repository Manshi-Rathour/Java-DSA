package Hashing;

import java.util.HashSet;

public class Intersection2Arrays {
    public static int intersection(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int num : arr1){
            set.add(num);
        }

        for(int num : arr2){
            if(set.contains(num)){
                count++;
                set.remove(num);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 6, 2, 4};

        System.out.println(intersection(arr1, arr2));
    }
}
