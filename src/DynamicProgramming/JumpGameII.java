package DynamicProgramming;
import java.util.*;
public class JumpGameII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Solution solution = new Solution();
        int result = solution.jump(nums);
        System.out.println("Minimum jumps = " + result);
        sc.close();
    }
}

class Solution {
    public int jump(int[] nums) {
        int farthest = 0;
        int jumps = 0;
        int currEnd = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (i == currEnd) {
                jumps++;
                currEnd = farthest;
            }
        }

        return jumps;
    }
}