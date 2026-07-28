package TCS_NQT.Matrix;

import java.util.Scanner;

public class ToeplitzMatrix_766 {

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
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) {
                    System.out.println(false);
                }

            }
        }
            System.out.println(true);
        }
    }


