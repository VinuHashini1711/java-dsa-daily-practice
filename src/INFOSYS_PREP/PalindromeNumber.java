package INFOSYS_PREP;
import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int reverse=0;
        if(temp<0){
            System.out.print("False");
        }
        while(temp>0){
            int digit=temp%10;
            reverse=reverse*10+digit;
            temp/=10;
        }
        if(n!=reverse){
            System.out.print(n +" is not a Palindrome Number");
            return;
        }
        System.out.print(n+" is a Palindrome Number");
    }
}
