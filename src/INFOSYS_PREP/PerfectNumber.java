package INFOSYS_PREP;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=1;
        for(int i=2;i*i<=n;i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }
        if (sum == n)
            System.out.println(n + " is a Perfect Number");
        else
            System.out.println(n + " is not a Perfect Number");
    }
}
