package Solved;
import java.util.Scanner;

//public class palindrome {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String rev = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            rev = rev + str.charAt(i);
//        }
//        if (str.equals(rev)) {
//            System.out.print("Palindrome");
//        } else {
//            System.out.print("Not a Palindrome");
//        }
//    }
class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char arr[]=str.toCharArray();
        String rev="";
        int i=0;
        int j=arr.length-1;
        boolean isPalindrome=true;
        while(i<j){
            if(arr[i]!=arr[j]){
                isPalindrome=false;
                break;
            }
            i++;
            j--;
        }
        if(isPalindrome){
            System.out.print("Palindrome");
        }
        else {
            System.out.print("Not a Palindrome");
        }
    }
}
