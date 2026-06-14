package Leetcode;
import java.util.*;
public class Count_DigitsDIvidedByNumber_2520 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int original=n;
    int count=0;
    while(n!=0){
        int digits=n%10;
        if(original%digits==0){
            count++;
        }
        n=n/10;
    }
    System.out.print(count);
}
}
