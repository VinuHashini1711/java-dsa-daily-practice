package Leetcode;
import java.util.Scanner;
public class Leetcode_MoveZeros {
    public static void moveZeros(int[] arr) {
        int index = 0;
        // Move non-zero elements to front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        // Fill remaining positions with zero
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        moveZeros(arr);
        System.out.println("Array after moving zeros:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}