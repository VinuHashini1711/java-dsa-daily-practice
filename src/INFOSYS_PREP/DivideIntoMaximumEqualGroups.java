/*
Input Format
S :: STRING
The first line contains a string, S, denoting the string.
length(S) :: 1 -> 2 * 10^5

Sample Input 1:
zzzzz

Sample Output 1 :
5

Sample input 2:
ababcc

Sample Output 2:
2

Sample input 2:
abccdcabacda

Sample Output 2:
2
 */


package INFOSYS_PREP;
import java.util.*;
public class DivideIntoMaximumEqualGroups {
    public static int gcd(int a, int b){
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        HashMap<Character, Integer> map=new HashMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int ans=0;
        for(int f:map.values()){
            if(f>0){
                ans=gcd(ans,f);
            }
        }
        System.out.println(ans);
    }
}
