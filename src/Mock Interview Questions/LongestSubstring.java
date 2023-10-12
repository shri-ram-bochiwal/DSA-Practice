import java.util.*;


public class LongestSubstring {

    public int longestSubstring(String A, int k){
        int n = A.length();
        return solve(A, k, 0, n);
    }

    public int solve(String A, int k, int start, int end){
        if(end - start  < k){
            return 0;
        }

        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = start; i<end; i++){
            char ch = A.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }

        for(int i = start; i<end; i++){
            char ch = A.charAt(i);
            if(hm.get(ch) >= k){
                continue;   
            }

            int left = solve(A, k, start, i);
            int right = solve(A, k, i+1, end);

            return Math.max(left, right);
        }

        return end - start;
    }

    public static void main(String[] args){
        String str1 = "aabbba";
        int target1 = 3;
        String str2 = "ababacb";
        int target2 = 3;

        LongestSubstring solution = new LongestSubstring();
        System.out.println("Result For A = \"aabbba\", k = 3 : " + solution.longestSubstring(str1, target1));
        System.out.println("Result For A = \"ababacb\", k = 3 : " + solution.longestSubstring(str2, target2));
    }

}
