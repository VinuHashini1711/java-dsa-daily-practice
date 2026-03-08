import java.util.*;

class SquaresOfSortedArray {

    public static int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while(left <= right){

            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if(leftSq > rightSq){
                result[index--] = leftSq;
                left++;
            } else {
                result[index--] = rightSq;
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array:");

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int[] result = sortedSquares(arr);

        System.out.println("Sorted Squares:");

        for(int num : result){
            System.out.print(num + " ");
        }
    }
}