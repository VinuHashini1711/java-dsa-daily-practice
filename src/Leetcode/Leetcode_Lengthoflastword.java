package Leetcode;

import java.util.Scanner;

public class Leetcode_Lengthoflastword {
    public static int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        // Skip trailing spaces
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        int start = end;
        // Move until space or beginning
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }
        return end - start;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();
        int result = lengthOfLastWord(s);
        System.out.println("Length of last word: " + result);
        sc.close();
    }
}

