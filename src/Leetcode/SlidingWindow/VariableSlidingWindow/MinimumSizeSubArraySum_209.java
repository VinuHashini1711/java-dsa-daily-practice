/*209. Minimum Size Subarray Sum
Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.Example 1:
        Input: target = 7, nums = [2,3,1,2,4,3]
        Output: 2
        Explanation: The subarray [4,3] has the minimal length under the problem constraint.
        Example 2:
        Input: target = 4, nums = [1,4,4]
        Output: 1
        Example 3:
        Input: target = 11, nums = [1,1,1,1,1,1,1,1]
        Output: 0
*/
package Leetcode.SlidingWindow.VariableSlidingWindow;
import java.util.*;
public class MinimumSizeSubArraySum_209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int left = 0;
        int sum = 0;
        int ans = nums.length + 1;
        for (int right = 0; right < n; right++) {
            sum += nums[right];
            while (sum >= target) {
                int len = right - left + 1;
                ans = Math.min(ans, len);
                sum -= nums[left];
                left++;
            }
        }
        if (ans == nums.length + 1) {
            System.out.print(0);
        }
        System.out.print(ans);
    }
}
