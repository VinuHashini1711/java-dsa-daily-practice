/*
219 - Contains Duplicate II
    Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array
     such that nums[i] == nums[j] and abs(i - j) <= k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: falsepackage Leetcode.SlidingWindow;
 */
import java.util.*;
public class containsDuplicateII_219 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(set.contains(arr[i])){
                System.out.print(true);
                return;
            }
            set.add(arr[i]);
            if(set.size()>k) {
                set.remove(arr[i - k]);
            }
        }
        System.out.print(false);
    }
}
