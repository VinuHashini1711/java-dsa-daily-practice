package Solved;
import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();     // size of array
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int left = 0;
        int right = n - 1;
        int result = -1;

        while(left <= right){

            int mid = (left + right) / 2;

            if(arr[mid] == target){
                result = mid;
                break;
            }
            else if(arr[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

        System.out.println(result);
    }
}