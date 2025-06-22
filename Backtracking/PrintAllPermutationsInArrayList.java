package Backtracking;
import java.util.*;


public class PrintAllPermutationsInArrayList {
    public static void helper(int[] nums, List<Integer> perm, List<List<Integer>> result){
        if (nums.length == 0) {
            result.add(new ArrayList<>(perm));
            return;
        }

        for(int i=0; i<nums.length; i++){
            int currElement = nums[i];

            // Create a new array excluding the current element
            int[] newNums = new int[nums.length - 1];
            for(int j=0, k=0; j<nums.length; j++){
                if(j != i){
                    newNums[k++] = nums[j];
                }
            }
            // Add the current element to the current permutation
            perm.add(currElement);
            // Recurse with the new array and the updated permutation
            helper(newNums, perm, result);
            // Backtrack by removing the current element from the permutation
            perm.remove(perm.size() - 1);
        }
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(nums, new ArrayList<>(), result);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = permute(nums);
        for (List<Integer> perm : result) {
            System.out.println(perm);
        }
    }
}
