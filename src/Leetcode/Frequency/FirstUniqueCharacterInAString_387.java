package Leetcode.Frequency;
import java.util.*;
public class FirstUniqueCharacterInAString_387 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    //i/p: "Leetcode" --> first unique character is l so o/p: return its index which is 0
    String s=sc.next();
    int freq[]=new int[26];
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        freq[c - 'a']++;
    }
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(freq[c-'a']==1){
            System.out.print(i);
            return;
        }
    }
    System.out.print(-1);
}

}
