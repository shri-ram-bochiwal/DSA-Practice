
/**
 * Given an array A of N strings, return all groups of strings that are anagrams.
 * Represent a group by a list of integers representing the index(1-based) in the original list. Look at the sample case for clarification.
 * NOTE: Anagram is a word, phrase, or name formed by rearranging the letters, such as 'spar', formed from 'rasp'.
 */

import java.util.*;

public class Anagrams {

    public ArrayList<ArrayList<Integer>> solve(final List<String> A) {
        HashMap<String, ArrayList<Integer>> hm = new HashMap<>();
        for (int i = 0; i < A.size(); i++) {
            char[] ch = A.get(i).toCharArray();
            Arrays.sort(ch);
            String sortStr = new String(ch);
            if (hm.containsKey(sortStr)) {
                hm.get(sortStr).add(i + 1);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i + 1);
                hm.put(sortStr, list);
            }
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (String key : hm.keySet()) {
            ans.add(hm.get(key));
        }
        return ans;
    }

    public static void main(String[] args) {
        List<String> str1 = Arrays.asList("cat", "dog", "god", "tca");
        List<String> str2 = Arrays.asList("rat", "tar", "art");
        Anagrams solution = new Anagrams();
        System.out.println("Result For [\"cat\", \"dog\", \"god\", \"tca\"] : " + solution.solve(str1));
        System.out.println("Result For [\"rat\", \"tar\", \"art\"] : " + solution.solve(str2));
    }

}
