
/**
 * Given a string, str, the task is to remove all the duplicate adjacent characters from the given string.
 */

import java.util.*;

public class DuplicateAdjecent {

    public String solve(String A) {
        HashMap<Character, Integer> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            if (hm.get(ch) == 1) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String input1 = "azxxzy";
        String input2 = "aaccdd";

        DuplicateAdjecent solution = new DuplicateAdjecent();
        System.out.println("Result For A =  \"azxxzy\" : " + solution.solve(input1));
        System.out.println("Result For A = \"aaccdd\" : " + solution.solve(input2));
    }

}