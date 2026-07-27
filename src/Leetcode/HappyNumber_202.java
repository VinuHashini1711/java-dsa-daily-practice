package Leetcode;
import java.util.*;
public class HappyNumber_202 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> set=new HashSet<>();
        while(n!=1){
            if(set.contains(n)){
                System.out.print(false);
                return;
            }
            set.add(n);
            int sum=0;
            while(n>0){
                int digit=n%10;
                sum+=digit*digit;
                n/=10;
            }
            n=sum;
        }
        System.out.print(true);

    }
}
