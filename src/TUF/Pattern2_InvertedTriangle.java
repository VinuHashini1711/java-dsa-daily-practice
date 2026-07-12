package TUF;
import java.util.*;
public class Pattern2_InvertedTriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                System.out.print("*");
                if(j!=i){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
