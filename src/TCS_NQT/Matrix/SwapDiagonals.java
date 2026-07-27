package TCS_NQT.Matrix;
import java.util.*;
public class SwapDiagonals {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[][] matrix = new int[n][n];
            // Input
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            // Swap diagonals
            for(int i = 0; i < n; i++) {
                int temp = matrix[i][i];
                matrix[i][i] = matrix[i][n - 1 - i];
                matrix[i][n - 1 - i] = temp;
            }

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
