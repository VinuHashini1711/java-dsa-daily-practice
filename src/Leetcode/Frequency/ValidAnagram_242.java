package Leetcode.Frequency;
import  java.util.*;
public class ValidAnagram_242 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        if (s1.length() != s2.length()) {
            System.out.println("False");
            return;
        }
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            freq1[c -'a']++;
        }
        for(int i=0;i<s2.length();i++){
            char c=s2.charAt(i);
            freq2[c -'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq1[i]!=freq2[i]){
                System.out.print("False");
                return;
            }
        }
        System.out.print("True");
    }
}
