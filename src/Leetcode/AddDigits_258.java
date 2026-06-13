package Leetcode;
import java.util.*;
public class AddDigits_258 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    while(n>=10){
        int sum=0;
        while(n!=0){
            int digits=n%10;
            sum+=digits;
            n=n/10;
        }
        n=sum;
    }
System.out.print(n);
}
}