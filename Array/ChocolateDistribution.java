package Array;

import java.util.Arrays;
/*
Given an array of N integers where each value represents the number of chocolates in a packet.
Each packet can have a variable number of chocolates.
There are m students, the task is to distribute chocolate packets such that:

Each student gets one packet.
The difference between the number of chocolates in the packet with maximum chocolates
and the packet with minimum chocolates given to the students is minimum.

Example:
Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3
Output: Minimum Difference is 2
Explanation:
We have seven packets of chocolates and we need to pick three packets for 3 students
If we pick 2, 3 and 4, we get the minimum difference between maximum and minimum packet sizes.
*/

public class ChocolateDistribution {
    public static int chocolateDistribution(int arr[], int m) {
        // Check base case
        if(arr.length==0 || m==0){
            return 0;
        }
        // Sort the array
        Arrays.sort(arr);
        // Check if there are enough packets for the given number of students
        if(arr.length - 1 < m){
            return -1;
        }
        // Initialize minimum difference to the maximum possible integer value
        int min_diff = Integer.MAX_VALUE;

        for (int i=0; i<arr.length; i++){
            // Calculate the ending index of the current window
            int nextWindow = i + m -1;
            // Break if the window goes beyond the bounds of the array
            if(nextWindow >= arr.length){
                break;
            }
            // Calculate the difference between the last and first elements in the window
            int diff = arr[nextWindow] - arr[i];
            // Update the minimum difference if a smaller difference is found
            min_diff = Math.min(min_diff, diff);
        }

        return min_diff;
    }

    public static void main(String[] args) {

        int arr[] = {7,3,2,4,9,12,56};
        int m = 3;
        int min_diff = chocolateDistribution(arr, m);
        System.out.println(min_diff);
    }
}
