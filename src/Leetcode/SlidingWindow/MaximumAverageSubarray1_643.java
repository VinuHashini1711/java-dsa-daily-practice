package Leetcode.SlidingWindow;
import java.util.*;
public class MaximumAverageSubarray1_643 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int windowSum=0;
        for(int i=0;i<k;i++){
            windowSum += arr[i];
        }
        int maxSum=windowSum;
        for(int i=k;i<n;i++){
            windowSum+=arr[i];
            windowSum-=arr[i - k];
            maxSum=Math.max(maxSum,windowSum);
        }
        System.out.print((double) maxSum/k);
    }
}