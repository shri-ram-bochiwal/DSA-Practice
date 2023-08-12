
/**
 * Given a list of N words, find the shortest unique prefix to represent each word in the list.
 * NOTE: Assume that no word is the prefix of another. In other words, the representation is always possible
 */

import java.util.*;

public class ShortestUniquePrefix {

    class TrieNode {
        int count;
        HashMap<Character, TrieNode> map;

        TrieNode() {
            this.count = 0;
            this.map = new HashMap<>();
        }
    }

    public void insert(String A, TrieNode root) {
        TrieNode tmp = root;

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            if (tmp.map.containsKey(ch)) {
                tmp = tmp.map.get(ch);
                tmp.count++;
            } else {
                TrieNode newNode = new TrieNode();
                tmp.map.put(ch, newNode);
                tmp = newNode;
                tmp.count++;
            }
        }
    }

    public String search(String A, TrieNode root) {
        TrieNode temp = root;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            if (temp.map.containsKey(ch)) {
                if (temp.count == 1) {
                    break;
                } else {
                    sb.append(ch);
                    temp = temp.map.get(ch);
                }
            }
        }
        return sb.toString();
    }

    public String[] prefix(String[] A) {
        String[] result = new String[A.length];
        TrieNode root = new TrieNode();

        for (int i = 0; i < A.length; i++) {
            insert(A[i], root);
        }

        for (int i = 0; i < A.length; i++) {
            result[i] = search(A[i], root);
        }

        return result;
    }

    public static void main(String[] args) {
        String[] input1 = { "zebra", "dog", "duck", "dove" };
        String[] input2 = { "apple", "ball", "cat" };

        ShortestUniquePrefix solution = new ShortestUniquePrefix();

        System.out.println(
                "Result For [\"zebra\", \"dog\", \"duck\", \"dove\"] : " + Arrays.toString(solution.prefix(input1)));
        System.out.println("Result For [\"apple\", \"ball\", \"cat\"] : " + Arrays.toString(solution.prefix(input2)));
    }

}
