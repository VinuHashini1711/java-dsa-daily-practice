package Leetcode.TwoPointerApproach;
import java.util.*;
public class ContainerWithMostWater_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height[] = new int[n];
        for(int i = 0; i < n; i++){
            height[i] = sc.nextInt();
        }
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right){
            int currArea =
                    (right-left) *
                            Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, currArea);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        System.out.println(maxArea);
    }
}