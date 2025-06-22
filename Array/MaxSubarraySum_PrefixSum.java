package Array;

public class MaxSubarraySum_PrefixSum {
    static void maxSubarraySum(int[] nums){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int[] prefixArr = new int[nums.length];

        // calculate prefix array
        prefixArr[0] = nums[0];
        for(int i=1; i<prefixArr.length; i++){
            prefixArr[i] = prefixArr[i-1] + nums[i];
        }

        for(int i=0; i<nums.length; i++){
            int start = i;
            for(int j=i; j<nums.length; j++){
                int end = j;

                currSum = start == 0 ? prefixArr[end] : prefixArr[end] - prefixArr[start-1];

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum is: " + maxSum);
    }
    public static void main(String[] args) {
        int[] nums = {1, -2, 6, -1, 3};
        maxSubarraySum(nums);
    }
}
