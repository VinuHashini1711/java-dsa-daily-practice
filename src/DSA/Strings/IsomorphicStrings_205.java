package DSA.Strings;
import java.util.*;
public class IsomorphicStrings_205 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       /*a= egg b= add  e->a g->d   so true
       a=f11 b=b12 f->b,1->1 but 2nd 1!->2 ...false
        */
        String s=sc.nextLine();
        String t=sc.nextLine();
        if(s.length()!=t.length()){
            System.out.print(false);
        }
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if (map.containsKey(ch1)) {
                if (map.get(ch1) != ch2) {
                    System.out.println(false);
                    return;
                }
            } else {
                if (set.contains(ch2)) {
                    System.out.println(false);
                    return;
                }
                map.put(ch1, ch2);
                set.add(ch2);
            }
        }
        System.out.println(true);
    }
}
