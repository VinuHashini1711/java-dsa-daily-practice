package INFOSYS_PREP;
import java.util.*;
public class LastDigitPower_GFG {

    public static int power(String a,String b){
        if(b.equals("0") && a.equals("1")){
            return 1;
        }
        int lastDigit= a.charAt(a.length() - 1)-'0';
        int rem=0;
        for(int i=0;i<b.length();i++){
            rem=((rem*10)+b.charAt(i)-'0')%4;
        }
        if(rem==0){
            return 4;
        }
        int res=1;
        for(int i=0;i<rem;i++){
            res*=lastDigit;
        }
        return res%10;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a =sc.nextLine();
        String b=sc.nextLine();
        int ans=power(a,b);
        System.out.print(ans);
    }
}