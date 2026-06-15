package Leetcode;
import java.util.*;
public class ValidPalindrome_125 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase().replaceAll("[^a-z0-9]" , " ");
        System.out.print(s);
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                System.out.print("False");
            }
            left++;
            right--;
        }
        System.out.print("True");
    }

}
