package Leetcode.TwoPointerApproach;
import java.util.*;
public class TwoSumII_167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int left=0;
        int right=arr.length-1;
        //Return the indices of the target and increment them by 1
        while(left<right){
            int sum=arr[left]+arr[right];
        if(sum==target){
            System.out.print(Arrays.toString(new int[]{left +1,right+1}));
            return;
        }else if(sum<target){
            left++;
        }else{
            right--;
        }
        }
        System.out.print(Arrays.toString(new int[]{-1,-1}));

    }
}
