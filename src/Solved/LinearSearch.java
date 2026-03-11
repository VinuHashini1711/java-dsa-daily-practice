package Solved;
import java.util.*;
class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();      // size of array
        int[] arr = new int[n];

        // read array elements
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();   // element to search
        int position = -1;

        // linear search
        for(int i = 0; i < n; i++){
            if(arr[i] == target){
                position = i;
                break;
            }
        }

        System.out.println(position);
    }
}