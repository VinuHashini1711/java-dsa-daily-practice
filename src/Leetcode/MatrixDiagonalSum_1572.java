package Leetcode;
import java.util.*;
public class MatrixDiagonalSum_1572 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n and m elements: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        System.out.print("Enter the values: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        if (n != m) {
            System.out.print(false);
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
                sum += arr[i][i];
                sum += arr[i][n - i - 1];
        }
        if (n % 2 != 0) {
            sum -= arr[n / 2][n / 2];
        }
        System.out.print("The sum of the diagonal Elements is: "+sum);
    }
}
