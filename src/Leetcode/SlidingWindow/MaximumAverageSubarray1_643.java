package Leetcode.SlidingWindow;
import java.util.*;
public class MaximumAverageSubarray1_643 {
    public static double findMaxAverage(int[] nums, int k) {

        int windowSum = 0;

        // Calculate the sum of the first window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        // Slide the window
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i];      // Add the new element
            windowSum -= nums[i - k];  // Remove the leftmost element

            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum / k;
    }

    public static void main(String[] args) {

        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        double result = findMaxAverage(nums, k);

        System.out.println("Maximum Average = " + result);
    }
}

