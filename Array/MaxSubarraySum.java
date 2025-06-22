package Array;

public class MaxSubarraySum {
    static void maxSubarray(int[] nums){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                currSum = 0;
                for(int k=i; k<=j; k++){
                    currSum += nums[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum is: " + maxSum);
    }
    public static void main(String[] args) {
        int[] nums = {-1, 4, 6, 8, 10, -5, -7};
        maxSubarray(nums);
    }
}
