package Leetcode.Strings;
import java.util.*;
public class StringMatchingInAnArray_1408{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        List<String> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (i != j && words[j].contains(words[i])) {
                    ans.add(words[i]);
                    break;
                }
            }
        }

        System.out.println(ans);

        sc.close();
    }
}