package Leetcode.Strings;
import java.util.*;
public class WordPattern_290 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read the pattern
        String pattern = sc.nextLine();
        // Read the sentence
        String s = sc.nextLine();

        // Split the sentence into individual words
        String[] words = s.split(" ");

        // If the number of words and pattern length are different,
        // they can never follow the same pattern.
        if (pattern.length() != words.length) {
            System.out.println(false);
            return;
        }

        // Stores Character -> Word mapping
        HashMap<Character, String> map = new HashMap<>();

        // Stores already used words
        HashSet<String> set = new HashSet<>();

        // Traverse the pattern and words together
        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String word = words[i];

            // Character already has a mapping
            if (map.containsKey(ch)) {

                // Existing mapping doesn't match current word
                if (!map.get(ch).equals(word)) {
                    System.out.println(false);
                    return;
                }

            } else {

                // Word already mapped to another character
                if (set.contains(word)) {
                    System.out.println(false);
                    return;
                }

                // Create new mapping
                map.put(ch, word);

                // Mark the word as used
                set.add(word);
            }
        }

        // All mappings are valid
        System.out.println(true);
    }
}