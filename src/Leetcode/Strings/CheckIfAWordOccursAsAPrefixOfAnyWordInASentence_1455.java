package Leetcode.Strings;

import java.util.Scanner;

public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence_1455 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String sentence = sc.nextLine();
    String searchWord = sc.nextLine();

    String[] words = sentence.split(" ");

    int ans = -1;

        for (int i = 0; i < words.length; i++) {
        if (words[i].startsWith(searchWord)) {
            ans = i + 1;
            break;
        }
    }

        System.out.println(ans);

        sc.close();
}
}