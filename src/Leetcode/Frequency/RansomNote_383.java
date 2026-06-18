package Leetcode.Frequency;
import java.util.*;
public class RansomNote_383 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Ransom Value : ");
        String a=sc.next();
        System.out.print("Enter Magazine Value : ");
        String b=sc.next();
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            freq1[c-'a']++;
        }
        for(int i=0;i<b.length();i++){
            char c=b.charAt(i);
            freq2[c-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq1[i]>freq2[i]){
                System.out.print(false);
                return;
            }
        }
        System.out.print(true);
    }
}
