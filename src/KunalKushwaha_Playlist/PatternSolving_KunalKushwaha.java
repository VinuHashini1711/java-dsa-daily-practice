package KunalKushwaha_Playlist;
import java.util.*;
public class PatternSolving_KunalKushwaha {
    /*
        *
        * * *
        * * * *
     */
    static void Pattern1(int n) {
        //print the no of lines (row)
        for (int row = 1; row <= n; row++) {
            //print no of col inside the row
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            //new line after each row
            System.out.println();
        }
    }
/*
***
**
*
 */
    static void Pattern2(int n) {
        //print the no of lines (row)
        for (int row = 1; row <= n; row++) {
            //print no of col inside the row
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            //new line after each row
            System.out.println();
        }
    }

    static void Pattern3(int n) {
        //print the no of lines (row)
        for (int row = 1; row <= n; row++) {
            //print no of col inside the row
            //both loops produces same o/p
            //upwards counting
//           for(int col=1;col<=n-row+1;col++){
            //decrementing counting
            for (int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            //new line after each row
            System.out.println();
        }
    }

    static void Pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    /*
*
**
***
****
***
**
*
        */
    //we can also use 2 loops to print the pattern
    //increasing apptern 1 loop and and decreasing pattern 1 loop
    //but time complexity O(n^2)

    static void Pattern5(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int stars;
            if (row <= n) {
                stars = row;
            } else {
                stars = 2 * n - row;
            }
            for (int col = 1; col <= stars; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void Pattern6(int n) {
        for (int row = 0; row <= 2 * n - 1; row++) {
            int stars;
            if (row <= n) {
                stars = row;
            } else {
                stars = 2 * n - row;
            }
            int spaces = n - stars;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for (int col = 0; col < 2*stars-1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void Pattern7(int n){
        for(int row=1;row<=n;row++){
            for(int space=0;space<n-row;space++){
                System.out.print(" ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col);
            }
            for(int col=2;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PatternSolving_KunalKushwaha.Pattern7(n);
    }
}
