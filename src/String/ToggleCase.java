/**
 * You are given a character string A having length N, consisting of only
 * lowercase and uppercase latin letters.
 * You have to toggle case of each character of string A. For e.g 'A' is changed
 * to 'a', 'e' is changed to 'E', etc.
 */

public class ToggleCase {

    public String solve(String A) {
        char ar[] = A.toCharArray();
        for (int i = 0; i < ar.length; i++) {

            if (ar[i] >= 'A' && ar[i] <= 'Z') {
                ar[i] = (char) (ar[i] + 32);
            } else {
                ar[i] = (char) (ar[i] - 32);
            }
        }

        String ans = new String(ar);
        return ans;
    }

    public static void main(String[] args) {
        String input1 = "Hello";
        String input2 = "tHiSiSaStRiNg";

        ToggleCase solution = new ToggleCase();
        System.out.println("Result For A = \"Hello\" : " + solution.solve(input1));
        System.out.println("Result For A = \"tHiSiSaStRiNg\" : " + solution.solve(input2));
    }

}
