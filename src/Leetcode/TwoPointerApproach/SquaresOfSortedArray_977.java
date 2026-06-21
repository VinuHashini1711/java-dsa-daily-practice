package Leetcode.TwoPointerApproach;
import java.util.*;
public class SquaresOfSortedArray_977 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size: ");
        //input array[-4, 2,3,5,8]
        int n=sc.nextInt();
        System.out.print("Enter the array elements: ");
        int arr[]=new int[n];
        //original array unsorted squared values
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //to store the resultant without modifying the original array
        int[] ans=new int[n];

        int left=0;
        int right=n-1;
        int index=n-1;
        while(left<=right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[index]=arr[left]*arr[left];
                left++;
            }else{
                ans[index]=arr[right]*arr[right];
                right--;
            }
            index--;
        }
        System.out.print("Squared sorted elements of the array are : ");
        System.out.print(Arrays.toString(ans));
    }
}
