package Leetcode;
import java.util.Arrays;
class SortColors_75 {
    public static void sortColors(int[] nums) {

        int zero = 0;
        int one = 0;
        int two = 0;

        // Count 0s, 1s, and 2s
        for (int num : nums) {
            if (num == 0) {
                zero++;
            } else if (num == 1) {
                one++;
            } else {
                two++;
            }
        }

        int index = 0;

        // Fill 0s
        while (zero > 0) {
            nums[index++] = 0;
            zero--;
        }

        // Fill 1s
        while (one > 0) {
            nums[index++] = 1;
            one--;
        }

        // Fill 2s
        while (two > 0) {
            nums[index++] = 2;
            two--;
        }
    }

    public static void main(String[] args) {

        int[] nums = {2, 0, 2, 1, 1, 0};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(nums));

        sortColors(nums);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(nums));
    }
}