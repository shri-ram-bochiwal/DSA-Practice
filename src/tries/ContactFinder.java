/*
 * We want to make a custom contacts finder applications as part of our college project. The application must perform two types of operations:
 * Type 1: Add name B[i] ,denoted by 0 in vector A where B[i] is a string in vector B denoting a contact name. This must store B[i] as a new contact in the application.
 * Type 2: Find partial for B[i] ,denoted by 1 in vector A where B[i] is a string in vector B denoting a partial name to search the application for. It must count the number of contacts starting with B[i].
 * You have been given sequential add and find operations. You need to perform each operation in order.
 * And return as an array of integers, answers for each query of type 2(denoted by 1 in A) .
 */

import java.util.*;

public class ContactFinder {

    class TrieNode {
        int count;
        HashMap<Character, TrieNode> map;

        TrieNode() {
            this.count = 0;
            this.map = new HashMap<>();
        }
    }

    public void insert(TrieNode root, String str) {
        TrieNode tmp = root;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

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

    public int searchPfxCount(TrieNode root, String str) {
        TrieNode temp = root;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (temp.map.containsKey(ch)) {
                temp = temp.map.get(ch);
            } else {
                return 0;
            }

        }

        return temp.count;
    }

    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<String> B) {
        ArrayList<Integer> ans = new ArrayList<>();
        TrieNode root = new TrieNode();

        for (int i = 0; i < B.size(); i++) {
            String val = B.get(i);
            if (A.get(i) == 0) {
                insert(root, val);
            }

            else {
                ans.add(searchPfxCount(root, val));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(0);
        list1.add(1);
        list1.add(1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("hack");
        list2.add("hacker");
        list2.add("hac");
        list2.add("hak");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(0);
        list3.add(1);

        ArrayList<String> list4 = new ArrayList<>();
        list4.add("abcde");
        list4.add("abc");

        ContactFinder solution = new ContactFinder();

        System.out.println("Result For : " + solution.solve(list1, list2));
        System.out.println("Result For : " + solution.solve(list3, list4));
    }
}
