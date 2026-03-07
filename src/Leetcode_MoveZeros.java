import java.util.Scanner;
public class Leetcode_MoveZeros {
    public static void moveZeros(int[] arr) {
        int index = 0;
        // Move non-zero elements to the front
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[index++] = arr[i];
            }
        }

        // Fill the rest with zeros
        while(index < arr.length){
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        moveZeros(arr);

        System.out.println("Array after moving zeros:");

        for(int num : arr){
            System.out.print(num + " ");
        }

        sc.close();
    }
}
//Approach 2

//import java.util.Scanner;
// class Leetcode_MoveZeros {
//        public void moveZeroes(int[] nums) {
//            int nonZeroIndex = 0;
//
//            for (int i = 0; i < nums.length; i++) {
//                if (nums[i] != 0) {
//                    nums[nonZeroIndex] = nums[i];
//                    nonZeroIndex++;
//                }
//            }
//
//            for (int i = nonZeroIndex; i < nums.length; i++) {
//                nums[i] = 0;
//            }
//        }
//    }
//}
