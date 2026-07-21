package TCS_NQT.Matrix;
import java.util.*;
public class MatrixDiagonalSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i][i];
            if(i!=n-i-1){
                sum+=arr[i][n-i-1];
            }
        }
        System.out.print(sum);
    }
}
