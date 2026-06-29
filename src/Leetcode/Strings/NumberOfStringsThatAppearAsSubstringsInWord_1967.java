package Leetcode.Strings;
import java.util.*;
public class NumberOfStringsThatAppearAsSubstringsInWord_1967 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // an array of strings and an string input
        String word=sc.next();
        int n=sc.nextInt();
        String patterns[]=new String[n];
        for(int i=0;i<n;i++){
            patterns[i]=sc.next();
        }
        int ans=0;
        for(String p:patterns){
            if(word.contains(p)){
                ans++;
            }
        }
        System.out.print(ans);
    }
}

