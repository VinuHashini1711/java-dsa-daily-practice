package INFOSYS_PREP;
import java.util.*;
public class RotateImage {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int degree=360;//degree
        int matrix[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int m=degree/90;
        while(m-- > 0){
            rotateMatrix(matrix);
        }
        System.out.println(Arrays.deepToString(matrix));
    }
    private static int[][] rotateMatrix(int[][] matrix){
        int n=matrix.length;
    int[][] temp=new int[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            temp[j][n-1-i]=matrix[i][j];
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            matrix[i][j]=temp[i][j];
        }
    }
    return matrix;
    }
}
