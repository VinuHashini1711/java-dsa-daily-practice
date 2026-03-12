package Leetcode;
import java.util.Scanner;
class TwoSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int left = 0;
        int right = n - 1;
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                System.out.println(left + " " + right);
                return;
            }
            else if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println("No pair found");
    }
}