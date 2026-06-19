package Leetcode.Frequency;
import java.util.*;
public class FindTheDifference_389 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        int freq1[]=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            freq1[c-'a']++;
        }
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            freq1[c-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq1[i]!=0){
                System.out.print((char)(i+'a'));
                return;
                    }
                }
                System.out.print(' ');
            }
        }
