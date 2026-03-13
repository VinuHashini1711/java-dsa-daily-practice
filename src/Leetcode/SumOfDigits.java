package Leetcode;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // input number
        int sum = 0;
        int product = 1;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            product = product * digit;
            n = n / 10;
        }

        int result = product - sum;
        System.out.println(result);
    }
}