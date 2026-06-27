package Leetcode;

import java.util.LinkedHashSet;
public class RemoveDuplicatesFromASortedArray_26 {
    public static int removeDuplicates(int[] nums) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int i = 0;

        for (int x : set) {
            nums[i++] = x;
        }

        return set.size();
    }

    public static void main(String[] args) {

        int[] nums = {1,1,2};

        int length = removeDuplicates(nums);

        System.out.println("Length = " + length);

        for(int i=0;i<length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}