/**
 * You have given a string A having Uppercase English letters.
 * You have to find the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.
 */

public class SpecialSubsequences {
    public long solve(String A) {
        long ans = 0;
        int cnt = 0;
        for(int i = 0; i<A.length(); i++){
            char ch = A.charAt(i);
            if(ch == 'A'){
                cnt++;
            }
            if(ch == 'G'){
                ans = ans+cnt;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        SpecialSubsequences specialSubsequences = new SpecialSubsequences();
        System.out.println("Result For ABCGAG: " + specialSubsequences.solve("ABCGAG"));
        System.out.println("Result For GAB: " + specialSubsequences.solve("GAB"));
    }
}