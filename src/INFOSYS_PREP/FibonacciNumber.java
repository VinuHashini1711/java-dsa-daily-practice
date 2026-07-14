package INFOSYS_PREP;
import java.util.*;
public class FibonacciNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0){
            System.out.print(0);
        }if(n==1){
            System.out.print(1);
        }
        int first=0;
        int second=1;
        for(int i=2;i<=n;i++){
            int next=first+second;
            first=second;
            second=next;
            System.out.print(second+" ");
        }
    }
}
