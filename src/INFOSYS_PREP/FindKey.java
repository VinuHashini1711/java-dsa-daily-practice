/*
Find Key Asked in wipro..
extract the 100th place digit from a
extract the 10th place digit from b
extract the largest digit from c
Return sum= a * b - c;
 */

package INFOSYS_PREP;
import java.util.*;
public class FindKey {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int hundred=(a/100)%10;
        int ten=(b/10)%10;
        int max=0;
        while(c>0){
            int digit=c%10;
            if(digit>max){
                max=digit;
            }
            c/=10;
        }
        System.out.print(hundred * ten - max);

    }
}
