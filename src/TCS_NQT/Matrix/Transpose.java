package TCS_NQT.Matrix;
import java.util.*;
public class Transpose {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int matrix[][]={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int n=matrix.length;
        transposeMatrix(n,matrix);
    }
    public static int[][] transposeMatrix(int n,int matrix[][]){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int row[]:matrix){
                for(int x:row){
                    System.out.print(x+" ");
                }
                System.out.println();


        }
        return matrix;
    }
}
