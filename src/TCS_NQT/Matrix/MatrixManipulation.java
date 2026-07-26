package TCS_NQT.Matrix;
import java.util.*;
public class MatrixManipulation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            arr[i][i]++;
            arr[i][n-i-1]--;
        }
        for (int i = 0; i < n; i++) {
            int min = arr[i][0];
            for (int j = 1; j < n; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
            for (int j = 0; j < n; j++) {
                arr[i][j] = arr[i][j] - min;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
    }
}