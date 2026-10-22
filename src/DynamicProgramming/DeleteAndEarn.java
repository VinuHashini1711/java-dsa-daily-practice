package DynamicProgramming;
import java.util.Arrays;

    public class DeleteAndEarn {

        public static int deleteAndEarn(int[] nums) {
            int max = 0;

            for (int num : nums) {
                max = Math.max(max, num);
            }

            int[] points = new int[max + 1];

            for (int num : nums) {
                points[num] += num;
            }

            int prev2 = 0;
            int prev1 = 0;

            for (int i = 1; i <= max; i++) {
                int current = Math.max(prev1, prev2 + points[i]);

                prev2 = prev1;
                prev1 = current;
            }

            return prev1;
        }

        public static void main(String[] args) {
            int[] nums1 = {3, 4, 2};
            int[] nums2 = {2, 2, 3, 3, 3, 4};

            System.out.println("Input: " + Arrays.toString(nums1));
            System.out.println("Maximum points: " + deleteAndEarn(nums1));

            System.out.println("Input: " + Arrays.toString(nums2));
            System.out.println("Maximum points: " + deleteAndEarn(nums2));
        }
    }